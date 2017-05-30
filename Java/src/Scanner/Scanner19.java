package Scanner;

/*19.	Peça para o usuário digitar um número. 
 * Guarde o número que o usuário digitou na variável “primeiroNumero”. 
 * Crie outra variável de nome “segundoNumero”, atribuindo o valor da variável “primeiroNumero”. 
 * Altere o valor da variavel “primeiroNumero” para 10. 
 * Imprima a variável “primeiroNumero” e a variável “segundoNumero”. 
 * Verifique os valores das variáveis, como ficaram.
 */
import java.util.Scanner;

public class Scanner19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um Número");
		int primeiroNumero = scanner.nextInt();
		int segundoNumero = primeiroNumero;
		primeiroNumero = 10;
		System.out.println("Valor = " + primeiroNumero + " e " + segundoNumero);
		scanner.close();
	}
}
