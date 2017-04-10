package com.stcar.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rows")
public class Row {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	@JoinColumn
	private Variedade variedade;
	
	@ManyToMany( mappedBy = "rows")
	private List<Carro> carros = new ArrayList<Carro>();
	
	
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

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}

	
	
	
	
	

}
