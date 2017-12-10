/*Encapsulation vs  Abstraction vs interfaces

Encapsulation is data hiding(information hiding) while Abstraction is detail hiding(implementation hiding).
While encapsulation groups together data and methods that act upon the data, data abstraction deals with exposing the interface to the user and hiding the details of implementation.*/

// Java program to illustrate the
// concept of Abstraction
abstract class Shape 
{
	String color;
	
	// these are abstract methods
	abstract double area();
	public abstract String toString();
	
	// abstract class can have constructor
	public Shape(String color) {
		System.out.println("Shape constructor called");
		this.color = color;
	}
	
	// this is a concrete method
	public String getColor() {
		return color;
	}
}
class Circle extends Shape
{
	double radius;
	
	public Circle(String color,double radius) {

		// calling Shape constructor
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.color + 
					"and area is : " + area();
	}
	
}
class Rectangle extends Shape{

	double length;
	double width;
	
	public Rectangle(String color,double length,double width) {
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}
	
	@Override
	double area() {
		return length*width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.color + 
						"and area is : " + area();
	}

}
//A simple interface
interface ImyTestClass
{
 // public and abstract 
 void display();
}

public class myTestClass implements ImyTestClass
{
	public void display() {
		System.out.println("I am fullstack developer");
	}
}
/*
New features added in interfaces in JDK 8

1.Prior to JDK 8, interface could not define implementation. We can now add default implementation for interface methods. This default implementation has special use and does not affect the intention behind interfaces.
Suppose we need to add a new function in an existing interface. Obviously the old code will not work as the classes have not implemented those new functions. So with the help of default implementation, we will give a default body for the newly added functions. Then the old codes will still work.
 2.Another feature that was added in JDK 8 is that we can now define static methods in interfaces which can be called independently without an object. Note: these methods are not inherited.
 Important points about interface:

We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
A class can implement more than one interface.
An interface can extends another interface (but only one interface).
A class that implements interface must implements all the methods in interface.
All the methods are public and abstract. And all the fields are public, static, and final.
It is used to achieve multiple inheritance.
It is used to achieve loose coupling.
 */
 
