package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Propuesta_3_3 {

	public static void main(String[] args) {
		
		
		System.out.println("Introduce un numero para hacerle el Guarismo: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		while (num>0) {
			
			int unidad=num%10;
			System.out.print(unidad); 
			num/=10;
			
			
			
		}

	}

}
