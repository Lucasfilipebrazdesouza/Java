package Scanner;

/*7.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * mprima no console true se o resultado da divisão dos dois número é par, e false caso o resultado da divisão seja ímpar.
 */
import java.util.Scanner;

public class Scanner7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1º número inteiro :");
		int num1 = scanner.nextInt();
		System.out.println("Digite 2º número inteiro :");
		int num2 = scanner.nextInt();
		int divisao = num1 / num2;
		if (divisao % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}
		scanner.close();

	}
}
