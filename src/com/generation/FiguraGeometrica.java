package com.generation;

public abstract class FiguraGeometrica {
	//Clases abstractas; no puede generar objetos
	//Clases que pueden o no contener métodos abstractos
	
	//Método abstracto es un método que te dice 
	//qué hacer pero no te dice cómo hacerlo 
	
	
	//Atributos (encapsulado; private)
	private String nombre;
	private float alto;
	private float largo;
	
	//Constructor padre
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	//Encapsulamiento (getters y setters)
	
		//Nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
		//Alto
	public float getAlto() {
		return this.alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

		//Largo
	public float getLargo() {
		return this.largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	
	//Métodos
	public abstract float calcularArea(); 
	
	public abstract float calcularPerimetro();
	
}
