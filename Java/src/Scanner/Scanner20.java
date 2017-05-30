package Scanner;

import java.util.Scanner;

/*20.	Peça para o usuário digitar um texto. 
 * Guarde o texto que o usuário digitou em uma variável. 
 * Crie outra variável de nome “outroTexto”, atribuindo o valor da variável que o usuário digitou.
 *  Altere o valor da variável que o usuário digitou para “Olá”. 
 *  Imprima as duas variáveis, e observe o que foi impresso.
 */
public class Scanner20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um Texto");
		String texto = scanner.nextLine();
		String outroTexto = texto;
		texto = "Olá";
		System.out.println("Final..." + outroTexto + " " +texto);
		scanner.close();
	}
}
