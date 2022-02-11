package com.generation;

public class Cuadrado extends FiguraGeometrica {
	//con extends (clase), FiguraGeometrica es clase padre y cuadrado es clase hija. Se hereda
	
	public Cuadrado() {
		//se tiene que llamar al constructor padre de
		//FigGeo
		super("Cuadrado");
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return (getAlto() * getLargo());
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (getAlto() * 4);
	}
	
	
}
