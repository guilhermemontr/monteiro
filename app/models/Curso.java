package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Curso extends Model{
	
	public String nome;
	public String descriçao;
	public String insta;

}
