package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_3 {

	public static void main(String[] args) {

		int num, numA;

		numA = (int) (Math.random() * 99 + 1);

		System.out.println("Introduce un numero [Pulsa -1 para Rendirte]: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		while (num != numA) {

			if (num > numA) {
				System.out.println("El numero introducido es Mayor que el que estamos buscando, prueba con uno menor");
			}

			if (num < numA) {
				System.out.println("El numero introducido es Menor que el que estamos buscando, prueba con uno mayor");
			}

			System.out.println("##################");
			System.out.println("Intentalo de nuevo");
			num = sc.nextInt();

			if (num == -1) {
				System.out.println("Te has rendido");
				break;
			}

		}

		if (num == -1) {

		} else {
			System.out.println("El juego ha terminado, has ganado, acertaste el numero");
		}

	}

}
