package CondicionaisInteradores;
/*10.	Pe�a para o usu�rio digitar dois n�meros double. E efetue as seguintes valida��es:
a.	Se a soma dos n�meros for maior que 20, imprima no console �<resultado da soma> � maior que 20�
b.	Se a soma dos n�meros for maior que 30, imprima no console �<resultado da soma> � maior que 30�
c.	Se a soma dos n�meros for maior que 10 ou maior que 20, imprima no console �<resultado da soma> � 
maior que 10 ou <resultado da soma> maior que 20 �
d.	Se a soma dos n�mero � m�ltiplo de 5 e m�ltiplo de 10, imprima no console �<resultado da soma> � m�ltiplo de 5 e <resultado da soma> de 10�
e.	Se a soma dos n�mero � m�ltiplo de 5 e m�ltiplo de 10, ou o primeiro n�mero digitado � 5, 
imprima no console �<resultado da soma> � m�ltiplo de 5 e <resultado da soma> de 10 ou o <primeiro n�mero digitado> � 5�
*/

import javax.swing.JOptionPane;

public class Numero10 {
	public static void main(String[] args) {
		double number1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1� N�mero "));
		double number2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2� N�mero "));
		if (number1 + number2 > 20) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma � maior que 20");
		}
		if (number1 + number2 > 30) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma � maior que 30");
		}
		if (number1 + number2 > 10 || number1 + number2 > 20) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma � maior que 10 ou maior que 20");
		}
		
		if (number1 + number2 % 5 == 0 && number1 + number2 % 10 == 0) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma � multiplo de 5 e 10");
		}
		if (number1 + number2 % 5 == 0 && number1 + number2 % 10 == 0 || number1 == 5) {
			JOptionPane.showMessageDialog(null, "Resultado da Soma � multiplo de 5 e 10 ou number1 � 5 ");
		}
	}
}
