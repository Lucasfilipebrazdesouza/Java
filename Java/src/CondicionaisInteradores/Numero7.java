package CondicionaisInteradores;

/*7.	Calculadora
a.	Pe�a para o usu�rio digitar um n�mero, e armazene o n�mero
b.	Pe�a para o usu�rio digitar um operador matem�tico (+, -, /, x), e armazene o o operador
c.	Pe�a para o usu�rio digitar outro n�mero, e armazene o n�mero
d.	Caso o usu�rio digitou o operador +, some os dois n�meros e imprima o resultado �Valor da soma: <resultado>�.
e.	Caso o usu�rio digitou o operador -, subtraia os dois n�meros e imprima o resultado �Valor da subtra��o: <resultado>�.
f.	Caso o usu�rio digitou o operador /, divida os dois n�meros e imprima o resultado �Valor da divis�o: <resultado>�.
g.	Caso o usu�rio digitou o operador *, multiplique os dois n�meros e imprima o resultado �Valor da multiplica��o: <resultado>�.
*/
import javax.swing.JOptionPane;

public class Numero7 {
	public static void main(String[] args) {
		double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		String operador = JOptionPane.showInputDialog("Qual Opera��o Deseja ? \n + - / *");
		double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero"));
		double soma1 = numero1 + numero2;
		double soma2 = numero1 - numero2;
		double soma3 = numero1 / numero2;
		double soma4 = numero1 * numero2;
		if (operador.equals("+")) {
			JOptionPane.showMessageDialog(null, "Valor da soma � = " + soma1);
		} else {
			if (operador.equals("-")) {
				JOptionPane.showMessageDialog(null, "Valor da subtra��o � = " + soma2);
			} else {
				if (operador.equals("/")) {
					JOptionPane.showMessageDialog(null, "Valor da divis�o � = " + soma3);
				} else {
					if (operador.equals("*")) {
						JOptionPane.showMessageDialog(null, "Valor da multiplica��o � = " + soma4);
					}
				}
			}
		}
	}
}