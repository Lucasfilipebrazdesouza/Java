package impressoes;

import javax.swing.JOptionPane;

public class numero9 {

	public static void main(String[] args) {
		int _number = Integer.parseInt(JOptionPane.showInputDialog("Digite até qual numero que deseja imprimir"));
		for (int a = 0; a <= _number; a++) {
			if (a % 3 == 0)
				System.out.println(" Os números são " + a);
		}

	}
}
