package innleveringsoppgaver;

import java.util.Scanner;	

public class O2B {

	public static void main(String[] args) {
		Scanner object = new Scanner(System.in); 
		
		System.out.println("Skriv inn din bruttoinntekt: ");
		String tall2 = object.nextLine();
		int tall1 = Integer.parseInt(tall2);
		
		
		if (tall1 > 0 && tall1 <= 208050) {
			System.out.println("Ingen skatt");
		}
		else if (tall1 >= 208051 && tall1 <= 292850) {
			double skatt = tall1 * 0.017; 
			System.out.println("Du skal betale en trinnskatt på: " + skatt);
		}
		else if (tall1 >= 292851 && tall1 <= 670000) {
			double skatt = tall1 * 0.04; 
			System.out.println("Du skal betale en trinnskatt på: " + skatt);
		}
		else if (tall1 >= 670001 && tall1 <= 937900) {
			double skatt = tall1 * 0.136; 
			System.out.println("Du skal betale en trinnskatt på: " + skatt);
		}
		else if (tall1 >= 937901 && tall1 <= 1350000) {
			double skatt = tall1 * 0.166; 
			System.out.println("Du skal betale en trinnskatt på: " + skatt);
		}
		else if (tall1 >= 1350001) {
			double skatt = tall1 * 0.176; 
			System.out.println("Du skal betale en trinnskatt på: " + skatt);
		}
		
		
		object.close();	
		}
		
	}


	


