package br.com.projetoecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Loja {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeLoja;
	// validar nome
	private String descricao;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Endereco endereco;
	@ManyToMany(cascade = CascadeType.PERSIST)
	private List<Seguimento> seguimentos;
	// validar a qtd máxima
	@Enumerated(EnumType.STRING)
	private Status statusLoja;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Produto> produtos;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Proprietario> proprietarios;
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Telefone> telefones;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Login login;
	// foto id

	public Loja() {

	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Seguimento> getSeguimentos() {
		return seguimentos;
	}

	public void setSeguimentos(List<Seguimento> seguimentos) {
		this.seguimentos = seguimentos;
	}

	public Status getStatusLoja() {
		return statusLoja;
	}

	public void setStatusLoja(Status statusLoja) {
		this.statusLoja = statusLoja;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Proprietario> getProprietarios() {
		return proprietarios;
	}

	public void setProprietarios(List<Proprietario> proprietarios) {
		this.proprietarios = proprietarios;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Long getId() {
		return id;
	}

}
