package CondicionaisInteradores;
/*10.	Peça para o usuário digitar dois números double. E efetue as seguintes validações:
a.	Se a soma dos números for maior que 20, imprima no console “<resultado da soma> é maior que 20”
b.	Se a soma dos números for maior que 30, imprima no console “<resultado da soma> é maior que 30”
c.	Se a soma dos números for maior que 10 ou maior que 20, imprima no console “<resultado da soma> é 
maior que 10 ou <resultado da soma> maior que 20 ”
d.	Se a soma dos número é múltiplo de 5 e múltiplo de 10, imprima no console “<resultado da soma> é múltiplo de 5 e <resultado da soma> de 10”
e.	Se a soma dos número é múltiplo de 5 e múltiplo de 10, ou o primeiro número digitado é 5, 
imprima no console “<resultado da soma> é múltiplo de 5 e <resultado da soma> de 10 ou o <primeiro número digitado> é 5”
*/

import javax.swing.JOptionPane;

public class Numero10 {
	public static void main(String[] args) {
		double number1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º Número "));
		double number2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º Número "));
		if (number1 + number2 > 20) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma é maior que 20");
		}
		if (number1 + number2 > 30) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma é maior que 30");
		}
		if (number1 + number2 > 10 || number1 + number2 > 20) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma é maior que 10 ou maior que 20");
		}
		
		if (number1 + number2 % 5 == 0 && number1 + number2 % 10 == 0) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma é multiplo de 5 e 10");
		}
		if (number1 + number2 % 5 == 0 && number1 + number2 % 10 == 0 || number1 == 5) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma é multiplo de 5 e 10 ou number1 é 5 ");
		}
	}
}
