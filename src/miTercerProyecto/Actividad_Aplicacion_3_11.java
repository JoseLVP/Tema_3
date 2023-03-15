package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Aplicacion_3_11 {

	public static void main(String[] args) {

		double Divisor, Cociente;
		int CocienteInt, Resto, Contador = 1;

		System.out.print("Introduce un numero decimal para pasarlo a binario -> ");
		Scanner sc = new Scanner(System.in);
		Divisor = sc.nextInt();

		while (Divisor >= 1) {

			Resto = 0;

			Cociente = (Divisor / 2);
			CocienteInt = (int) Cociente;

			if (Cociente - CocienteInt > 0) {
				Resto = 1;
			}

			if (Contador == 1) {
				System.out.print(
						"El numero introducido, traducido en Binario es [Se lee de Derecha a Izquierda] : <- " + Resto);
			}

			if (Contador > 1) {
				System.out.print(Resto);
			}
			Divisor = CocienteInt;
			Contador++;
		}
		System.out.print(" <- ");
		sc.close();
	}

}
