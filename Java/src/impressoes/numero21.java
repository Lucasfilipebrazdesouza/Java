package impressoes;
/* 21)	Desenhe a seguinte pir�mide de n�meros. O usu�rio determina a quantidade de linhas. Necessitar� de 2 for.
1
1 1  
1 1 1  
1 1 1 1
1 1 1 1 1
1 1 1 1 1 1 */

public class numero21 {
	public static void main(String[] args) {
		int N_linhas = 5;
		for (int i = 0; i < N_linhas; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print("1");
			System.out.println();
		}
	}
}