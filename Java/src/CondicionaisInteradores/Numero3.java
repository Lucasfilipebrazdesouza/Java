package CondicionaisInteradores;
/*3.	Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio digitou. Multiplique os dois n�meros. 
 * Se o resultado da multiplica��o for m�ltiplo de 5 imprima �o resultado � m�ltiplo de 5�, 
 * caso contr�rio, imprima �o resultado n�o foi o esperado�. Ap�s o teste da da condi��o do if, imprima o resultado da multiplica��o.
 */
import javax.swing.JOptionPane;
public class Numero3 {
public static void main(String[] args) {
	int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero � ser multiplicado"));
	int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero multiplicado"));
	int resultado = numero1 * numero2;
	JOptionPane.showMessageDialog(null, "Resultado da Multiplica��o " +resultado);
	if (resultado % 5 == 0){
		JOptionPane.showMessageDialog(null, "O Resultado � multiplo de 5");
	}else{
		JOptionPane.showMessageDialog(null, "O  Resultado  n�o � o esperado ");
	}
}
}
