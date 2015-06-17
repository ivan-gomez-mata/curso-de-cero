
import java.util.Scanner;

public class TotalNotaClase {


	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		System.out.println("Programa para sumar todas las notas de clase y dar la media");
		scanner = new Scanner(System.in);

		int notaClase = 0;
		int nuevaNota = 0;
		int numeroAlumnos = 0;
//**se declaran todas las varibles necesarias
		
		while (nuevaNota >= 0) {
		
			System.out.println("Insertar una nueva nota a sumar o -1 para finalizar");
			nuevaNota = scanner.nextInt();
			
			if (nuevaNota > 0) {
				
				notaClase = notaClase + nuevaNota;
//** variable = variable + se usa para resumir todas las variables de las notas 
//**pq coge el valor anterior				

				numeroAlumnos++;
//** numeroAlumnos = numeroAlumnos + 1; es igual a la linea anterio
			
				
			}
	
		}
	
		System.out.println("Total: " + notaClase);
	    
		System.out.println("La nota media de la clase es :" + " " + (notaClase / numeroAlumnos));
	}

}


