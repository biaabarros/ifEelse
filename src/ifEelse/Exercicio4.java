package ifEelse;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		System.out.println("Indique três números: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		
		if (n1 > n2 && n1 > 3) {
			System.out.println(n1 + " é o maior!");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " é o maior!");
		} else {
			System.out.println(n3 + " é o maior!");
		}

	}

}
