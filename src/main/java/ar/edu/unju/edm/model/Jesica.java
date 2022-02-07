package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Jesica {
	private int nroDocumento;
	private String nombre;
	private int edad;
	
	public Jesica() {
		// TODO Auto-generated constructor stub
	}

	public int getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Jesica [nroDocumento=" + nroDocumento + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
