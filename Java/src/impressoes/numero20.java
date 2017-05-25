package impressoes;

import javax.swing.JOptionPane;

//20)	Perguntar para o usuário o início da lista e o final da lista que ele quer se seja impressa e imprimir esta lista.
public class numero20 {
	public static void main(String[] args) {
		int Num_a = Integer.parseInt(JOptionPane.showInputDialog("Digite o início da lista"));
		int Num_b = Integer.parseInt(JOptionPane.showInputDialog("Digite o final da lista"));
		for (int a = Num_a; a <= Num_b; a++) {
			JOptionPane.showMessageDialog(null, "lista " + a);
		}
	}
}
