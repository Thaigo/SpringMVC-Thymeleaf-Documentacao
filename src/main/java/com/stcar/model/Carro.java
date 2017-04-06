package com.stcar.model;

import java.util.ArrayList;
import java.util.Date;
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

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Carro {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")	
	private Date dateCar;
	
	@Type(type="sim_nao")
	private Boolean novo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_carro")
	private Tipo[] tipo;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "recurso")
	private Recurso[] recurso;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="carro", fetch=FetchType.EAGER)
	private List<Row> rows = new ArrayList<Row>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateCar() {
		return dateCar;
	}

	public void setDateCar(Date dateCar) {
		this.dateCar = dateCar;
	}

	public Boolean getNovo() {
		return novo;
	}

	public void setNovo(Boolean novo) {
		this.novo = novo;
	}

	public Tipo[] getTipo() {
		return tipo;
	}

	public void setTipo(Tipo[] tipo) {
		this.tipo = tipo;
	}

	public Recurso[] getRecurso() {
		return recurso;
	}

	public void setRecurso(Recurso[] recurso) {
		this.recurso = recurso;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}
	
	
	
	
	

}
