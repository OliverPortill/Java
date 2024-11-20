package models;

public class Persona {
	//1- Asignar los valores que comprende la clase persona
	
	private int Cedula;
	private String Nombre;
	private String Apellido;
	
	public Persona() {
	}
	
	//2- Inicializamos el constructor
	public Persona(int C) {
		setCedula(C);
		Nombre = new String("Desconocido");
		Apellido = new String("Desconocido");
	}
	
	public Persona(int C, String N, String A) {
		setCedula(C);
		setNombre(N);
		setApellido(A);
	}
	
	//3- Comprobar que la cedula sea mayor a 500.000
	public void setCedula(int C) {
	    if (C > 500000) {
	        Cedula = C; 
	    } else {
	        Cedula = 0;  
	        System.out.println("El número es menor a 500.000, así que se pone 0");
	    }
	}
	
	
	
	//4- Comprobamos que el nombre no quede como vacio para cuando el ususario lo cargue
	public void setNombre(String N) {
		if(N.equals("")) //4.1- Se comprueba que no quede en blanco
		{
			System.out.println("Nombre no valido, se asignó como Desconocido");
			Nombre = new String("Desconocido");
		}
		else Nombre = N;
	}

	
	//5- Comprobamos que el apellido no quede como vacio para cuando el ususario lo cargue
	public void setApellido(String A) {
		if(A.equals("")) //5.1- Se comprueba que no quede en blanco
		{
			System.out.println("Apellido no valido, se asignó como Desconocido");
			Apellido = new String("Desconocido");
		}
		else Apellido = A;
	}

	public int getCedula() {
		return Cedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	//6- Devuelve los datos que fueron cargados
	@Override
	public String toString() {
		return "Persona [Cedula=" + Cedula + ", Nombre=" + Nombre + ", Apellido=" + Apellido + "]";
	}
}
	