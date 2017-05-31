package CondicionaisInteradores;

/* 11.	Escreve um algoritmo que o usuário entre com três números e imprima o maior número entre eles, 
 * utilizando apenas um System.out.println.
 */
import java.util.Scanner;

public class Numero11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 1 número inteiro :");
		int numero1 = scanner.nextInt();
		System.out.println("Digite 2 número inteiro :");
		int numero2 = scanner.nextInt();
		System.out.println("Digite 3 número inteiro :");
		int numero3 = scanner.nextInt();

		int maior1;
		int maior2;
		int maiorTot;
		int menorTot;
		int valormed;
		int valormed2;

		if (numero1 > numero2) {
			maior1 = numero1;
			maior2 = numero2;
		} else {
			maior1 = numero2;
			maior2 = numero1;
		}
		if (maior1 > numero3) {
			maiorTot = maior1;
			menorTot = numero3;
		} else {
			maiorTot = numero3;
			menorTot = maior1;
		}
		if (maior2 > menorTot) {
			valormed = maior2;
			valormed2 = menorTot;
		} else {
			valormed = menorTot;
			valormed2 = maior2;
			System.out.println("Maior número é :" +maiorTot);
			scanner.close();
		}
	}
}
