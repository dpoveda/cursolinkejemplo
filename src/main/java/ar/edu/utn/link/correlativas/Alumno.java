package ar.edu.utn.link.correlativas;

import java.util.Collection;
import java.util.List;

public class Alumno {
	private String nombre;
	private List<Curso> cursos;
	private Collection<Materia> materiasAprobadas;
	
	
	//Genero el constructor con el que se va a inicializar alumno
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Genero los getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	public Collection<Materia> getMateriasAprobadas() {
		return materiasAprobadas;
	}
	public void setMateriasAprobadas(Collection<Materia> materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public void inscribir(Curso curso) {
		// TODO Auto-generated method stub
		
	}
	
	
}
