package br.com.projetoecommerce.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String descricao;
	private float preco;
	@Enumerated(EnumType.STRING)
	private Status statusProduto;
	@OneToOne(cascade = CascadeType.PERSIST)
	private PromocaoProduto promocaoProduto;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Grupo grupo;
	// foto

	public Produto() {

	}

	public Produto(String titulo, String descricao, long preco, String statusProduto, PromocaoProduto promocaoProduto,
			Grupo grupo) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.preco = preco;
		this.statusProduto = this.statusProduto.AlteraStatus(statusProduto);
		this.promocaoProduto = promocaoProduto;
		this.grupo = grupo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(long preco) {
		this.preco = preco;
	}

	public Status getStatus() {
		return statusProduto;
	}

	public PromocaoProduto getPromocao() {
		return promocaoProduto;
	}

	public void setPromocao(PromocaoProduto promocaoProduto) {
		this.promocaoProduto = promocaoProduto;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Long getId() {
		return id;
	}

}
