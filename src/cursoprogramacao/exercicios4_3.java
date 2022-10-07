package cursoprogamacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicios4_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		double somaNotas = 0;
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		int pesoFinal = 0;
		double media = 0;
		
		for (int i=0; i<N; i++) {
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			nota1 = nota1 * peso1;
			nota2 = nota2 * peso2;
			nota3 = nota3 * peso3;
			somaNotas = nota1 + nota2 + nota3;
			pesoFinal = peso1 + peso2 + peso3;
			media = somaNotas / pesoFinal;
			System.out.printf("%.1f%n", media);
			
		}
		
		
		sc.close();
		

	}

}
