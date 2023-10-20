package ifEelse;
import java.util.Scanner;
public class Exercicios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("indique um número: ");
		numero = scan.nextInt();
		
		if (numero > 0) {
			System.out.println("POSITIVO!");
		} else if (numero < 0) {
			System.out.println("NEGATIVO!");
		} else {
			System.out.println("ZERO!");
		}

	}

}
