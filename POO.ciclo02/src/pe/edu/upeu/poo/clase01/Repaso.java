package pe.edu.upeu.poo.clase01;

public class Repaso {
	public static void main(String[] args) {
	
		Repaso r = new Repaso();
		
		// int(num entero) , double (num desimales)	
		int a = 25;
		int b = 144;
		
		
		
		//sirve para imprimir la consola
		System.out.println("La suma es: "+ r.sumar(a,b));
	
		System.out.println("Operaciones Logicas");
		/**
		 * And &&
		 * or || alt + 124
		 * negacion !
		 */
		System.out.println(!true);
	
		System.out.println("IGV: "+r.calcIGV(100));
	
		System.out.println("Calculando el IMC:");
		System.out.println("Su IMC es: "+r.calcIMC(74, 1.74));
	}
	
	
	public int sumar(int sum1, int sum2){
		
		return sum1 + sum2;
		
	}
	
	public double calcIGV(double monto){
		double igv = 18;
		
		return monto * igv /100;
		
	}
	public double calcIMC(double peso, double altura){
		
		return peso/Math.pow(altura,2);
		
	}
	
	
}
