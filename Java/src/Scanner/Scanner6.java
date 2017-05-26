package Scanner;

/*6.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console o resultado da divisão dos dois números.
 */
import java.util.Scanner;

public class Scanner6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1º número inteiro :");
		int num1 = scanner.nextInt();
		System.out.println("Digite 2º número inteiro :");
		int num2 = scanner.nextInt();
		int divisao = num1 / num2;
		{
			System.out.println("Resultado : " + divisao);
		}
		scanner.close();
	}
}
