package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Aplicacion_3_13 {

	public static void main(String[] args) {

		int Hora, Minutos, Segundos, AñadirSegundos, RestoSegundos;

		System.out.print("Introduce la Hora actual [Horas] -> ");
		Scanner sc = new Scanner(System.in);
		Hora = sc.nextInt();

		System.out.print("Introduce la Hora actual [Minutos] -> ");
		Minutos = sc.nextInt();

		System.out.print("Introduce la Hora actual [Segundos] -> ");
		Segundos = sc.nextInt();

		while (Hora <= 24) {

			System.out.print("Introduce un valor en segundos para añadir al tiempo [Maximo 60 segundos] -> ");
			AñadirSegundos = sc.nextInt();

			Segundos = Segundos + AñadirSegundos;

			for (int i =1; i<=AñadirSegundos; i++) {
				Segundos++;
				
				if (Segundos>=59) {
					Segundos=0;
					Minutos++;
					
					if (Minutos>=59) {
						Minutos=0;
						Hora++;
						
						if (Hora>=24) {
							Hora=0;
							
						}
					}
					
				}
				
			} 
			
			
			System.out.println(
					"La hora actual es -> " + Hora + " Horas, " + Minutos + " Minutos, " + Segundos + " Segundos");

		}
		System.out.println("Has Alcanzado el dia siguiente");
		sc.close();

	}

}
