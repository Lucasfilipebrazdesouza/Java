package ArrayeMatriz;
/*4.	Criar um array do tipo int, colocando os seguintes valores no array 10, 9, 8, 7.
a.	Imprimir o tamanho deste array
*/

import javax.swing.JOptionPane;
public class Numero4 {
public static void main(String[] args) {
	int[] array = new int[4];
	array[0] = 10;
	array[1] = 9;
	array[2] = 8;
	array[3] = 7;
	 JOptionPane.showMessageDialog(null, "Quantidade de Array = " +array.length);
	}
}
