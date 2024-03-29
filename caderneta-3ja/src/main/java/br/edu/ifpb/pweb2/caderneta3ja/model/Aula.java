package br.edu.ifpb.pweb2.caderneta3ja.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TB_AULA")
public class Aula {
	// Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String assunto;
	private Date data;
	
	// Construtores
	public Aula(String assunto, Date data) {
		this.assunto = assunto;
		this.data = data;
	}
	public Aula() {}
	
	// Métodos getters e setters
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
}
