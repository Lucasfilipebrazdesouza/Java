package Scanner;

/*4.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
Imprima no console true se o primeiro n�mero � maior que o segundo n�mero digitado.*/
import java.util.Scanner;

public class Scanner4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro:");
		int numA = scanner.nextInt();
		System.out.println("Digite um segundo n�mero inteiro);");
		int numB = scanner.nextInt();
		if (numA >= numB) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scanner.close();

	}
}