package controllers;

import java.util.List;

import models.Evento;
import play.mvc.Controller;

public class Eventos extends Controller{
	
	
	public static void form() {
		render();
	}
	
	public static void salvar(Evento p) {
		p.save();
		form();
	}
	
	public static void listar() {
		String termo = params.get("termo");
		
		List<Evento> lista;
		if(termo == null) {
			lista = Evento.findAll();
		}else {
			lista = Evento.find("nome like ?1 or descriçao like ?1", "%"+termo+"%").fetch();
		}
		
		render(lista);
	}
	
	public static void editar(Long id) {
		Evento eve = Evento.findById(id);
		renderTemplate("Eventos/form.html", eve);
	}
	
	public static void deletar(Long id) {
		Evento eve = Evento.findById(id);
		eve.delete();
		
		listar();
		}
}
