package Logica;

import java.util.Date;

public class Curso {
	private Integer idCurso;
	private String titulo;
	private Date fechaInicio;
	private Integer creditosOtorgados;
	private Double costo;
	private boolean finalizado;
	
	private final int CANT_MAXIMA_DOCENTES = 2;
	
	private final int CANT_MAXIMA_ALUMNOS = 15;
	
	private int cantidadActualDocentes = 0;
	
	private int cantidadActualAlumnos = 0;
	
	public Curso() {
		
	}
	
	public Integer getId() {
		return idCurso;
	}

	public void setId(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Integer getCreditosOtorgados() {
		return creditosOtorgados;
	}

	public void setCreditosOtorgados(Integer creditosOtorgados) {
		this.creditosOtorgados = creditosOtorgados;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public int getCANT_MAXIMA_DOCENTES() {
		return CANT_MAXIMA_DOCENTES;
	}
	
	public int getCANT_MAXIMA_ALUMNOS() {
		return CANT_MAXIMA_ALUMNOS;
	}

	public int getCantidadActualDocentes() {
		return cantidadActualDocentes;
	}

	public void setCantidadActualDocentes(int cantidadActualDocentes) {
		this.cantidadActualDocentes = cantidadActualDocentes;
	}

	public int getCantidadActualAlumnos() {
		return cantidadActualAlumnos;
	}

	public void setCantidadActualAlumnos(int cantidadActualAlumnos) {
		this.cantidadActualAlumnos = cantidadActualAlumnos;
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
