package Main;

import java.util.Scanner;

public class Rectangle extends Shape{
	private float Mohit;
	private float Masahat;
	public  Triangle(float mohit,float masahat) {
		this.Mohit=mohit;
		this.Masahat=masahat;
		
	}
	public static void CircleMohit() {
		Scanner reader=new Scanner (System.in);
		int tool=reader.nextInt();
		int arz=reader.nextInt();
		if(tool>arz) {
			int m=(tool + arz)*2;
		System.out.println("Reatangle Mohit:"+m);
	}
	}
	public static void RectangleMasahat() {
		Scanner reader=new Scanner(System.in);
		int tool=reader.nextInt();
		int arz=reader.nextInt();
		int m=tool*arz;
		if(tool>arz) {
			
	
		System.out.println("Reactangle masahat:"+m);
	}
}
}
