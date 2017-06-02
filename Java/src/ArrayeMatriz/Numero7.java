package ArrayeMatriz;
/*7.	Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”
a.	Imprimir todos os valores do array 
b.	Imprimir todos os valores do array de forma contrário, ou seja, “F”, “E”, “D”, “C”, “B”, “A”
c.	Imprimir todos os valores do array menos que tenha o valor “C”
*/

import javax.swing.JOptionPane;

public class Numero7 {
	public static void main(String[] args) {
		String[] letra = new String[6];
		letra[0] = "A";
		letra[1] = "B";
		letra[2] = "C";
		letra[3] = "D";
		letra[4] = "E";
		letra[5] = "F";
		String todos = "";
		for (int aux1 = 0; aux1 < letra.length; aux1++) {
			todos += letra[aux1];
		}
		JOptionPane.showMessageDialog(null, todos);
	}
}
