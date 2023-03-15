package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_4 {

	public static void main(String[] args) {

		int Arbol, Etiqueta = 0, RecordArbol = 0, RecordEtiqueta = 0;

		System.out.println("Introduce la altura del Arbol [-1 para salir] -> ");
		Scanner sc = new Scanner(System.in);
		Arbol = sc.nextInt();

		while (Arbol != -1) {

			Etiqueta++;

			System.out.println("El Arbol introducido mide: " + Arbol + " cm y su etiqueta es: " + Etiqueta);

			if (RecordArbol < Arbol) {

				RecordArbol = Arbol;
				RecordEtiqueta = Etiqueta;
			}

			System.out.println("El Arbol record es: " + RecordArbol + " cm y su etiqueta es: " + RecordEtiqueta);

			Arbol = sc.nextInt();
			
		}
		
		sc.close();
	}

}
