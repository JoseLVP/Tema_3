package miTercerProyecto;

import java.util.Scanner;

public class Actividad_Nivel_3_1 {

	public static void main(String[] args) {

		int EntradaAdulto, EntradaNiño, PrecioTotal, Seleccion, Confirmacion = 0, SeleccionPelicula = 0, Vuelta = 1;

		while (Vuelta == 1 && SeleccionPelicula != 9) {

			System.out.println();
			System.out.println("CinesPhilia - Menu Principal");
			System.out.println("****************************");
			System.out.println("**Indique que quiere hacer**");
			System.out.println();
			System.out.println("1.- Comprar Entradas \n2.- Salir");

			Scanner sc = new Scanner(System.in);
			Seleccion = sc.nextInt();

			if (Seleccion == 2) {
				Vuelta = 0;
			}

			while (Seleccion == 1 || Confirmacion == 2) {

				System.out.println("**Menu Principal**");
				System.out.println();
				System.out.println("Indique la Pelicula que quiere ver");
				System.out.println(
						"-> AVATAR: EL SENTIDO DEL AGUA[Seleccione 1]\n-> POKER FACE[Seleccione 2]\n-> M3GAN[Seleccione 3]-[+18]");
				System.out.println();
				System.out.println("-> Salir del Programa [Seleccione 9]");

				SeleccionPelicula = sc.nextInt();

				if (SeleccionPelicula == 9) {
					break;
				}

				while (SeleccionPelicula == 1 || Confirmacion == 3) {

					System.out.println("**AVATAR: EL SENTIDO DEL AGUA**");
					System.out.println("Indique el numero de entradas de Adulto - 6€");

					EntradaAdulto = sc.nextInt();

					System.out.println("Indique el numero de entradas de Niño - 4€");

					EntradaNiño = sc.nextInt();

					System.out.println("El importe total seria -> " + (EntradaAdulto * 6)
							+ "€ Por las entradas de Adulto y " + (EntradaNiño * 4) + "€ Por las entradas de Niño");
					System.out.println();

					PrecioTotal = (EntradaAdulto * 6) + (EntradaNiño * 4);

					System.out.println("El precio total de las entradas seria -> " + PrecioTotal
							+ "€ Para **AVATAR: EL SENTIDO DEL AGUA** \n Es Correcto? [1 - Correcto / 2 - Salir al Menu Principal / 3 - Cambiar Numero Entradas ]");

					Confirmacion = sc.nextInt();

					if (Confirmacion == 1) {
						System.out.println("***Imprimiendo Tickets***");
						System.out.println();
						break;
					}
					if (Confirmacion == 2) {
						break;
					}
				}

				while (SeleccionPelicula == 2 || Confirmacion == 3) {

					System.out.println("**POKER FACE**");
					System.out.println("Indique el numero de entradas de Adulto - 6€");

					EntradaAdulto = sc.nextInt();

					System.out.println("Indique el numero de entradas de Niño - 4€");

					EntradaNiño = sc.nextInt();

					System.out.println("El importe total seria -> " + (EntradaAdulto * 6)
							+ "€ Por las entradas de Adulto y " + (EntradaNiño * 4) + "€ Por las entradas de Niño");
					System.out.println();

					PrecioTotal = (EntradaAdulto * 6) + (EntradaNiño * 4);

					System.out.println("El precio total de las entradas seria -> " + PrecioTotal
							+ "€ Para **POKER FACE** \n Es Correcto? [1 - Correcto / 2 - Salir al Menu Principal / 3 - Cambiar Numero Entradas ]");

					Confirmacion = sc.nextInt();

					if (Confirmacion == 1) {
						System.out.println("***Imprimiendo Tickets***");
						System.out.println();
						break;
					}
					if (Confirmacion == 2) {
						break;
					}
				}

				while (SeleccionPelicula == 3 || Confirmacion == 3) {

					System.out.println("**M3GAN**");
					System.out.println("Indique el numero de entradas de Adulto - 6€");

					EntradaAdulto = sc.nextInt();

					System.out.println(
							"El importe total seria -> " + (EntradaAdulto * 6) + "€ Por las entradas de Adulto");
					System.out.println();

					PrecioTotal = (EntradaAdulto * 6);

					System.out.println("El precio total de las entradas seria -> " + PrecioTotal
							+ "€ Para ***M3GAN*** \n Es Correcto? [1 - Correcto / 2 - Salir al Menu Principal / 3 - Cambiar Numero Entradas ]");

					Confirmacion = sc.nextInt();

					if (Confirmacion == 1) {
						System.out.println("***Imprimiendo Tickets***");
						System.out.println();
						break;
					}
					if (Confirmacion == 2) {
						break;
					}
				}

			}
			sc.close();
		}

	}
}
