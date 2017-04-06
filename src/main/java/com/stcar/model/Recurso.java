package com.stcar.model;

public enum Recurso {
	
	DIRECAO_ELETRICA("Direção Eletrica"),
	AR_CONDICIONADO("Ar Condicionado"),	
	FREIO_ABS("Freio ABS");
	
	public static final Recurso[] ALL = { DIRECAO_ELETRICA, AR_CONDICIONADO, FREIO_ABS };
	
	private String nome;
	
	private Recurso(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

		
	

}
