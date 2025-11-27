package proyecto_prueba;

import java.util.Scanner;

public class Prueba_arrays {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		//int numeros_almacenados[] = {8, 33, 200, 150, 11};
		//System.out.println("Tenemos el numero: " + numeros_almacenados[1]);
		
		//String palabras[] = {"HOLA", "esto", "-ES-", " texto "};
		//System.out.println("Tenemos la palabra: " + palabras[2]);
		
		int valores[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce tu nota: ");
			int numero_leido = entrada.nextInt();
			
			valores[i] = numero_leido;
		}
	
		
		// muestro los valores
		for (int j = 0; j <= 5; j++) {
			System.out.println("elememento v[" + j + "] = " + valores[j]);
		}

	}

}
