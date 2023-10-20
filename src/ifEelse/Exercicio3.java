package ifEelse;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int ano = 0;
		System.out.println("Indique um ano: ");
		ano = scan.nextInt();
		
		if (ano%4 == 0 && !(ano%100 == 0)
				|| ano%4 == 0 && ano%100 == 0 && 
				ano%400 == 0) {
			System.out.println("BISSEXTO!");
			
		} else {
			System.out.println("NÃO É BISSEXTO!");
		}

	}

}
