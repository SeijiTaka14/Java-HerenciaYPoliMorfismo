package com.generation.animales;

public class Gato extends Animal implements Mascota {

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy jugando en cajas");
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Estoy persiguiendo una luz");
	}

	@Override
	public void baniar() {
		// TODO Auto-generated method stub
		System.out.println("El agua me da amsiedad");
	}

}
