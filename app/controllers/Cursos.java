package controllers;

import java.util.List;

import models.Curso;
import play.mvc.Controller;

		public class Cursos extends Controller{
			public static void form() {
				render();
			}
			
			public static void salvar(Curso p) {
				p.save();
				form();
			}
			
			public static void listar() {
				List<Curso> lista = Curso.findAll();
				render(lista);
			}
			
			public static void editar(Long id) {
				Curso eve = Curso.findById(id);
				renderTemplate("Curso/form.html", eve);
			}
			
			public static void deletar(Long id) {
				Curso eve = Curso.findById(id);
				eve.delete();
				
				listar();
				}
}
