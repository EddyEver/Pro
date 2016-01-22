package pe.edu.upeu.poo.practica01;

import java.util.Scanner;

public class Practica01 {
	public static void main(String[] args){
		
		Scanner num = new Scanner(System.in);
		System.out.println("Ingrese un numero :");
		int  n = num.nextInt();
		
		for (int i=1; i<n; i++){
			System.out.println((i*2)-1);
			
		}
	
	}
	
}
