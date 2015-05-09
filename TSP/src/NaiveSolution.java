/**
 * Class to calculate the shortest Hamiltonian cycle using the Nearest Neighbour algorithm
 * 
 * @author tino1b2be  & shaaaaaaheeeeen
 *
 */
public class NaiveSolution {

	private final String EXAMPLE_MAP = "Assignment_Example.txt";
	private final String ZIM_MAP = "Zim_Map.txt";
	private final String EURO_MAP = "Europe_map.txt";
	
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
		}
		// TODO finish off the map selections here up to namaqualand map
	}

}
