package Scanner;

/*8.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Imprima no console true se o primeiro n�mero digitado � maior que 5 e o segundo n�mero menor que 10. Caso contr�rio imprima false.
 */
import java.util.Scanner;

public class Scanner8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo n�mero inteiro :");
		int numB = scanner.nextInt();
		if (numA >= 5 && numB <= 10) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scanner.close();
	}
}
