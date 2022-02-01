package br.com.projetoecommerce.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PromocaoProduto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float preco;
	@Enumerated(EnumType.STRING)
	private Status statusProduto;

	public PromocaoProduto() {

	}

	public PromocaoProduto(long id, long preco, String status) {
		super();
		this.id = id;
		this.preco = preco;
		this.statusProduto = statusProduto.AlteraStatus(status);
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

	public Long getId() {
		return id;
	}

}
