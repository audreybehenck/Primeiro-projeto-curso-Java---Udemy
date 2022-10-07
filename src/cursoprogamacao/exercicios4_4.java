package cursoprogamacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicios4_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
					
		for (int i=0; i<N; i++) {
			double divisao = 0.0;
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisão impossível");
			}
			else {
				divisao = (double) x / y;
				System.out.printf("%.1f%n", divisao);
			}
		}
		
		sc.close();
		

	}
}
