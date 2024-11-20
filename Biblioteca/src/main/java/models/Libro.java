package models;

public class Libro extends Material {
	private String Editorial;
	
	public Libro(int Codigo, String Autor, String Titulo, int Año, String Estado, String Editorial) {
		super(Codigo, Autor, Titulo, Año, Estado);
		this.setEditorial(Editorial);
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libro [Editorial=" + Editorial + ", getEditorial()=" + getEditorial() + ", getCodigo()=" + getCodigo()
				+ ", getAutor()=" + getAutor() + ", getTitulo()=" + getTitulo() + ", getAño()=" + getAño()
				+ ", getEstado()=" + getEstado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
