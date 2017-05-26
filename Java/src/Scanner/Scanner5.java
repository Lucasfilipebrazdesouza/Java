package Scanner;

/*5.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console true se o resultado do primeiro número menos o segundo número é maior que 0 e false caso for menor igual a 0.
 */
import java.util.Scanner;

public class Scanner5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro :");
		int numB = scanner.nextInt();
		int soma = numA - numB;
		{
			if (soma > 0) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
			scanner.close();
		}
	}
}
