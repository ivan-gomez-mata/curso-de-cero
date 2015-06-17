


	
import java.util.Scanner;

public class ClaseIfElse {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		scanner = new Scanner(System.in);
		System.out.println("Escribe tu primera nota : ");
		String entrada = scanner.next();
		
		scanner = new Scanner(System.in);
        System.out.println("Escribe tu segunda nota : ");
		String entrada2 = scanner.next();
		
	//**creamos las dos entradas por teclado
	
	
		int c = Integer.parseInt(entrada) + Integer.parseInt(entrada2);
		//** sumamos los 2 valores y usamos Integer.parseInt() para convertir el valor de String a valor numerico
		
		if	(c <= 4)
		System.out.println("Has suspendido");
	//**si despues de if solo hay una linea no es necesairo ponerlo entre { }
		else
			System.out.println("Has aprobado");
    
	//**mismo caso que if

	System.out.println("Tu nota es " + c);
	}
}
