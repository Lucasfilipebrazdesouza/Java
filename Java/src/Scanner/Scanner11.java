package Scanner;

/*11.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console o resto do primeiro número digitado com o segundo número digitado, o multiplicando por 10.
 */
import java.util.Scanner;

public class Scanner11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro :");
		int numB = scanner.nextInt();
		double restoDivisao = numA % numB;
		double resultado = restoDivisao * 10;
		System.out.println("Resultado é " + resultado);

		scanner.close();
	}
}
  