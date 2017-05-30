package Scanner;
/*22.	Crie uma variável de nome “teste” do tipo boolean com o valor true. 
 * Crie outra variável de nome “outroTeste” do tipo boolean com o valor false. 
 * Imprima os valores das duas variáveis. Coloque o valor da variável “teste” na variável “outroTeste”. 
 * Imprima novamente ambas as variáveis. Agora coloque o valor false na variável “teste”, 
 * e imprima ambas as variáveis novamente. Verifique o que aconteceu.
 */
import java.util.Scanner;
public class Scanner22 {
public static void main(String[] args) {
	boolean teste = true;
	boolean outroTeste=false;
	System.out.println("Impressão " +teste+" "+outroTeste);
	outroTeste = teste;
	System.out.println("Impressão " +teste+" "+outroTeste);
	teste = false;
	System.out.println("Impressão " +teste+" "+outroTeste);
	
}
}
