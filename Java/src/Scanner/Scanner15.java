package Scanner;

/*15.	Vamos considerar que temos que validar um campo texto de uma tela de cadastro de pessoa, 
 * no qual � um campo de observa��o. Caso a quantidade de caracteres que o usu�rio digitou 
 * for maior que 50, imprima false, caso contr�rio imprima true.*/
import java.util.Scanner;

public class Scanner15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu texto :");
		String texto = scanner.nextLine();
		int numtext = texto.length();
		if (numtext > 50) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
		scanner.close();

	}

}
