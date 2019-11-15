package br.edu.ifpb.pweb2.caderneta3ja.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "coordenador")
public class Coordenador  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private boolean ativo ;
	
	@OneToOne
    @JoinColumn(name = "professor", referencedColumnName = "id")
    private Professor professor;
	
	public Coordenador() {}

	public Coordenador(boolean ativo, long id) {
		super();
		this.ativo = ativo;
		this.id = id;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
		
}
