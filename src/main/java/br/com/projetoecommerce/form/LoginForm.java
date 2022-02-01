package br.com.projetoecommerce.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.com.projetoecommerce.model.Login;

public class LoginForm {

	private String email;
	private String senha;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public Login converter() {
		String senhaCript = new BCryptPasswordEncoder().encode(senha);

		return new Login(email, senhaCript);
	}

	public UsernamePasswordAuthenticationToken converterLogin() {

		return new UsernamePasswordAuthenticationToken(email, senha);
	}

}
