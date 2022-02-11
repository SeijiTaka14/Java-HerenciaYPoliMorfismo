package com.generation;

public class Triangulo extends FiguraGeometrica {

	public Triangulo() {
		//se llama al constructor padre de FigGeo
		super("Triangulo");
	}
	
	//Polimorfismo
	@Override
	public float calcularArea() {
		return (getAlto() * getLargo()) / 2;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
