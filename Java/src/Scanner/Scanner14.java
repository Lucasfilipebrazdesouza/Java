package Scanner;
/*14.	Escreva no console as seguintes quest�o:
a.	Pergunte para o usu�rio as seguintes quest�es, as responta e armazene em vari�veis.
i.	Digite seu nome:
ii.	Digite seu ano de nascimento:
iii.	Digite seu telefone:
iv.	Digite a cidade de nascimento
b.	Imprima no console o seguinte texto concatenando as vari�veis
i.	Meu nome � <nome>, nasci no ano <ano de nascimento>, tenho <idade> anos. 
Se voc� quiser entrar em contato comigo, pode ligar para o telefone <telefone>.
 H� esqueci de te dizer aonde eu nasci, foi na cidade de <cidade de nascimento>. */

import java.util.Scanner;

public class Scanner14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu Nome :");
		String name = scanner.nextLine();
		System.out.println("Digite o ano de Nascimento :");
		int year = scanner.nextInt();
		System.out.println("Digite seu telefone :");
		String fone = scanner.next();
		System.out.println("Digite sua cidade de Nascimento :");
		String city = scanner.next();
		int age = 2017 - 1991;
		System.out.println(" Meu nome � " + name + " Nasci no ano " + year + " Tenho " + age
				+ "anos.\n Se voc� quiser entrar em contato comigo, pode ligar para o telefone " + fone
				+ " \n H� esqueci de te dizer aonde eu nasci, foi na cidade de " + city + ".");
		scanner.close();
	}

}
