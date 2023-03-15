package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_1 {

	public static void main(String[] args) {
		
		int num, Cuadrado;
		
		boolean Par, Positivo;
		
		System.out.print("Introduce un numero para evaluar [Introduce 0 para terminar]-> ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while (num != 0) {
			
			Par = (num%2==0) ? true : false;
			
			Positivo = num>=1  ? true : false;
			
			Cuadrado =(int)Math.pow(num, 2);
			
			System.out.println("Datos Introducidos-> \nEl numero es par? -> " +Par);
			System.out.println("El numero introducido es positivo? -> " +Positivo);
			System.out.println("El cuadrado del numero introducido es -> " +Cuadrado);
			
			System.out.println("#################################################");
			System.out.print("Introduce el siguiente numero para Analizar -> ");
			num = sc.nextInt();
			
		}
		System.out.print("Se ha introducido el valor [ 0 ] y se ha dejado de analizar numeros");
	}

}
