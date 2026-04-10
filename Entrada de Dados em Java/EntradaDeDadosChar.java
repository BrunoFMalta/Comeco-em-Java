import java.util.Scanner;
public class EntradaDeDadosChar {
		
		public static void main (String [] args) {
					
		Scanner sc = new Scanner (System.in);
					
					
		char x;
		x = sc.next().charAt(0); //vai ler somente o primeiro caracter digitado
		System.out.println("Voce digitou: " + x);
					
				

	sc.close();
	
		}

}
