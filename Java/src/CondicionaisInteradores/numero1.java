package CondicionaisInteradores;

/*1.	Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou. 
 * Verifique se o n�mero � maior que 10, caso sim, imprima �o valor digitado � maior que 10�, 
 * caso contr�rio imprima �o valor digitado � menor que 10�.
 */
import javax.swing.JOptionPane;

public class numero1 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um N�mero"));
		if (numero > 10) {
			JOptionPane.showMessageDialog(null, "O valor digitado � maior que 10");
		} else {
			JOptionPane.showMessageDialog(null, "O valor digitado � menor que 10");
		}

	}
}