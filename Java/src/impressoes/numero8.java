package impressoes;

import javax.swing.JOptionPane;

public class numero8 {
	public static void main(String[] args) {
		int _number = Integer.parseInt(JOptionPane.showInputDialog("Digite at� qual numero que deseja imprimir"));
		for (int a = 0; a <= _number; a++) {
			if (a % 2 == 0)
			System.out.println(" Os n�meros s�o " + a);
		}

	}
}
