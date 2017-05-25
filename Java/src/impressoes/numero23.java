package impressoes;
/*23)	Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas. Necessitará de 2 for.
 * 11 11 11 11 11 11 11 11 11 11 11
10 10 10 10 10 10 10 10 10 10  
09 09 09 09 09 09 09 09 09  
08 08 08 08 08 08 08 08  
07 07 07 07 07 07 07 
06 06 06 06 06 06  
05 05 05 05 05  
04 04 04 04  
03 03 03  
02 02  
01  

 */

public class numero23 {
	public static void main(String[] args) {
		int N_linhas = 11;
		int numero = 11;
		for (int i = 1; i <= N_linhas; i++) {
			for (int j = 11; j >= i; j--) {
				if (numero < 10) {
					System.out.print(" 0" + numero);

				} else {
					System.out.print(" " + numero);
				}

			}
			numero--;
			System.out.println();
		}
	}
}
