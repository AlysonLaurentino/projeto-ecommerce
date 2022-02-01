package br.com.projetoecommerce.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dd;
	private String telefone;
	@Enumerated(EnumType.STRING)
	private eWhatsApp eWhatsApp;

	public Telefone() {

	}

	public Telefone(String dd, String telefone) {
		super();
		this.dd = dd;
		this.telefone = telefone;
	}

	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public eWhatsApp geteWhatsApp() {
		return eWhatsApp;
	}

	public void seteWhatsApp(eWhatsApp eWhatsApp) {
		this.eWhatsApp = eWhatsApp;
	}

}
