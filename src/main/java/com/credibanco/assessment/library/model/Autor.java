package com.credibanco.assessment.library.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="autor")
public class Autor implements Serializable{

	@Id
	@Column(name ="id_autor")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_autor_gen" )
    @SequenceGenerator(name="sec_autor_gen", sequenceName="sec_autor",  allocationSize = 1)
	public int id;
	
	@Column(name ="nombre_completo")
	public String strNomCompleto;
	
	@Column(name ="fecha_nacimiento")
	public Date dateNacimiento;
	
	@Column(name ="ciudad_procedencia")
	public String strCiudad;
	
	@Column(name ="correo_electronico")
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
