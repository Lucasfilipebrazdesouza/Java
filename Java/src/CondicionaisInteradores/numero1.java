package CondicionaisInteradores;

/*1.	Peça para o usuário digitar um número, pegue o número que o usuário digitou. 
 * Verifique se o número é maior que 10, caso sim, imprima “o valor digitado é maior que 10”, 
 * caso contrário imprima “o valor digitado é menor que 10”.
 */
import javax.swing.JOptionPane;

public class numero1 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
		if (numero > 10) {
			JOptionPane.showMessageDialog(null, "O valor digitado é maior que 10");
		} else {
			JOptionPane.showMessageDialog(null, "O valor digitado é menor que 10");
		}

	}
}