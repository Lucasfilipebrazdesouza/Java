package Scanner;

/*3.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
Imprima no console true se os dois n�mero s�o iguais ou false se s�o diferentes. */
import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite Numero Inteiro:");
		int numA = scanner.nextInt();
		System.out.println("Digite Numero Inteiro 2:");
		int numB = scanner.nextInt();
		if (numA == numB) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scanner.close();
	}
}
