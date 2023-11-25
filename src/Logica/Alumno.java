package Logica;

public class Alumno {
	private Integer id;
	private Integer nroLegago;
	private String nombre;

	
	public Alumno() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNroLegago() {
		return nroLegago;
	}

	public void setNroLegago(Integer nroLegago) {
		this.nroLegago = nroLegago;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void asignarAlumnoACurso(Curso curso) throws AlumnoNoValido {
		
		if(curso.getCantidadActualAlumnos() >= curso.getCANT_MAXIMA_ALUMNOS()) {
			
			throw new AlumnoNoValido("El cupo del curso: " + curso.getId() + " esta cubierto. Imposible registrar su inscripcion.");
		}
		else {
			System.out.println("El alumno: " + this.id + " se agrego al curso: " + curso.getTitulo() + ".");
			System.out.println("");
			curso.setCantidadActualAlumnos(curso.getCantidadActualAlumnos() + 1);
			System.out.println("Ahora la cantidad de alumnos en el curso: "+ curso.getTitulo() + " es: " + curso.getCantidadActualAlumnos() + ".");
			System.out.println("");
		}
	}



}












