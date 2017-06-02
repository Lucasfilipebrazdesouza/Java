package CondicionaisInteradores;

/*14.	Um comerciante comprou um produto e quer vende-lo com um lucro de 50% se o valor da compra for menor que R$ 20,00. 
 * Caso contrário, o lucro será 35%. Entrar com o valor do produto e imprimir o valor de venda.
 */
import javax.swing.JOptionPane;

public class Numero14 {
	public static void main(String[] args) {
		double compra = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor da Compra : "));
		double lucro50 = compra * 1.50;
		double lucro35 = compra * 1.35;
		double venda = 0;
		if (compra <= 20) {
			venda = lucro50;
			JOptionPane.showMessageDialog(null, "Valor da Venda = " + venda);
		} else {
			if (compra > 20) {
				venda = lucro35;
				JOptionPane.showMessageDialog(null, "Valor da Venda = " + venda);
			}
		}
	}
}
