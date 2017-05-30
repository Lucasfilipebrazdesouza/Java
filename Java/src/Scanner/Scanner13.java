package Scanner;

/*13.	
 * Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
a.	Imprima true se o valor do primeiro número é menor ou igual a soma do segundo número com o terceiro e o quarto número, 
for impar ou maior que 10, caso contrário false.
b.	Imprima true se a soma do primeiro dígito mais o segundo mais o terceiro mais o quarto dígito for múltiplo de 10, 
ou múltiplo de 5, ou o primeiro dígito for 5, ou a soma do primeiro dígito mais o segundo e o terceiro dígito, 
for maior que 100.0, e o primeiro dígito maior que 0.
c.	Imprima true se o resultado da questão a e o resultado da questão b forem verdadeiras, 
ou o resultado da questão a e o resultado da questão b forem falsas.
d.	Imprima false se o valor do primeiro dígito mais o segundo, terceiro e quarto for maior que 10, caso contrário true.
e.	Imprima false se o primeiro número é maior que 10 ou o terceiro número for maior que 0, 
ou o segundo número mais o quarto número for igual a 0. Caso contrário true.
*/
import java.util.Scanner;

public class Scanner13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro :");
		int numB = scanner.nextInt();
		System.out.println("Digite o terceiro número inteiro :");
		int numC = scanner.nextInt();
		System.out.println("Digite o terceiro número inteiro :");
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
