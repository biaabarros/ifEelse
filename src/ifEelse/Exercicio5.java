package ifEelse;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		
		int idade = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("indique sua idade: ");
		idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("PODE VOTAR");
		} else {
			System.out.println("NÃO PODE VOTAR");
		}

	}

}
