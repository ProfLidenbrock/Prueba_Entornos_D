package proyecto_prueba;


public class Prueba_funciones {

	/*
	static String hazMedia(float dato1, float dato2){
		float resultado = ((dato1 + dato2) / 2)
		String mensaje = "media = " + resultado;
		return (mensaje);
	}
	*/
	
	
	static float hazMedia(float dato1, float dato2){
		float resultado = ((dato1 + dato2) / 2);
		System.out.println("media = " + resultado);
		return resultado;
	}
	
	
	public static void main(String[] args){

		float examen1 = 4;
		float examen2 = 7;
		
		hazMedia (examen1, examen2);
		hazMedia (9, 6);
		hazMedia(10, 8);
		
	}
}
