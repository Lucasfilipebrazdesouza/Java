package Exercicio3pizza;

/*1.	Um cliente quer que vocês gerem um cardápio para eles. 
	O cardápio terá os seguintes itens: 
*/
import javax.swing.JOptionPane;

public class Pizza {
public static void main(String[] args) {
	
	String listaA = "1-Pizza de Calabresa-R$35,00 "
			+ "\n2-Pizza de 4 Queijos-R$40,00 "
			+ "\n3-Pizza de Frango-R$40,00 "
			+ "\n4-Pizza de Lombinho-R$45,00 "
			+ "\n5-Pizza de Coração-R$45,00 "
			+ "\n6-Pizza de Carne-R$35,00 "
			+ "\n7-Pizza de Strogonoff de Frango-R$40,00 "
			+ "\n8-Pizza de Strogonoff de Carne-R$ 40,00 "
			+ "\n9-Pizza de 5 Queijos-R$40,00 "
			+ "\n10-Pizza de Banana Split-R$45,00 "
			+ "\n11-Pizza de Sonho de Valsa-R$45,00 "
			+ "\n12-Pizza de Prestígio-R$45,00 "
			+ "\n13-Pizza de Chocolate Preto-R$ 45,00 "
			+ "\n14-Pizza de Chocolate Branco-R$45,00 "
			+ "\n15-Pizza de Coco-R$45,00" ;
	
	String[] listaPizzas = new String[15];
	listaPizzas[0] = "1-Pizza de Calabresa-R$35,00";
	listaPizzas[1] = "2-Pizza de 4 Queijos-R$40,00";
	listaPizzas[2] = "3-Pizza de Frango-R$40,00";
	listaPizzas[3] = "4-Pizza de Lombinho-R$45,00";
	listaPizzas[4] = "5-Pizza de Coração-R$45,00";
	listaPizzas[5] = "6-Pizza de Carne-R$35,00";
	listaPizzas[6] = "7-Pizza de Strogonoff de Frango-R$40,00";
	listaPizzas[7] = "8-Pizza de Strogonoff de Carne-R$ 40,00";
	listaPizzas[8] = "9-Pizza de 5 Queijos-R$40,00";
	listaPizzas[9] = "10-Pizza de Banana Split-R$45,00";
	listaPizzas[10] = "11-Pizza de Sonho de Valsa-R$45,00";
    listaPizzas[11] = "12-Pizza de Prestígio-R$45,00";
    listaPizzas[12] = "13-Pizza de Chocolate Preto-R$ 45,00";
    listaPizzas[13] = "14-Pizza de Chocolate Branco-R$45,00";
	listaPizzas[14] = "15-Pizza de Coco-R$45,00";
	int[] valoresPizzas = new int[15];
	valoresPizzas[0] = 35;
	valoresPizzas[1] = 40;
	valoresPizzas[2] = 40;
	valoresPizzas[3] = 45;
	valoresPizzas[4] = 45;
	valoresPizzas[5] = 35;
	valoresPizzas[6] = 40;
	valoresPizzas[7] = 40;
	valoresPizzas[8] = 40;
	valoresPizzas[9] = 45;
	valoresPizzas[10] = 45;
	valoresPizzas[11] = 45;
	valoresPizzas[12] = 45;
	valoresPizzas[13] = 45;
	valoresPizzas[14] = 45;
	
	JOptionPane.showMessageDialog(null, "Cardápio \n" + listaA);
	String codigo = JOptionPane.showInputDialog("Cód Pizza Desejado:");
	String[] lista = codigo.split(" ");
	String pedido = "";
	int valorTotalPedido = 0; 
    for (int aux = 0; aux < lista.length; aux++) {
		switch (lista[aux]) {
		case "1":
			pedido += listaPizzas[0]+"\n";
			valorTotalPedido += valoresPizzas[0];
			break;
		case "2":
			pedido += listaPizzas[1]+"\n";
			valorTotalPedido += valoresPizzas[1];
			break;
		case "3":
			pedido += listaPizzas[2]+"\n";
			valorTotalPedido += valoresPizzas[2];
			break;
		case "4":
			pedido += listaPizzas[3]+"\n";
			valorTotalPedido += valoresPizzas[3];
			break;
		case "5":
			pedido += listaPizzas[4]+"\n";
			valorTotalPedido += valoresPizzas[4];
			break;
		case "6":
			pedido += listaPizzas[5]+"\n";
			valorTotalPedido += valoresPizzas[5];
			break;
		case "7":
			pedido += listaPizzas[6]+"\n";
			valorTotalPedido += valoresPizzas[6];
			break;
		case "8":
			pedido += listaPizzas[7]+"\n";
			valorTotalPedido += valoresPizzas[7];
			break;
		case "9":
			pedido += listaPizzas[8]+"\n";
			valorTotalPedido += valoresPizzas[8];
			break;
		case "10":
			pedido += listaPizzas[9]+"\n";
			valorTotalPedido += valoresPizzas[9];
			break;
		case "11":
			pedido += listaPizzas[10]+"\n";
			valorTotalPedido += valoresPizzas[10];
			break;
		case "12":
			pedido += listaPizzas[11]+"\n";
			valorTotalPedido += valoresPizzas[11];
			break;
		case "13":
			pedido += listaPizzas[12]+"\n";
			valorTotalPedido += valoresPizzas[12];
			break;
		case "14":
			pedido += listaPizzas[13]+"\n";
			valorTotalPedido += valoresPizzas[13];
			break;
		case "15":
			pedido += listaPizzas[14]+"\n";
			valorTotalPedido += valoresPizzas[14];
			break;
		case "16":
			pedido += listaPizzas[15]+"\n";
			valorTotalPedido += valoresPizzas[15];
			break;
		default:
			break;
		}
	
	}
    JOptionPane.showMessageDialog(null, "Seu pedido \n" + pedido + "\nTotal Valor R$"+valorTotalPedido);
}
}
