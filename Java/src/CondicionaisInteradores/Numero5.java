package CondicionaisInteradores;
/*5.	Pe�a para o usu�rio digitar a idade e ano de nascimento. Pegue os valores que o usu�rio digitou. 
 * Verifique se a idade digitada condiz com o ano de nascimento do usu�rio, ou seja, se realmente ele tem a idade que disse ter. 
 * Caso sim imprima �Voc� n�o mentiu para mim�, caso contr�rio, imprima �Voc� mentiu para mim, voc� n�o � mais meu amigo�.
 */

import javax.swing.JOptionPane;
public class Numero5 {
public static void main(String[] args) {
	int ago = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
	int bornyear = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que nasceu"));
	if (bornyear == 2017-ago){
		JOptionPane.showMessageDialog(null, "Voc� n�o mentiu para mim");
	} else {
		JOptionPane.showMessageDialog(null, "Voc� mentiu para mim, voc� n�o � mais meu amigo");
	}
}
}
