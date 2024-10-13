package Main;

import java.util.Scanner;

public class Triangle extends Shape{
	private float Side2;
	private float Side1;
	private float Side3;
	public Triangle(float side1,float side2,float side3) {
		this.Side1=side1;
		this.Side2=side2;
		this.Side3=side3;
	}
	public static void TriangleMohit() {
		Scanner reader=new Scanner (System.in);
		int side2=reader.nextInt();
		int side1=reader.nextInt();
		int side3=reader.nextInt();
	    float m= side1+side2+side3;
	    if(m==180) {
	    	System.out.println("mohit:"+m);
	}
	    else {
	    	System.out.println("wrong numbers");
	    }
	}
	public static void RectangleMasahat (){
		Scanner reader=new Scanner (System.in);
			float side1=reader.nextInt();
			int side2=reader.nextInt();
			int side3=reader.nextInt();
			float m=2*a/side1;
			float a=m*side2;
		   
		    
	
		System.out.println("Triangle masahat:"+a);
	}

}