package Scanner;

/*10.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Imprima no console o valor do resultado do primeiro n�mero elevado ao quadrado mais o segundo n�mero elevado ao quadrado.
 */
import java.util.Scanner;

public class Scanner10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo n�mero inteiro :");
		int numB = scanner.nextInt();
		int expoente = numA * numA + numB * numB;
		System.out.println("Resultado = " +expoente);

		scanner.close();
	}
}
