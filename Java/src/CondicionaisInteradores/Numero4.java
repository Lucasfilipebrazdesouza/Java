package CondicionaisInteradores;

/*4.	Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio digitou.
 *  Se o primeiro n�mero que o usu�rio digitar e o segundo n�mero que o usu�rio digitou forem m�ltiplos de 7, 
 * imprima �os dois n�meros s�o m�ltiplos de 7�, caso contr�rio imprima, �os dois n�meros n�o s�o m�ltiplos de 7�. 
 */
import javax.swing.JOptionPane;

public class Numero4 {
	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero"));
		if (numero1 % 7 == 0 && numero2 % 7 == 0) {
			JOptionPane.showMessageDialog(null, "Os dois n�meros s�o multiplo de 7");
		} else {
			JOptionPane.showMessageDialog(null, "Os dois n�meros n�o s�o multiplo de 7 ");
		}
	}

}
