package Scanner;
/* 12.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 * Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
 
a.	Imprima o resultado do seguinte c�lculo (primeiro n�mero multiplicado pelo terceiro n�mero mais, 
o resultado somando com o segundo n�mero elevado ao cubo). 
b.	Imprima true se o resultado � maior que zero, caso contr�rio false. 
c.	Imprima true se o resultado � maior que 10 ou maior que 1, caso contr�rio false. 
d.	Imprima true se o resultado � menor que 10 ou maior que 100, caso contr�rio false. 
e.	Imprima true se o resultado � m�ltiplo de 10, caso contr�rio false. 
f.	Imprima true se o resultado � m�ltiplo de 2 e m�ltiplo de 3, caso contr�rio false. */

import java.util.Scanner;

public class Scanner12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero inteiro :");
		int numA = scanner.nextInt();
		System.out.println("Digite o segundo n�mero inteiro :");
		int numB = scanner.nextInt();
		System.out.println("Digite o terceiro n�mero inteiro :");
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