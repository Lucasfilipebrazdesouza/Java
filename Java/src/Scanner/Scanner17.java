package Scanner;

/*Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou. 
 * Some o n�mero que o usu�rio digitou com 5. Imprima o resultado da soma.
 *  Pegue o resultado e some com 5 novamente. Imprima o resultado da soma.
 */
import java.util.Scanner;

public class Scanner17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero : ");
		int numuser = scanner.nextInt();
		int soma1 = numuser + 5;
		System.out.println("Soma = " + soma1);
		int resultado = soma1 + 5;
		System.out.println("Resultado = " + resultado);
		scanner.close();
	}
}
