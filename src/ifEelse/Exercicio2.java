package ifEelse;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("indique um número: ");
		numero = scan.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("PAR!");
		} else {
			System.out.println("IMPAR!");
		}
		scan.close();

	}

}
