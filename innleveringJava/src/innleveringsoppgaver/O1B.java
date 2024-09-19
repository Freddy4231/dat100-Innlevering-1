package innleveringsoppgaver;

import java.util.Scanner;

public class O1B {

	public static void main(String[] args) {
Scanner object = new Scanner(System.in); 
		
		
		System.out.print("Skriv inn et tall n: ");
		String tall = object.nextLine(); 
		int n = Integer.parseInt(tall);

			if(n > 0) {
				int nfakultet = 1;
				for(int i = 1; i <= n; i++)
					nfakultet *= i;
			System.out.print("n!, (n-fakultet) er lik" + nfakultet);	
			}
			
			else if (n <= 0) {
				System.out.println("Tall mindre enn null, program ferdig");
			}
		object.close();
		}
	}


