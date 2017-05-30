package Scanner;

/*Peça para o usuário digitar um número. Guarde o número que o usuário digitou. 
 * Some o número que o usuário digitou com 5. Imprima o resultado da soma.
 *  Pegue o resultado e some com 5 novamente. Imprima o resultado da soma.
 */
import java.util.Scanner;

public class Scanner17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número : ");
		int numuser = scanner.nextInt();
		int soma1 = numuser + 5;
		System.out.println("Soma = " + soma1);
		int resultado = soma1 + 5;
		System.out.println("Resultado = " + resultado);
		scanner.close();
	}
}
