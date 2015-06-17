


    import java.util.Scanner;

	public class Switch 
	
	{
		
		private static Scanner scanner;
		public static void main(String[] args) {
			
		System.out.println("Los numeros deben sumar 20 , 30 o 40 usando 0,10");
		scanner = new Scanner(System.in);
	

			System.out.println("Ingresar el primer número");
			int nota = scanner.nextInt();
			System.out.println("Ingresar el segundo número");
			int nota1 = scanner.nextInt();
			System.out.println("Ingresar el primer número");
			int nota2 = scanner.nextInt();
			System.out.println("Ingresar el segundo número");
			int nota3 = scanner.nextInt();
			
			int total = (nota + nota1 + nota2 + nota3);
			
			switch (total) {
			
			case 40:
				System.out.println("Sobresaliente");
				break;
			
			case 30:
				System.out.println("Notable");
				break;
			
			case 20:
				System.out.println("Suficiente");
				break;
			
			default:
				System.out.println("Suspendido");  
				break;
			
			}

			System.out.print("mostrar el resultado:");
			System.out.println(total);
		}
	}


	
	  

