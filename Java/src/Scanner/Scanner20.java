package Scanner;

import java.util.Scanner;

/*20.	Pe�a para o usu�rio digitar um texto. 
 * Guarde o texto que o usu�rio digitou em uma vari�vel. 
 * Crie outra vari�vel de nome �outroTexto�, atribuindo o valor da vari�vel que o usu�rio digitou.
 *  Altere o valor da vari�vel que o usu�rio digitou para �Ol�. 
 *  Imprima as duas vari�veis, e observe o que foi impresso.
 */
public class Scanner20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um Texto");
		String texto = scanner.nextLine();
		String outroTexto = texto;
		texto = "Ol�";
		System.out.println("Final..." + outroTexto + " " +texto);
		scanner.close();
	}
}
