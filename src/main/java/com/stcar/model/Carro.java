package com.stcar.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Carro {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "data_carro")	
	private LocalDateTime dateCar;
	
	
	private Boolean novo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_carro")
	private Tipo tipo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "recurso")
	private Recurso recursos;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="carro", fetch=FetchType.EAGER)
	private List<Row> rows = new ArrayList<Row>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public LocalDateTime getDateCar() {
		return dateCar;
	}

	public void setDateCar(LocalDateTime dateCar) {
		this.dateCar = dateCar;
	}

	public Boolean getNovo() {
		return novo;
	}

	public void setNovo(Boolean novo) {
		this.novo = novo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	

	public Recurso getRecursos() {
		return recursos;
	}

	public void setRecursos(Recurso recursos) {
		this.recursos = recursos;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}
	
	
	
	
	

}
