package Scanner;

/*23.	Diga se o código abaixo esta condizente com o que será impresso no console, 
 * se não, o por que e diga o resultado correto.
 */
import java.util.Scanner;

public class Scanner23 {
	/*A*/
	public static void main(String[] args) {
		String texto = "Vinícius";
		String outroTexto = texto + "Ferneda";
		texto = outroTexto + "Ferneda";
		System.out.println(texto);
		/*
		 * Console: ViniciusFernedaFerneda
		 */
	
/*B*/	
int numero = 1;
int outroNumero = 2 + 1;
System.out.println(numero + 2);
outroNumero = numero + 1;
outroNumero = outroNumero + numero;
System.out.println(outroNumero);
	}


/*Console:
3
3*/

/*C*/
int numeroA = 10;
int outroNumeroA = numeroA;

outroNumeroA = outroNumeroA + 10;
numeroA = outroNumeroA;
numeroA = outroNumeroA + 1;
System.out.println(numeroA);
outroNumeroA = numeroA + 1;
System.out.println(outroNumeroA);
}
}

/*Console:
21		
22*/

