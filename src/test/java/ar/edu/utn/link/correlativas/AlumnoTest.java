package ar.edu.utn.link.correlativas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AlumnoTest {

		@Test
		public void testIncripcionOk() throws Exception {
			//precondicion
			Alumno alumno = new Alumno("Daniela");
			Curso curso = new Curso(new Materia("SO"), 2022);
			
			//operatoria
			alumno.inscribir(curso);
			
			//poscondicion
			assertTrue( curso.estaInscripto(alumno) );
		}
		
		
		public void testInscripcionFaltaCorrelativa() throws Exception {
			
		}
		
		public void testSeAbreLaMateriaCorrectamente() throws Exception {
			
		}

		public void testNoSeAbreLaMateriaCorrectamente() throws Exception {
	
		}
}
