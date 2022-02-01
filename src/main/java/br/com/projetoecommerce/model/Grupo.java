package br.com.projetoecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<SubGrupo> subGrupo;

	public Grupo() {

	}

	public Grupo(String nome, List<SubGrupo> subGrupo) {
		super();
		this.nome = nome;
		this.subGrupo = subGrupo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<SubGrupo> getSubGrupo() {
		return subGrupo;
	}

	public void setSubGrupo(List<SubGrupo> subGrupo) {
		this.subGrupo = subGrupo;
	}

	public Long getId() {
		return id;
	}

}
