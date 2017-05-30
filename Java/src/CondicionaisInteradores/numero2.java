package CondicionaisInteradores;
/*2.	Peça para o usuário digitar um número, pegue o número que o usuário digitou. 
 * Verifique se o número é ímpar, caso sim, imprima “o valor digitado é ímpar”, caso contrário imprima “o valor é par”.
 */

import javax.swing.JOptionPane;
public class numero2 {
public static void main(String[] args) {
	int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número"));
	if (numero % 2 == 1){
		JOptionPane.showMessageDialog(null, "O valor digitado é Ímpar");
	} else {
		JOptionPane.showMessageDialog(null, "O valor digitado é Par");
	}
	}
}

