package controllers;

import java.util.List;

import models.Esporte;
import play.mvc.Controller;

		public class Esportes extends Controller{
			public static void form() {
				render();
			}
			
			public static void salvar(Esporte p) {
				p.save();
				form();
			}
			
			public static void listar() {
				List<Esporte> lista = Esporte.findAll();
				render(lista);
			}
			
			public static void editar(Long id) {
				Esporte eve = Esporte.findById(id);
				renderTemplate("Esporte/form.html", eve);
			}
			
			public static void deletar(Long id) {
				Esporte eve = Esporte.findById(id);
				eve.delete();
				
				listar();
				}
}
