package com.stcar.model;

public enum Tipo {
	
	SEDAN("SEDAN"),
	HATCH("HATCH");
	
	private String nome;
	
	private Tipo(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	

}
