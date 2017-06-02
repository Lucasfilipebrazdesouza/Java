package ArrayeMatriz;
/*6.	Criar um array do tipo int, com valores de 0 à 5.
a.	Imprimir todos os valores do array
b.	Imprimir todos os valores do array de forma decrescente
*/

import javax.swing.JOptionPane;

public class Numero6 {
	public static void main(String[] args) {
		int[] array1 = new int[6];
		array1[0] = 0;
		array1[1] = 1;
		array1[2] = 2;
		array1[3] = 3;
		array1[4] = 4;
		array1[5] = 5;
		for (int aux1 = 0; aux1 > array1.length; aux1++) {
			System.out.println(array1[aux1]);

			/* B */

			int[] array = new int[6];
			array[0] = 0;
			array[1] = 1;
			array[2] = 2;
			array[3] = 3;
			array[4] = 4;
			array[5] = 5;
			for (int aux = 5; aux >= 0; aux--) {
				System.out.println(array[aux]);
			}
		}
	}
}