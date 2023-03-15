package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_12 {

	public static void main(String[] args) {

		int Notas=0, Suspensos = 0, Media;

		for (int i = 1; i <= 5; i++) {

			System.out.print("Introduce la Nota del Alumno -> ");
			Scanner sc = new Scanner(System.in);
			Notas = sc.nextInt();

			if (Notas < 5) {

				Suspensos++;

			}
			
		}
		
		System.out.println("De todos los examenes Analizados, hay " +Suspensos+ " Examenes Suspensos ");

	}

}
