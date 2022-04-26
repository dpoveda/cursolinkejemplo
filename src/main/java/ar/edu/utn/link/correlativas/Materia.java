package ar.edu.utn.link.correlativas;

import java.util.Collection;

public class Materia {

	private String nombre;
	private Collection<Materia> correlativas;
	
	//constructor
	public Materia(String nombre) {
		super();
		this.nombre = nombre;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Materia> getCorrelativas() {
		return correlativas;
	}

	public void setCorrelativas(Collection<Materia> correlativas) {
		this.correlativas = correlativas;
	}


}
