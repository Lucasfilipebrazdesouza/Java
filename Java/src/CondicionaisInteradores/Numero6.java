package CondicionaisInteradores;

/*6.	Pe�a para o usu�rio digitar a cidade onde mora, armazene o valor em vari�vel. Pe�a para o usu�rio digitar o bairro onde mora, 
 * armazene o valor em vari�vel. Com tais informa��es efetue as seguintes condi��es:
a.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Velha�, caso sim, imprima �Voc� se atrasar� para o trabalho!�.
b.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Fortaleza�, caso sim, imprima �Voc� se atrasar� muito mais para o trabalho!�.
c.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Garcia�, caso sim, imprima �Voc� tem que sair de madrugada para n�o pegar tr�nsito!�.
d.	Verifique se o usu�rio mora em �Gaspar� e no bairro �Belchior�, caso sim, imprima �OK, voc� gosta de pegar tr�nsito!�.
e.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Bela vista�, caso sim, imprima �Pegue carona com quem v�em de Gaspar, economiza gasolina!�.
f.	No final pe�a para o usu�rio responder a pergunta �Voc� concorda com o que eu disse?� utilizando System.out.println e pegue o que o usu�rio digitar com Scanner. 
Caso o usu�rio digitar true, imprima �Show de bola�, caso contr�rio �Ok, problema � nosso!�.
*/
import javax.swing.JOptionPane;

public class Numero6 {
	public static void main(String[] args) {
		String city = JOptionPane.showInputDialog("Qual cidade vc mora");
		String downtown = JOptionPane.showInputDialog("Em qual bairro vc mora");
		if (city.equals("Blumenau") && downtown.equals("Velha")); 
			JOptionPane.showMessageDialog(null, "Voc� se atrasar� para o trabaho !");
		
		if (city.equals("Blumenau") && downtown.equals("Fortaleza")); 
			JOptionPane.showMessageDialog(null, "Voc� se atrasar� muito mais para o trabaho !");
		
		if (city.equals("Blumenau") && downtown.equals("Garcia")); 
			JOptionPane.showMessageDialog(null, "Voc� tem que sair de madrugada para n�o pegar tr�nsito !");
	
		if (city.equals("Gaspar") && downtown.equals("Belchior")); 
			JOptionPane.showMessageDialog(null, "OK voc� gosta de pegar tr�nsito");
		
		if (city.equals("Blumenau") && downtown.equals("Bela Vista")); 
			JOptionPane.showMessageDialog(null, "Pegue carona com quem v�em de Gaspar, economiza gasolina !");
		
		
			String resposta = JOptionPane.showInputDialog("Voc� concorda com que eu disse ? \ncaso sim digite ok... ");
			if (resposta.equals("ok")) {
				JOptionPane.showMessageDialog(null, "Show de Bola");
			} else {
				JOptionPane.showMessageDialog(null, "Ok, problema � nosso !");
			}
		}
	}

