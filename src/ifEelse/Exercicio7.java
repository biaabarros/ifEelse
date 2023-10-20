package ifEelse;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double peso = 0;
		double altura = 0;
		double imc = 0;
		
		System.out.println("indique sua altura: ");
		altura = scan.nextDouble();
		
		System.out.println("indique seu peso: ");
		peso = scan.nextDouble();
		
		imc = altura/peso*peso;
		
		if(imc < 19) {
			System.out.println("abaixo do normal!");
		} else if (imc >= 19 && imc < 23.9) {
			System.out.println("NORMAL!");
		} else if (imc >= 24 && imc <= 28.9) {
			System.out.println("SOBREPESO!");
		} else if (imc >= 29 && imc <= 38.9) {
			System.out.println("OBESIDADE!");
		}

	}

}
