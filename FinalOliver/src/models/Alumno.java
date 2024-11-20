package models;

//1- En este se carga los datos que corresponden al alumno extrayendo de la calse perosna
public class Alumno extends Persona{
	String Institucion;
	Asignatura[] materias;
	
	public Alumno() {
	}
	

	public Alumno(String institucion, Asignatura[] materias) {
		super();
		Institucion = institucion;
		this.materias = materias;
	}

	public String getInstitucion() {
		return Institucion;
	}

	public void setInstitucion(String institucion) {
		Institucion = institucion;
	}

	public Asignatura[] getMaterias() {
		return materias;
	}

	public void setMaterias(Asignatura[] materias) {
		this.materias = materias;
	}
}
