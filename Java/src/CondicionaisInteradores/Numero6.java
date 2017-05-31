package CondicionaisInteradores;

/*6.	Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. Peça para o usuário digitar o bairro onde mora, 
 * armazene o valor em variável. Com tais informações efetue as seguintes condições:
a.	Verifique se o usuário mora em “Blumenau” e no bairro “Velha”, caso sim, imprima “Você se atrasará para o trabalho!”.
b.	Verifique se o usuário mora em “Blumenau” e no bairro “Fortaleza”, caso sim, imprima “Você se atrasará muito mais para o trabalho!”.
c.	Verifique se o usuário mora em “Blumenau” e no bairro “Garcia”, caso sim, imprima “Você tem que sair de madrugada para não pegar trânsito!”.
d.	Verifique se o usuário mora em “Gaspar” e no bairro “Belchior”, caso sim, imprima “OK, você gosta de pegar trânsito!”.
e.	Verifique se o usuário mora em “Blumenau” e no bairro “Bela vista”, caso sim, imprima “Pegue carona com quem vêem de Gaspar, economiza gasolina!”.
f.	No final peça para o usuário responder a pergunta “Você concorda com o que eu disse?” utilizando System.out.println e pegue o que o usuário digitar com Scanner. 
Caso o usuário digitar true, imprima “Show de bola”, caso contrário “Ok, problema é nosso!”.
*/
import javax.swing.JOptionPane;

public class Numero6 {
	public static void main(String[] args) {
		String city = JOptionPane.showInputDialog("Qual cidade vc mora");
		String downtown = JOptionPane.showInputDialog("Em qual bairro vc mora");
		if (city.equals("Blumenau") && downtown.equals("Velha")); 
			JOptionPane.showMessageDialog(null, "Você se atrasará para o trabaho !");
		
		if (city.equals("Blumenau") && downtown.equals("Fortaleza")); 
			JOptionPane.showMessageDialog(null, "Você se atrasará muito mais para o trabaho !");
		
		if (city.equals("Blumenau") && downtown.equals("Garcia")); 
			JOptionPane.showMessageDialog(null, "Você tem que sair de madrugada para não pegar trânsito !");
	
		if (city.equals("Gaspar") && downtown.equals("Belchior")); 
			JOptionPane.showMessageDialog(null, "OK você gosta de pegar trânsito");
		
		if (city.equals("Blumenau") && downtown.equals("Bela Vista")); 
			JOptionPane.showMessageDialog(null, "Pegue carona com quem vêem de Gaspar, economiza gasolina !");
		
		
			String resposta = JOptionPane.showInputDialog("Você concorda com que eu disse ? \ncaso sim digite ok... ");
			if (resposta.equals("ok")) {
				JOptionPane.showMessageDialog(null, "Show de Bola");
			} else {
				JOptionPane.showMessageDialog(null, "Ok, problema é nosso !");
			}
		}
	}

