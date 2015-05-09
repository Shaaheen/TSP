/**
 * User Interface for the Travelling Salesman problem
 * 
 * @author tino1b2be & shaaaaaaheeeeen
 */
import java.util.Scanner;

public class TSP_UserInterface {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("___+++Welcome to the Travelling Sales Man Solution!+++___"
				+ "\nPlease select the map:"
				+ "\nA: Assignment Example (5 verticies)"
				+ "\nB: Zimbabwe (7 destinations)"
				+ "\nC: Europe (7 destinations)"
				+ "\nD: South Africa Vacation Destinations (15 destinations)"
				+ "\nE: Kruger Park (18 destinations)"
				+ "\nF: NamaquaLand (24 Destinations)"
				+ "\nor enter \"X\" to quit the program");
		do{
		String mapChoice = sc.nextLine();
		
		// i know there is a shorter way to this but that comes later bro. Alright bro - S
		if (mapChoice.equalsIgnoreCase("a") || mapChoice.equalsIgnoreCase("b") || mapChoice.equalsIgnoreCase("c") || mapChoice.equalsIgnoreCase("d") || mapChoice.equalsIgnoreCase("e") ||mapChoice.equalsIgnoreCase("f")){
			System.out.println("\nPlease select an algorithm to use:"
				+ "\n1: The Naive Solution."
				+ "\n2: Nearest Neighbour Algorithm."
				+ "\nor enter \"X\" to quit the program");
			do {
				String choice = sc.nextLine();
				if (choice.equalsIgnoreCase("x")){
					System.out.println("Program exiting...");
					System.exit(0);	
				}	
				else if (choice.equals("1")){
					new NaiveSolution(mapChoice);
				}
				else if (choice.equals("2")){
					new NearestNeighboour(mapChoice);
				}
				else 
					System.out.println("Please check your entry and try again.");
			}while (true);
		
		} else if (mapChoice.equalsIgnoreCase("x"))
			System.exit(0);
		else 
			System.out.println("Please check your entry and try again.");
		}while(true);
	}
}
