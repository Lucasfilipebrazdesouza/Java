package CondicionaisInteradores;

/*4.	Peça para o usuário digitar dois números, pegue os dois números que o usuário digitou.
 *  Se o primeiro número que o usuário digitar e o segundo número que o usuário digitou forem múltiplos de 7, 
 * imprima “os dois números são múltiplos de 7”, caso contrário imprima, “os dois números não são múltiplos de 7”. 
 */
import javax.swing.JOptionPane;

public class Numero4 {
	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
		if (numero1 % 7 == 0 && numero2 % 7 == 0) {
			JOptionPane.showMessageDialog(null, "Os dois números são multiplo de 7");
		} else {
			JOptionPane.showMessageDialog(null, "Os dois números não são multiplo de 7 ");
		}
	}

}
