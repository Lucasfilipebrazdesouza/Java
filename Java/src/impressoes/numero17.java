package impressoes;
/*17)	Imprimir uma lista semelhante a lista abaixo:
1_10
2_9
3_8
4_7
5_6
6_5
7_4
8_3
9_2
10_1*/

public class numero17 {
	public static void main(String[] args) {
		int a = 10;
		for (int b = 1; b <= 10; b++) {

			System.out.println(b + "_" + a);
			a--;
		}
	}

}
