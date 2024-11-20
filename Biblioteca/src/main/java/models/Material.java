package models;

public abstract class Material {
	
	private int Codigo;
	private String Autor;
	private String Titulo;
	private int Año;
	private String Estado;
	
	public Material(int Codigo, String Autor, String Titulo, int Año, String Estado) {
		super();
		this.Codigo = Codigo;
		this.Autor = Autor;
		this.Titulo = Titulo;
		this.Año = Año;
		this.Estado = Estado;
	}
	
	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public int getAño() {
		return Año;
	}

	public void setAño(int año) {
		Año = año;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}


	@Override
	public String toString() {
		return "Material [Codigo=" + Codigo + ", Autor=" + Autor + ", Titulo=" + Titulo + ", Año=" + Año + ", Estado="
				+ Estado + "]";
	}
	
	
}
