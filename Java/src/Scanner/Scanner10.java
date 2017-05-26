package Scanner;

/*10.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console o valor do resultado do primeiro número elevado ao quadrado mais o segundo número elevado ao quadrado.
 */
import java.util.Scanner;

public class Scanner10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro :");
		int numB = scanner.nextInt();
		int expoente = numA * numA + numB * numB;
		System.out.println("Resultado = " +expoente);

		scanner.close();
	}
}
