package CondicionaisInteradores;
/*3.	Peça para o usuário digitar dois números, pegue os dois números que o usuário digitou. Multiplique os dois números. 
 * Se o resultado da multiplicação for múltiplo de 5 imprima “o resultado é múltiplo de 5”, 
 * caso contrário, imprima “o resultado não foi o esperado”. Após o teste da da condição do if, imprima o resultado da multiplicação.
 */
import javax.swing.JOptionPane;
public class Numero3 {
public static void main(String[] args) {
	int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número à ser multiplicado"));
	int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número multiplicado"));
	int resultado = numero1 * numero2;
	JOptionPane.showMessageDialog(null, "Resultado da Multiplicação " +resultado);
	if (resultado % 5 == 0){
		JOptionPane.showMessageDialog(null, "O Resultado é multiplo de 5");
	}else{
		JOptionPane.showMessageDialog(null, "O  Resultado  não é o esperado ");
	}
}
}
