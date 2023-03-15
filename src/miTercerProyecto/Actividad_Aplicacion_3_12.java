package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Aplicacion_3_12 {

	public static void main(String[] args) {
		
		
		double valor0, valor1, valor2, valor3, valor4, Resultado;
		
		
		System.out.println("Introduce el valor binario para pasarlo a decimal");
		
		System.out.println();
		
		System.out.print("Introduce el primer valor ->");
		Scanner sc = new Scanner(System.in);
		valor0 = sc.nextInt();
		
		System.out.print("Introduce el segundo valor ->");
		valor1 = sc.nextInt();
		
		System.out.print("Introduce el tercer valor ->");
		valor2 = sc.nextInt();
		
		System.out.print("Introduce el cuarto valor ->");
		valor3 = sc.nextInt();
		
		System.out.print("Introduce el quinto valor ->");
		valor4 = sc.nextInt();
		
		Resultado = (Math.pow(2, 4)*valor4)+(Math.pow(2, 3)*valor3)+(Math.pow(2, 2)*valor2)+(Math.pow(2, 1)*valor1)+(Math.pow(2, 0)*valor0);
		
		System.out.println("El numero binario introducido es -> " +Resultado);
		
		sc.close();
		
		
		
		
	}

}
