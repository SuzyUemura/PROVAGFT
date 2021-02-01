package Exercicio01;

import java.util.Scanner;
import java.lang.Math;

public class Bhaskara {
	 public static void main(String[] args) {
		 
		 double a, b, c;
		 Scanner ler = new Scanner (System.in);
	
		 a = ler.nextDouble();
	
		 b = ler.nextDouble();
		 
		 c = ler.nextDouble();

		 double delta = (b*b) - (4*a*c);
		 double raizDelta = Math.sqrt(delta);
		 double x1 = (- b + raizDelta) / (2*a);
		 double x2 = (- b - raizDelta) / (2*a);
		 
		 if (a == 0 || delta <0) {
			 System.out.println("Impossivel calcular");
		 } else {
		 System.out.printf("x1 = %.5f\n", x1);
		 System.out.printf("x2 = %.5f", x2);
		 }
	ler.close();
	}
}
