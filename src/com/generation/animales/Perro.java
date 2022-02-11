package com.generation.animales;

public class Perro extends Animal implements Mascota, Jugar {

	@Override
	public void jugar() {
		System.out.println("Jugandoo con el perro");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Corriendoo con el perro");
	}

	@Override
	public void baniar() {
		// TODO Auto-generated method stub
		System.out.println("Bañandoo al perro");
	}

	@Override
	public void moverLaColita() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugarConCajas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ensuciarse() {
		// TODO Auto-generated method stub
		
	}
	
}
