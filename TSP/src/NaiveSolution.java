import java.util.Arrays;
import java.util.Scanner;

/**
 * Class to calculate the shortest Hamiltonian cycle using the Nearest Neighbour algorithm
 * 
 * @author tino1b2be  & shaaaaaaheeeeen
 *
 */
public class NaiveSolution {

	private final String[] mapLetters = {"a","b","c","d","e","f","A","B","C","D","E","F"};

	private final String EXAMPLE_MAP = "Assignment_Example.txt";
	private final String ZIM_MAP = "Zim_Map.txt";
	private final String EURO_MAP = "Europe_map.txt";
	private final String SA_MAP = "SA_Vacations.txt";
	private final String KRUGER_MAP = "Kruger.txt";
	private final String NAMAQUALAND_MAP = "Namaqualand.txt";

	private String start;
	
	//TODO finish text variables for the maps to be used
	
	private String map;
	
	public NaiveSolution(String mapChoice) {
		setMap(mapChoice);
		setStartingPoint();
	}

	/**
	 * This method asks the user for the starting point
	 */
	
	private void setStartingPoint() {
		start = "";
		Scanner user_input = new Scanner(System.in);
		while (!Arrays.asList(mapLetters).contains(start)) {
			System.out.println("Enter the desired Start Point: ");
			start = user_input.nextLine();
		}


		// TODO this class is to be implemented
		
	}

	/**
	 * This method sets the map to be used
	 * 
	 * @param input
	 */
	private void setMap(String input) {
		
		if (input.equalsIgnoreCase("a")){
			this.map = EXAMPLE_MAP;
		} else if (input.equalsIgnoreCase("b")){
			this.map = ZIM_MAP;
		} else if (input.equalsIgnoreCase("c")){
			this.map = EURO_MAP;
		}else if (input.equalsIgnoreCase("d")){
			this.map = SA_MAP;
		}else if (input.equalsIgnoreCase("e")){
			this.map = KRUGER_MAP;
		}else if (input.equalsIgnoreCase("f")){
			this.map = NAMAQUALAND_MAP;
		}

		// TODO finish off the map selections here up to namaqualand map
	}

}
