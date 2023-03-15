package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_11 {

	public static void main(String[] args) {
		
		long resultado=1, numero, PNumero, contador=1;
		
		System.out.print("Introduce un numero para calcular su Factorial -> ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		PNumero = numero;
		
		while (numero!=0) {
			
			resultado = resultado * numero;
			 
			if (contador==1) {
				
				System.out.print("El Factorial del numero -> " +numero+ " contiene los numeros: ");

			}
			
			if (numero==1) {
				System.out.println(numero);
				break;
			} 
			
				System.out.print(numero+ "-");
			
			
			contador++;
			numero--;
			
		}
			System.out.println();
			System.out.println("El resultado del Factorial del numero " +PNumero+ " es " +resultado);
			
			sc.close();
		

	}

}
