package mertcan.shapes3d;
import mertcan.shapes.Square;
public class Cube {
	
	 public Cube(){
	        this(5);
	    }

	    public Cube(int s){
	        super(s);
	        System.out.println("Cube is being create");
	    }

	    public double area(){
	        return 6 * super.area();
	    }

	    public double volume(){
	        return super.area() * side;
	    }

	    public String toString(){
	        return "Box area = "+ area() +
	                ", volume = " + volume();
	    }
}
