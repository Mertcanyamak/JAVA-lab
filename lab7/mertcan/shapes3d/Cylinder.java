package mertcan.shapes3d;
import mertcan.shapes.Circle;
public class Cylinder extends Circle {
	public int height;
	public int radius;

	public Cylinder() {
		this(5,10);
	}
	public Cylinder(int r) {
		this(r,10);
	}
	public Cylinder(int r,int h) {
		super(r);
		height = h;
		radius = r; height = h;
		System.out.println("Creating a cylinder with r = " + r + ", h = " + h);
		
		
	}
	@Override
	public double area() {
		return ((2 * Math.PI * radius) * height) + (2 * super.area()); 
	}
	
	public double volume() {
		return super.area() * height; 
	}
	
	@Override
	public String toString() {
		return "Height: " + height +  ", Radius: " + radius +
                ", Area: " + area() + ", Volume: " + volume();
	}

}