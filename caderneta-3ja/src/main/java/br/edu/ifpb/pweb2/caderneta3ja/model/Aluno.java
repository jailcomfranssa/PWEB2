package br.edu.ifpb.pweb2.caderneta3ja.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private String nome;
	private String matricula;
	
	@OneToOne(mappedBy = "aluno")
    private Usuario usuario;
	
	// Construtores
	public Aluno() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
