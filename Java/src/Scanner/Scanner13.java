package Scanner;

/*13.	
 * Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
a.	Imprima true se o valor do primeiro n�mero � menor ou igual a soma do segundo n�mero com o terceiro e o quarto n�mero, 
for impar ou maior que 10, caso contr�rio false.
b.	Imprima true se a soma do primeiro d�gito mais o segundo mais o terceiro mais o quarto d�gito for m�ltiplo de 10, 
ou m�ltiplo de 5, ou o primeiro d�gito for 5, ou a soma do primeiro d�gito mais o segundo e o terceiro d�gito, 
for maior que 100.0, e o primeiro d�gito maior que 0.
c.	Imprima true se o resultado da quest�o a e o resultado da quest�o b forem verdadeiras, 
ou o resultado da quest�o a e o resultado da quest�o b forem falsas.
d.	Imprima false se o valor do primeiro d�gito mais o segundo, terceiro e quarto for maior que 10, caso contr�rio true.
e.	Imprima false se o primeiro n�mero � maior que 10 ou o terceiro n�mero for maior que 0, 
ou o segundo n�mero mais o quarto n�mero for igual a 0. Caso contr�rio true.
*/
import java.util.Scanner;

public class Scanner13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo n�mero inteiro :");
		int numB = scanner.nextInt();
		System.out.println("Digite o terceiro n�mero inteiro :");
		int numC = scanner.nextInt();
		System.out.println("Digite o terceiro n�mero inteiro :");
		int numD = scanner.nextInt();
		int resultado = numB + numC + numD;
		System.out.println("Resultado = " +resultado);
		if (numA <= resultado && numA % 2 == 1 || numA > 10) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		int soma2 = numA + numB + numC + numD;
		if (soma2 % 10 == 0 || soma2 % 5 == 0 || numA == 5 || (numA + numB + numC > 100) && numA > 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scanner.close();
	}
}
