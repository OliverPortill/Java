package controllers;

import models.Libro;

public class LibroControllers {
	
	public LibroControllers() {}
	
	public void guardarLibro(int Codigo, String Autor, String Titulo, int Año, String Estado, String Editorial) {
		Libro l =  new Libro(Codigo, Autor, Titulo, Año, Estado, Editorial);
	}
	}
