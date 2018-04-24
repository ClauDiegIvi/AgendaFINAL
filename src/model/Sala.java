package model;

import java.util.List;

public class Sala {
	
	private String nombreAula;
	private List<Peticion> peticiones;
	
	public Sala() {}

	public Sala(String nombreAula, List<Peticion> peticiones) {
		super();
		this.nombreAula = nombreAula;
		this.peticiones = peticiones;
	}

	public String getNombreAula() {
		return nombreAula;
	}

	public void setNombreAula(String nombreAula) {
		this.nombreAula = nombreAula;
	}

	public List<Peticion> getPeticiones() {
		return peticiones;
	}

	public void setPeticiones(List<Peticion> peticiones) {
		this.peticiones = peticiones;
	}

	@Override
	public String toString() {
		return "Sala [nombreAula=" + nombreAula + ", peticiones=" + peticiones + "]";
	}
}
