package pokemon;

import java.util.Scanner;

import java.util.Random;

public class Pokemon {
	Tipo tipo;
	String nombre;
	int nivel_vida;
	int poder_daño;
	int poder_defensa;
	int velocidad;
	
	public Pokemon() {}
	
	public Pokemon (Tipo t, String n, int nv, int pda, int pde, int v) {
		this.tipo = t;
		this.nombre = n;
		this.nivel_vida = nv;
		this.poder_daño = pda;
		this.poder_defensa = pde;
		this.velocidad = v;
	}
	
	public int atacar() {
		int valor = (int) (Math.random() * 100 % 10) + 1;
		return valor;
	}
	public boolean esquivar() {
		int valor = (int) (Math.random() * 100 % 2);
				if(valor == 0) {
					return true;
				}else {
					return false;
				}
				
	}
	public void set_vida(int v) {
		
	}
	public int get_vida(int v) {
		return 0;
	}
}