package Scanner;

//1.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado e imprima o n�mero no console.
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
					System.out.println("Numero Digitado � " + numA);
				}
			}
		}
	}
}