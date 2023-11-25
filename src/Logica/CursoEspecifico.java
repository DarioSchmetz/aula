package Logica;

public class CursoEspecifico extends Curso {
	
	private Integer creditosRequeridos;

	public CursoEspecifico() {
		super();
	}
	
	public Integer getCreditosRequeridos() {
		return creditosRequeridos;
	}

	public void setCreditoRequerido(Integer creditosRequeridos) {
		this.creditosRequeridos = creditosRequeridos;
	}

}