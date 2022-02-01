package br.com.projetoecommerce.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Alyson Laurentino
 *
 */

@Entity
public class PromocaoPersonalizada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String descricao;
	private float valor;
	@Enumerated(EnumType.STRING)
	private Status statusPromoPersonalizada;
	// foto

	public PromocaoPersonalizada() {

	}

	public PromocaoPersonalizada(String titulo, String descricao, long valor, String status) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.valor = valor;
		this.statusPromoPersonalizada = statusPromoPersonalizada.AlteraStatus(status);

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

	public float getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public Status getStatus() {
		return statusPromoPersonalizada;
	}

}
