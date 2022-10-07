package cursoprogamacao;

import java.util.Locale;
import java.util.Scanner;

public class exercicios3_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int cod = sc.nextInt();
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
	
		
		while (cod != 4) {
			
			if (cod <= 0 || cod > 4) {
				cod = sc.nextInt();

			}
		    if (cod == 1) {
				alcool += 1;
			}
			else if (cod == 2) {
				gasolina += 1;
			}
			else if (cod == 3) {
				diesel += 1;
			}
			else if (cod == 4) {
				
				System.out.printf("MUITO OBRIGADO \n Alcool: %d%n Gasolina: %d%n Diesel: %d%n", alcool, gasolina, diesel);	
			continue;
	
			} 
		    cod =0;
		
			
		} 
	
		sc.close();
	}

}
