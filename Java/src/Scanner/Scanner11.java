package Scanner;

/*11.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Imprima no console o resto do primeiro n�mero digitado com o segundo n�mero digitado, o multiplicando por 10.
 */
import java.util.Scanner;

public class Scanner11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo n�mero inteiro :");
		int numB = scanner.nextInt();
		double restoDivisao = numA % numB;
		double resultado = restoDivisao * 10;
		System.out.println("Resultado � " + resultado);

		scanner.close();
	}
}
  