package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_9 {

	public static void main(String[] args) {
		
		int numero, resultado;
		
		System.out.println("Introduce un numero para ver su tabla de Multiplicar -> ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		for (int i = 1; i<=10; i++) {
			
			resultado = i * numero;
			System.out.println("El numero " +numero+ " multiplicado por " +i+ " da como resultado " +resultado);
			
		}
		sc.close();
	}

}
