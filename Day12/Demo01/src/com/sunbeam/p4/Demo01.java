package com.sunbeam.p4;

interface Shape {

}

class Rectangle implements Shape {

}

class Circle implements Shape {

}

class Box<T extends Shape> {// Bounded Type parameter
	public T obj; // any type of data inside it

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Demo01 {
	public static void main(String[] args) {
		Box<Rectangle> b1 = new Box<Rectangle>();
		Box<Circle> b2 = new Box<Circle>();
		Box<Rectangle> b3 = new Box<>();
		Box<Shape> b4 = new Box<Shape>();
		b4.setObj(new Rectangle());

//		Box<Double> b4 = new Box<Double>(); // NOT OK
	}

}
