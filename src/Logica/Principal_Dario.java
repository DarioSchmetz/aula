package Logica;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal_Dario {
	public static void main(String[] args) {
		Curso curso = new Curso();
//curso.CantidadCurso("asignado");
		Docente docente = new Docente();
		curso.setTitulo("asignado");

		try {
			curso.setTitulo("asignado");

			JOptionPane.showMessageDialog(null, "tiene 15 alumno, es decir que el curso esta completo");

		} catch (NumberFormatException e) {
			JOptionPane.showConfirmDialog(null, "no ingreso la cantidad de numero");

		}
		try {
			docente.setTitulo("completo");
			docente.setId(1);
			JOptionPane.showMessageDialog(null, "tiene mas de dos curso");

		} catch (Exception e) {
			// TODO: handle exception
		}
       
	}
}
