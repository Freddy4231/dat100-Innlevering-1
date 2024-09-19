package innleveringsoppgaver;

import java.util.Scanner;	

public class O3B {

	public static void main(String[] args) {
		Scanner object = new Scanner(System.in); 
		
		for (int n = 0; n <= 9; n++) {
			System.out.println("Skriv inn et heltall for poengsum: ");
			String tall2 = object.nextLine();
			int tall1 = Integer.parseInt(tall2);
			
		
		while (tall1 > 100 || tall1 < 0) {
			System.out.println("Du har skrevet inn en ugjyldig poengsum");
			System.out.println("Skriv inn en ny poengsum, heltall: "); 
			tall2 = object.nextLine();
			tall1 = Integer.parseInt(tall2);
			}
		
		if (tall1 >= 90) {
			System.out.println("Du har fått karakteren A");
		}
		else if (tall1 >= 80)
			System.out.println("Du har fått karakteren B");
		
		else if (tall1 >= 60) {
			System.out.println("Du har fått karakteren C");
		}
		else if (tall1 >= 50) {
			System.out.println("Du har fått karakteren D");
		}
		else if (tall1 >= 40) {
			System.out.println("Du har fått karakteren E");
		}
		else if (tall1 >= 0) {
			System.out.println("Du har fått karakteren F");
			}

	}
		object.close();	

	}

}
