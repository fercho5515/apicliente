package com.credibanco.assessment.library.dto;

import java.io.Serializable;
import java.util.Date;


public class AutorDto implements Serializable {

	public int id;
	
	public String strNomCompleto;
	
	public Date dateNacimiento;
	
	public String strCiudad;
	
	public String strEmail;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStrNomCompleto() {
		return strNomCompleto;
	}

	public void setStrNomCompleto(String strNomCompleto) {
		this.strNomCompleto = strNomCompleto;
	}

	public Date getDateNacimiento() {
		return dateNacimiento;
	}

	public void setDateNacimiento(Date dateNacimiento) {
		this.dateNacimiento = dateNacimiento;
	}

	public String getStrCiudad() {
		return strCiudad;
	}

	public void setStrCiudad(String strCiudad) {
		this.strCiudad = strCiudad;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	
	private static final long serialVersionUID = 1L;
}
