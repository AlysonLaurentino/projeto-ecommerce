package br.com.projetoecommerce.model;

public enum Status {

	ATIVO, DESATIVO;

	public Status AlteraStatus(String status) {
		if (ATIVO.name() == status) {
			return ATIVO;
		} else {
			return DESATIVO;
		}

	}
}
