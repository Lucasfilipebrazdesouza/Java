package Scanner;

/*8.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console true se o primeiro número digitado é maior que 5 e o segundo número menor que 10. Caso contrário imprima false.
 */
import java.util.Scanner;

public class Scanner8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro :");
		int numB = scanner.nextInt();
		if (numA >= 5 && numB <= 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scanner.close();
	}
}
