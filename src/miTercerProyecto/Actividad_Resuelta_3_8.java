package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Resuelta_3_8 {

	public static void main(String[] args) {
		
		double num, Total=0, Media;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i<=10; i++) {
			
			System.out.println("Introduce la nota del Examen " +i+ " -> ");
			num = sc.nextDouble();
			
			Total=Total+num;
		}
		
		Media = Total/10;
		System.out.println("La nota Media de los Examenes es -> " +Media);
		sc.close();
	}

}
