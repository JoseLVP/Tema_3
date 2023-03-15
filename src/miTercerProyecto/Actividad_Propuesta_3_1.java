package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Propuesta_3_1 {

	public static void main(String[] args) {

		int edad, edadMaxima, edadMinima;
		
		System.out.print("Introduce una edad a evaluar [-1 para terminar]-> ");
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		
		edadMaxima=edad;
		edadMinima=edad;
		
		while (edad !=-1) {
			
			if (edadMaxima < edad) {
				edadMaxima = edad;
			}
			
			if (edadMinima >edad) {
				edadMinima =edad;
			}
			
			System.out.println("La edad maxima es-> " +edadMaxima+ " Y la edad minima es-> " +edadMinima);
			System.out.print("Introduce una edad para volver a evaluar [-1 para terminar]-> ");
			edad = sc.nextInt();
		}
		
		System.out.println("Se ha escrito -1 y se ha terminado de Evaluar las edades");
		
		sc.close();
		}
	}


