package Scanner;

//1.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado e imprima o número no console.
import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		{

			int numA;
			{
				System.out.println("Numero Inteiro:");
				{
					numA = scanner.nextInt();
					System.out.println("Numero Digitado é " + numA);
				}
			}
		}
	}
}