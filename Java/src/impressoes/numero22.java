package impressoes;
/* 22)	Desenhe a seguinte pir�mide de n�meros. O usu�rio determina a quantidade de linhas. Necessitar� de 2 for.
01
02 02  
03 03 03  
04 04 04 04  
05 05 05 05 05  
06 06 06 06 06 06  
07 07 07 07 07 07 07  
08 08 08 08 08 08 08 08  
09 09 09 09 09 09 09 09 09  
10 10 10 10 10 10 10 10 10 10  
11 11 11 11 11 11 11 11 11 11 11*/

public class numero22 {
	public static void main(String[] args) {
		int N_linhas = 11;
		for (int i = 0; i <= N_linhas; i++) {
			for (int j = 1; j <= i; j++)
				if (i < 10)
					System.out.print(" 0" + i);
			       
				else
					System.out.print(" " +i);
			System.out.println();
		}
	}
}