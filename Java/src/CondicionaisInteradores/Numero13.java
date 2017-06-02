package CondicionaisInteradores;
/*13.	Escreva um algoritmo que o usuário entre com o salário da pessoa e imprima o salário líquido, segundo as informações abaixo, 
 * utilizando apenas um System.out.println:
a.	Menor ou igual a R$ 600,00 é isento
b.	Maior que R$ 600 e menor ou igual a R$ 1.200,00 o desconto é de 20%
c.	Maior que R$ 1.200,00 e menor ou igual a R$ 2000,00 o desconto é 25%
d.	Maior que R$ 2000,00 o desconto é 30%
*/

import java.util.Scanner;

public class Numero13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o valor do salário :");
		double salario = scanner.nextDouble();
		double salarioliq = 0;
		if (salario <= 600) {
			salarioliq = salario;
		} else {
			if (salario >= 600 && salario <= 1200) {
				salarioliq = salario * 0.80;
			} else {
				if (salario > 1200 && salario <= 2000) {
					salarioliq = salario * 0.75;
				} else {
					if (salario > 2000) {
						salarioliq = salario * 0.70;
					}
					
				}
				
			}
		}
		System.out.println(" Salário Líquido : " +salarioliq);
		scanner.close();
	}
}
