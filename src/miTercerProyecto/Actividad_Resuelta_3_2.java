package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_2 {

	public static void main(String[] args) {
		
		double  Numero=0, Media=0;
		int edad, Mayores=0, Suma=0;
		
		
		System.out.print("Introduce la edad del Alumno [-1 para salir] -> ");
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		
		while (edad >=0 ) {
			
			Suma=Suma+edad;
			
			Numero++;
			
			Media = Suma / Numero;
			
			if (edad >= 18) {
				
				Mayores++;
				
			}
			
			System.out.println("La edad total de todos los alumnos es -> "+Suma);
			System.out.println("La media de edad de todos los alumnos es -> "+Media);
			System.out.println("El numero de alumnos analizados son -> " +Numero);
			System.out.println("De los alumnos analizados, son Mayores de edad -> " +Mayores);
			
			System.out.println("###################################################");
			System.out.print("Introduce la edad del siguiente Alumno [-1 para salir] -> ");
			edad = sc.nextInt();
			
			
		}
	
		System.out.print("Se ha introducido un [-1] y se ha dejado de analizar alumnos");
		sc.close();
	}

}
