package Scanner;

/*7.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * mprima no console true se o resultado da divis�o dos dois n�mero � par, e false caso o resultado da divis�o seja �mpar.
 */
import java.util.Scanner;

public class Scanner7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1� n�mero inteiro :");
		int num1 = scanner.nextInt();
		System.out.println("Digite 2� n�mero inteiro :");
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
