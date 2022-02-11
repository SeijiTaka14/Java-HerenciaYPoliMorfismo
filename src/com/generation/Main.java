package com.generation;

public class Main {

	public static void main(String[] args) {
		// Herencia: cuando una clase hereda de otra;
		//esta tiene acceso a sus atributos y métodos
		
		

		//Genera un objeto de Cuadrado
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setAlto(14);
		cuadrado1.setLargo(14);
		System.out.println("El area del " + cuadrado1.getNombre() + " es " + cuadrado1.calcularArea());
		
		//Generar objeto de Triangulo
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(10);
		triangulo1.setLargo(15);
		System.out.println("El area del " + triangulo1.getNombre() + " es " + triangulo1.calcularArea());
		
		
	}

}
