	
import java.util.Scanner;

	public class IntroducirPorTeclado {
	
	
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scanner = new Scanner(System.in);
		//**crea objeto scanner
		System.out.println("Escribe algo : ");
		
		String entrada = scanner.next();
		//**crea objeto entrada y le da valor escrito por teclado
		System.out.println("Has escrito : ");
		
		System.out.println(entrada);
		//**Resumido : System.out.println("has escrito : " + entrada);
	}
	}


