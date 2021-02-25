package com.credibanco.assessment.library.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="libro")
public class Libro implements Serializable {

	@Id
	@Column(name ="id_libro")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_libro_gen" )
    @SequenceGenerator(name="sec_libro_gen", sequenceName="sec_libro",  allocationSize = 1)
	public int id;
	
	@Column(name ="titulo")
	public String strTitulo; 
	
	@Column(name ="anio")
	public int intAnio; 
	
	@Column(name ="genereo")
	public String strGenero; 
	
	@Column(name ="num_paginas")
	public int intNumPag;
	
	
	@JsonIgnoreProperties(value={"editorial", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_editorial")
	public Editorial editorial;
	
	@JsonIgnoreProperties(value={"autor", "hibernateLazyInitializer", "handler"}, allowSetters=true)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_autor")
	public Autor  autor;
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStrTitulo() {
		return strTitulo;
	}


	public void setStrTitulo(String strTitulo) {
		this.strTitulo = strTitulo;
	}


	public int getIntAnio() {
		return intAnio;
	}


	public void setIntAnio(int intAnio) {
		this.intAnio = intAnio;
	}


	public String getStrGenero() {
		return strGenero;
	}


	public void setStrGenero(String strGenero) {
		this.strGenero = strGenero;
	}


	public int getIntNumPag() {
		return intNumPag;
	}


	public void setIntNumPag(int intNumPag) {
		this.intNumPag = intNumPag;
	}

	
	public Editorial getEditorial() {
		return editorial;
	}


	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	private static final long serialVersionUID = 1L;
}
