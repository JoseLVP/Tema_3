package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_13 {

	public static void main(String[] args) {

		int Aprobados = 0, Condicionados = 0, Suspensos = 0;
		double notas, MediaA = 0, MediaC = 0, MediaS = 0, ATotal = 0, CTotal = 0, STotal = 0;

		for (int i = 0; i <= 5; i++) {

			System.out.print("Introduce la nota del Alumno -> ");
			Scanner sc = new Scanner(System.in);
			notas = sc.nextDouble();

			if (notas >= 5) {
				Aprobados++;
				ATotal = ATotal + notas;
				MediaA = ATotal / Aprobados;

			}

			if (notas < 5 && notas >= 4) {
				Condicionados++;
				CTotal = CTotal + notas;
				MediaC = CTotal / Condicionados;

			}

			if (notas < 4) {
				Suspensos++;
				STotal = STotal + notas;
				MediaS = STotal / Suspensos;
			}
			sc.close();

		}

		System.out.println();
		System.out.println("Tras analizar las notas, los datos que tenemos son los siguientes");
		System.out.println("La cantidad de alumnos Aprobados " + Aprobados + " Con una media de " + MediaA);
		System.out.println("La cantidad de alumnos Condicionados " + Condicionados + " Con una media de " + MediaC);
		System.out.println("La cantidad de alumnos Suspensos " + Suspensos + " Con una media de " + MediaS);

	}

}
