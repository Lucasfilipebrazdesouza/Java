package Scanner;

/*6.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Imprima no console o resultado da divis�o dos dois n�meros.
 */
import java.util.Scanner;

public class Scanner6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1� n�mero inteiro :");
		int num1 = scanner.nextInt();
		System.out.println("Digite 2� n�mero inteiro :");
		int num2 = scanner.nextInt();
		int divisao = num1 / num2;
		{
			System.out.println("Resultado : " + divisao);
		}
		scanner.close();
	}
}
