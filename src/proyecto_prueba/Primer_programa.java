package proyecto_prueba;

public class Primer_programa {

	public static void main(String[] args) {
		
		int variable = 5;
		variable++;
		variable = variable + 10;
		System.out.println("Variable vale: " + variable);
		System.out.println("La raíz cuadrada de " + variable + " es: " + Math.sqrt(variable));

		int contador = 0;
		while (contador < 10) {
			System.out.println("El numero es: " + contador);
			contador++;
		}

	}

}
