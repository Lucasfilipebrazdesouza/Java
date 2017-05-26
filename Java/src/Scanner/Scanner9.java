package Scanner;
/*9.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado. 
 * Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
 * Imprima no console true se o primeiro número é menor igual a zero ou o segundo número é maior que 10. Caso contrário imprima false.
 */
import java.util.Scanner;
public class Scanner9 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite o primeiro número inteiro :");
	int numA = scanner.nextInt();
	System.out.println("Digite o segundo número inteiro :");
	int numB = scanner.nextInt();
	if(numA <=0 || numB >=10 ){
		System.out.println("true");
		}else{
			System.out.println("false");
	}
	scanner.close();
}
}
