package Scanner;
/* 12.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 
a.	Imprima o resultado do seguinte cálculo (primeiro número multiplicado pelo terceiro número mais, 
o resultado somando com o segundo número elevado ao cubo). 
b.	Imprima true se o resultado é maior que zero, caso contrário false. 
c.	Imprima true se o resultado é maior que 10 ou maior que 1, caso contrário false. 
d.	Imprima true se o resultado é menor que 10 ou maior que 100, caso contrário false. 
e.	Imprima true se o resultado é múltiplo de 10, caso contrário false. 
f.	Imprima true se o resultado é múltiplo de 2 e múltiplo de 3, caso contrário false. */

import java.util.Scanner;

public class Scanner12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo número inteiro :");
		int numB = scanner.nextInt();
		System.out.println("Digite o terceiro número inteiro :");
		int numC = scanner.nextInt();
		double resultado = Math.pow(numB, 3) + (numA * numC);
		System.out.println("Resultado = " +resultado);
		if (resultado > 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if (resultado > 10 || resultado > 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if (resultado < 10 || resultado > 100) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if (resultado % 10 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		if (resultado % 2 == 0 && resultado % 3 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scanner.close();
	}
}