package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_6 {

	public static void main(String[] args) {

		int numero;

		System.out.print("Introduce el numero maximo a contar -> ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();

		for (int i = 0; i <= numero; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
