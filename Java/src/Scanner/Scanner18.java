package Scanner;
/*18.	Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou. 
 * Subtraia o n�mero por 5 e imprima o resultado. Pegue novamente o n�mero que o usu�rio digitou e 
 * subtraia por 3 e imprima o resultado. 
 * Pegue o resultado da subtra��o por 5 e o resultado da subtra��o por 3 e imprima os dois resultado.
 */

import java.util.Scanner;

public class Scanner18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um N�mero");
		int number = scanner.nextInt();
		int soma1 = number - 5;
		System.out.println(" Resulato1 = " + soma1);
		int soma2 = number - 3;
		System.out.println(" Resulato2 = " + soma2 + "\n Final = " + soma1 + " e " + soma2);
		scanner.close();
	}
}