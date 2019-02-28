package mertcan.main;
import  java.util.ArrayList ;
import  mertcan.shapes3d. * ;

public class Test3D {
	public static void main(String[] args) 
	{
       
	

        ArrayList<Cylinder> cylinders = new ArrayList<Cylinder>();
        Cylinder cylinder = new Cylinder();

        cylinders.add(cylinder);
        cylinders.add(new Cylinder(6,7));
        System.out.println("Cylinders: " + cylinders);
  

        ArrayList<Cube> cubes = new ArrayList<Cube>();
        Cube cube = new Cube();

        cubes.add(cube);
        cubes.add(new Cube(4));
        System.out.println("Cubes: " + cubes);
	}

}
