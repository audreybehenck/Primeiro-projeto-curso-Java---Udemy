package cursoprogamacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicios4_7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int quadrado = 0;
		int cubo = 0;
		
		for (int i=1; i<=N; i++) {
			 quadrado = i * i;
			 cubo  = quadrado * i;
			 System.out.println(i+ " "+ quadrado+ " "+ cubo);
		
		}
		
		sc.close();
		

	}

}
