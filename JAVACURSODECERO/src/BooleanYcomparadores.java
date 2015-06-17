

	import java.util.Scanner;

	public class BooleanYcomparadores {
		
		private static Scanner scanner;
		private static Scanner scanner2;

		public static void main(String[] args) {

			scanner = new Scanner(System.in);
			System.out.print("Primera nota : ");
			int nota = scanner.nextInt();
			
			setScanner2(new Scanner(System.in));
			System.out.print("Segunda nota : ");
			int nota2 = scanner.nextInt();
			
			
			//**Comparación Símbolos java  
			//**     menor que         < 
			//**     mayor que         > 
			//**     igual a           == 
			//**     no igual a        != 
			//**     menor o igual a   <= 
			//**     mayor o igual a   >= 
			
			
			//**Operador lógico Simbolos Java  
			//**           y          && 
			//**           ó          || 
			//**          No           ! 


			boolean noAprobado=((nota + nota2)<=4)||((nota + nota2)>=5);
			if ((nota + nota2)<=4) {
				System.out.println(" Has suspendido");
			//**En el boolean tienes que poner un valor a partir del cual se declara
			//**si es verdader o falso comparandolo con otro que introducimos
				
			
			} 
			
			else
			
			{
				System.out.println("Has aprobado");
			
			}
			
			
			System.out.println("Tu nota es : " + "" + (nota + nota2));
			
		}

		public static Scanner getScanner2() {
			return scanner2;
		}

		public static void setScanner2(Scanner scanner2) {
			BooleanYcomparadores.scanner2 = scanner2;
		}



}
