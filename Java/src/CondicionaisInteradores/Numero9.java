package CondicionaisInteradores;

/*9.	Mariazinha quer sair com amigas no domingo a tarde no shopping. 
 * Só que ela não sabe que roupa ela vai usar ainda, por que ela não viu o jornal do clima na tv. 
 * Esta na hora de sair ela vai olhar para fora da janela e ver o tempo para verificar qual roupa ela usará. 
 * Contudo a Mariazinha já nos disse o que ela usará em cada clima e temperatura. 
 * Desta forma, escreva um algoritmo que verifique as condições do tempo (clima e temperatura) e
 *  imprima no console qual a roupa que a Mariazinha escolheu para usar.
a.	Se estiver sol ela usuário blusa
b.	Se estiver sol e a temperatura estiver acima de 30° ela usará saia
c.	Se estiver sol e a temperatura estiver abaixo ou igual a 30° e maior ou igual a 23° ela usará shorts.
d.	Se estiver sol e a temperatura estiver abaixo de 23ª graus ela usuário calça jeans.
e.	Se estiver nublado e a temperatura estiver mais que 25° graus ela usará vestido.
f.	Se estiver nublado e a temperatura estiver menor ou igual a 25° ela usará calça de moletom e sobretudo. 
g.	Se estiver chovendo ela usará bota e calça  jean
h.	Se estiver chovendo e a temperatura for menor ou igual a 10° ela usará blusa e um casaco de lã.
i.	Se estiver chovendo e a temperatura for maior que 10° e menor que 25° ela usará camisete. 
j.	Se estiver chovendo e a temperatura for maior ou igual a 25° ela usará uma blusa regata
k.	Caso contrário ela vai ficar em casa
*/
import javax.swing.JOptionPane;

public class Numero9 {
	public static void main(String[] args) {
		String clima = JOptionPane.showInputDialog("Como está o clima hoje? \n Sol, Nublado ou Chovendo ");
		double temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a Temperatura? "));
		boolean ficaremcasa = true;
		if (clima.equals("Sol")) {
			JOptionPane.showMessageDialog(null, "Usar Blusa");
			ficaremcasa = false;
		}
		if (clima.equals("Sol") && temperatura > 30) {
			JOptionPane.showMessageDialog(null, "Usar Saia");
			ficaremcasa = false;
		}
		if (clima.equals("Sol") && (temperatura <= 30 || temperatura >= 23)) {
			JOptionPane.showMessageDialog(null, "Usar Shorts");
			ficaremcasa = false;
		}
		if (clima.equals("Sol") && temperatura < 23) {
			JOptionPane.showMessageDialog(null, "Usar Calça Jeans");
			ficaremcasa = false;
		}
		if (clima.equals("Nublado") && temperatura > 25) {
			JOptionPane.showMessageDialog(null, "Usar Vestido");
			ficaremcasa = false;
		}
		if (clima.equals("Nublado") && temperatura <= 25) {
			JOptionPane.showMessageDialog(null, "Usar Calça de Moletom e Sobretudo");
			ficaremcasa = false;
		}
		if (clima.equals("Chovendo")) {
			JOptionPane.showMessageDialog(null, "Usar Bota e Calça Jeans");
			ficaremcasa = false;
		}
		if (clima.equals("Chovendo") && temperatura <= 10) {
			JOptionPane.showMessageDialog(null, "Usar Blusa e Um Casaco de Lã");
			ficaremcasa = false;
		}
		if (clima.equals("Chovendo") && (temperatura > 10 && temperatura < 25)) {
			JOptionPane.showMessageDialog(null, "Usar Camisete");
			ficaremcasa = false;
		}
		if (clima.equals("Chovendo") && temperatura >= 25) {
			JOptionPane.showMessageDialog(null, "Usar Blusa Regata");
			ficaremcasa = false;
		}
		if (ficaremcasa) {
			JOptionPane.showMessageDialog(null, "Vai Ficar em Casa");
		}
	}
}
