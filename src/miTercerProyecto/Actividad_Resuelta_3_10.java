package miTercerProyecto;

public class Actividad_Resuelta_3_10 {

	public static void main(String[] args) {
		
		
		int impar;
		
		for (int i = 1; i<=10; i++) {

			impar= (i * 2) -1;
			
			if (i == 1) {
				System.out.print("Los primeros 10 numeros impares son: ");
			}
			
			if (i == 10) {
				System.out.println(impar);
				break;
			}
			
			System.out.print(impar+ "-");
			
			}
		}
		
	}


