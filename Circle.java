package Main;
import java.util.*;
public class Circle extends Shape{
	private float Mohit;
	private float Masahat;
	public Circle(float mohit,float masahat) {
		this.Mohit=mohit;
		this.Masahat=masahat;
		
	}
	public static void CircleMohit() {
		Scanner reader=new Scanner (System.in);
		int gotr=reader.nextInt();
		int shoa=gotr%2;
		int m=shoa*2;
		System.out.println("Circle Mohit:"+m);
	}
	public static void CircleMasahat() {
		Scanner reader=new Scanner(System.in);
		int gotr=reader.nextInt();
		int shoa=gotr%2;
		System.out.println("Circle masahat:"+shoa*shoa*3.14);
	}
public static void main(String[] args) {
	Scanner reader=new Scanner(System.in);
	Shape sh=new Shape(null, null);
	
	
}
}
