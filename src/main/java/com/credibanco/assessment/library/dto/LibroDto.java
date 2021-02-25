package com.credibanco.assessment.library.dto;

public class LibroDto {
	
	public int id;
	
	public String strTitulo; 
	
	public int intAnio; 
	
	public String strGenero; 
	
	public int intNumPag;
	
	public EditorialDto editorial;
	
	public AutorDto  autor;

	
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

	public EditorialDto getEditorial() {
		return editorial;
	}

	public void setEditorial(EditorialDto editorial) {
		this.editorial = editorial;
	}

	public AutorDto getAutor() {
		return autor;
	}

	public void setAutor(AutorDto autor) {
		this.autor = autor;
	}

	

}
