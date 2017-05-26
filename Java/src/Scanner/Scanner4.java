package Scanner;

/*4.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
Imprima no console true se o primeiro número é maior que o segundo número digitado.*/
import java.util.Scanner;

public class Scanner4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int numA = scanner.nextInt();
		System.out.println("Digite um segundo número inteiro);");
		int numB = scanner.nextInt();
		if (numA >= numB) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		scanner.close();

	}
}