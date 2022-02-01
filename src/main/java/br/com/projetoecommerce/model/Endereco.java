package br.com.projetoecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String logradouto;
	private String numeroString;
	private String complemento;
	private String bairro;
	private String municipio;
	private String uf;
	private String cep;

	public Endereco() {

	}

	public Endereco(String logradouto, String numeroString, String complemento, String bairro, String municipio,
			String uf, String cep) {
		super();
		this.logradouto = logradouto;
		this.numeroString = numeroString;
		this.complemento = complemento;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
		this.cep = cep;
	}

	public String getLogradouto() {
		return logradouto;
	}

	public void setLogradouto(String logradouto) {
		this.logradouto = logradouto;
	}

	public String getNumeroString() {
		return numeroString;
	}

	public void setNumeroString(String numeroString) {
		this.numeroString = numeroString;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Long getId() {
		return id;
	}

}
