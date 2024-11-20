package models;

public class Asignatura {
	int Codigo;
	String Nombre;
	
	
	public Asignatura() {
	}

	public Asignatura(int codigo, String nombre) {
		super();
		Codigo = codigo;
		Nombre = nombre;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
}
