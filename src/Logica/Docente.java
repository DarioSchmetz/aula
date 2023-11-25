package Logica;

import java.util.Date;

public class Docente {

	private Integer id;
	private Date FechaContratacion;
	private String titulo;
	private Double salario;
	
//	private final int cantidadMaximaCursos = 2;
	
	
	
	public Docente() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaContratacion() {
		return FechaContratacion;
	}

	public void setFechaContratacion(Date i) {
		FechaContratacion = i;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

//	public void setCantidadMaximaCursos(int cantidadMaximaCursos) {
//		this.cantidadMaximaCursos = cantidadMaximaCursos;
//	}
	
//	public int getCantidadMaximaCursos() {
//		return cantidadMaximaCursos;
//	}
	
	public void asignarDocenteACurso(Curso curso) throws DocenteNoValido {
		
		if(curso.getCantidadActualDocentes() >= curso.getCANT_MAXIMA_DOCENTES()) {
			
			throw new DocenteNoValido("El docente " + this.id + " ya cubre el cupo permitido de cursos.");
		}
		else {
			System.out.println("El docente: " + this.id + " se agrego al curso: " + curso.getTitulo() + ".");
			curso.setCantidadActualDocentes(curso.getCantidadActualDocentes() + 1);
			System.out.println("Ahora la cantidad de Cursos asignados es: " + curso.getCantidadActualDocentes() + ".");
		}
		
		
	}

	
}

