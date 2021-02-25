package com.credibanco.assessment.library.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="editorial")
public class Editorial implements Serializable {

	
	@Id
	@Column(name ="id_editorial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name ="nombre")
	public String strNombre;
	
	@Column(name ="direccion_correspondencia")
	public String strDireccion;
	
	@Column(name ="telefono")
	public String strTelefono;
	
	@Column(name ="correo_electronico")
	public String strEmail;
	
	@Column(name ="maximo_libros")
	public int intMaxLibros;
		
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStrNombre() {
		return strNombre;
	}



	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}



	public String getStrDireccion() {
		return strDireccion;
	}



	public void setStrDireccion(String strDireccion) {
		this.strDireccion = strDireccion;
	}



	public String getStrTelefono() {
		return strTelefono;
	}



	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}



	public String getStrEmail() {
		return strEmail;
	}



	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}



	public int getIntMaxLibros() {
		return intMaxLibros;
	}



	public void setIntMaxLibros(int intMaxLibros) {
		this.intMaxLibros = intMaxLibros;
	}

	private static final long serialVersionUID = 1L;
}
