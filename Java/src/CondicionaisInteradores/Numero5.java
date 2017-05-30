package CondicionaisInteradores;
/*5.	Peça para o usuário digitar a idade e ano de nascimento. Pegue os valores que o usuário digitou. 
 * Verifique se a idade digitada condiz com o ano de nascimento do usuário, ou seja, se realmente ele tem a idade que disse ter. 
 * Caso sim imprima “Você não mentiu para mim”, caso contrário, imprima “Você mentiu para mim, você não é mais meu amigo”.
 */

import javax.swing.JOptionPane;
public class Numero5 {
public static void main(String[] args) {
	int ago = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
	int bornyear = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que nasceu"));
	if (bornyear == 2017-ago){
		JOptionPane.showMessageDialog(null, "Você não mentiu para mim");
	} else {
		JOptionPane.showMessageDialog(null, "Você mentiu para mim, você não é mais meu amigo");
	}
}
}
