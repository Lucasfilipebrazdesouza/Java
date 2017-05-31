package CondicionaisInteradores;

/*7.	Calculadora
a.	Peça para o usuário digitar um número, e armazene o número
b.	Peça para o usuário digitar um operador matemático (+, -, /, x), e armazene o o operador
c.	Peça para o usuário digitar outro número, e armazene o número
d.	Caso o usuário digitou o operador +, some os dois números e imprima o resultado “Valor da soma: <resultado>”.
e.	Caso o usuário digitou o operador -, subtraia os dois números e imprima o resultado “Valor da subtração: <resultado>”.
f.	Caso o usuário digitou o operador /, divida os dois números e imprima o resultado “Valor da divisão: <resultado>”.
g.	Caso o usuário digitou o operador *, multiplique os dois números e imprima o resultado “Valor da multiplicação: <resultado>”.
*/
import javax.swing.JOptionPane;

public class Numero7 {
	public static void main(String[] args) {
		double numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		String operador = JOptionPane.showInputDialog("Qual Operação Deseja ? \n + - / *");
		double numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		double soma1 = numero1 + numero2;
		double soma2 = numero1 - numero2;
		double soma3 = numero1 / numero2;
		double soma4 = numero1 * numero2;
		if (operador.equals("+")) {
			JOptionPane.showMessageDialog(null, "Valor da soma é = " + soma1);
		} else {
			if (operador.equals("-")) {
				JOptionPane.showMessageDialog(null, "Valor da subtração é = " + soma2);
			} else {
				if (operador.equals("/")) {
					JOptionPane.showMessageDialog(null, "Valor da divisão é = " + soma3);
				} else {
					if (operador.equals("*")) {
						JOptionPane.showMessageDialog(null, "Valor da multiplicação é = " + soma4);
					}
				}
			}
		}
	}
}