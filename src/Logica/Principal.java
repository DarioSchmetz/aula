package Logica;

public class Principal {

	public static void main(String[] args) throws DocenteNoValido, AlumnoNoValido {
	
		/* Estos metodos estan definidos para ejecutar uno u otro.
		 * O sea, que hay que comentar el metodo que no se quiere
		 * ejecutar para probar el programa. Observar que estos
		 * metodos estan definidos fuera del metodo "main" y
		 * pertenecen a esta clase ( "Principal" ) */
		

		// Este metodo responde al punto 7 del examen. Si no se quiere ejecutar este, se debera comentar.
		ejecutarAsignacionDocenteACurso();
		
		// Este metodo responde al punto 8 del examen. Si no se quiere ejecutar este, se debera comentar.
		ejecutarAsignacionAlumnoACurso();
		
	}

	private static void ejecutarAsignacionDocenteACurso() {

		// Instanciamos tres cursos.
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Curso curso3 = new Curso();

		// Instanciamos un docente.
		Docente docente = new Docente();
		docente.setId(1);

		// Le damos un nombre a cada curso.
		curso1.setTitulo("Programacion");
		curso2.setTitulo("Fisica");
		curso3.setTitulo("Matematica");

		// Le damos un id a cada curso.
		curso1.setId(1);
		curso2.setId(2);
		curso3.setId(3);

		try {
			docente.asignarDocenteACurso(curso1);
			docente.asignarDocenteACurso(curso1);
			docente.asignarDocenteACurso(curso1);

		} catch (DocenteNoValido e) {
			System.out.println("Cantidad de docentes excedidos.");
			e.printStackTrace();
		}
	}

	private static void ejecutarAsignacionAlumnoACurso() {
		
		// Instanciamos 16 alumnos.
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno();
		Alumno a3 = new Alumno();
		Alumno a4 = new Alumno();
		Alumno a5 = new Alumno();
		Alumno a6 = new Alumno();
		Alumno a7 = new Alumno();
		Alumno a8 = new Alumno();
		Alumno a9 = new Alumno();
		Alumno a10 = new Alumno();
		Alumno a11 = new Alumno();
		Alumno a12 = new Alumno();
		Alumno a13 = new Alumno();
		Alumno a14 = new Alumno();
		Alumno a15 = new Alumno();
		Alumno a16 = new Alumno();
		
		// Instanciamos un curso.
		Curso curso1 = new Curso();
		
		// Le damos un nombre al curso.
		curso1.setTitulo("Programacion");
		
		// Le damos un id al curso.
		curso1.setId(1);
		
		// Le damos un id a cada a alumno.
		a1.setId(1);
		a2.setId(2);
		a3.setId(3);
		a4.setId(4);
		a5.setId(5);
		a6.setId(6);
		a7.setId(7);
		a8.setId(8);
		a9.setId(9);
		a10.setId(10);
		a11.setId(11);
		a12.setId(12);
		a13.setId(13);
		a14.setId(14);
		a15.setId(15);
		a16.setId(16);

		try {
			a1.asignarAlumnoACurso(curso1);
			a2.asignarAlumnoACurso(curso1);
			a3.asignarAlumnoACurso(curso1);
			a4.asignarAlumnoACurso(curso1);
			a5.asignarAlumnoACurso(curso1);
			a6.asignarAlumnoACurso(curso1);
			a7.asignarAlumnoACurso(curso1);
			a8.asignarAlumnoACurso(curso1);
			a9.asignarAlumnoACurso(curso1);
			a10.asignarAlumnoACurso(curso1);
			a11.asignarAlumnoACurso(curso1);
			a12.asignarAlumnoACurso(curso1);
			a13.asignarAlumnoACurso(curso1);
			a14.asignarAlumnoACurso(curso1);
			a15.asignarAlumnoACurso(curso1);
			a16.asignarAlumnoACurso(curso1);

		} catch (AlumnoNoValido e) {
			e.printStackTrace();
		}

	}
}
