package CondicionaisInteradores;
/*2.	Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou. 
 * Verifique se o n�mero � �mpar, caso sim, imprima �o valor digitado � �mpar�, caso contr�rio imprima �o valor � par�.
 */

import javax.swing.JOptionPane;
public class numero2 {
public static void main(String[] args) {
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um N�mero"));
	if (numero % 2 == 1){
		JOptionPane.showMessageDialog(null, "O valor digitado � �mpar");
	} else {
		JOptionPane.showMessageDialog(null, "O valor digitado � Par");
	}
	}
}

