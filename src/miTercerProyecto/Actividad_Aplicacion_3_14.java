package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Aplicacion_3_14 {

	public static void main(String[] args) {
		
		
		int Numero;
		
		System.out.println("Introduce un numero -> ");
		Scanner sc = new Scanner(System.in);
		Numero = sc.nextInt();
		
		for (int i = 3; i!=Numero; i++) {
			
			if (i%2==0) {
				System.out.println("El numero " +i+ " No es Primo");
			}else {
				System.out.println("El numero " +i+ " Es Primo");
			}
			
			
		}
		

	}

}
