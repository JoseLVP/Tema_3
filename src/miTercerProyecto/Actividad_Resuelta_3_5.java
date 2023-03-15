package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_5 {

	public static void main(String[] args) {
		
		int numAleatorio1, numAleatorio2, num, Resultado, Contador=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			Contador++;
			
			numAleatorio1=(int)(Math.random()*100+1);
			numAleatorio2=(int)(Math.random()*100+1);
			
			Resultado = numAleatorio1 + numAleatorio2;
			
			System.out.println("El valor del primer numero es: " +numAleatorio1+ " y el valor del segundo es: " +numAleatorio2);
			
			System.out.print("Introduce el resultado de ambos numeros para seguir jugando -> ");
			num = sc.nextInt();
			
		} while (num == Resultado);

		System.out.println("Has jugado un total de " +(Contador-1)+ " veces; El resultado era -> " +Resultado);
		
	}
	
}
