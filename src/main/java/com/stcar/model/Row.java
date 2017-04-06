package com.stcar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Row {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private Variedade variedade;
	private Integer quantidade;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Variedade getVariedade() {
		return variedade;
	}

	public void setVariedade(Variedade variedade) {
		this.variedade = variedade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
