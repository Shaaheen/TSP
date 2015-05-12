
import java.util.*;

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
		String start = "";
		Scanner user_input = new Scanner(System.in);
		//Checks if entered start position is valid
		while (!Arrays.asList(mapLetters).contains(start)) {
			System.out.println("Enter the desired Start Point: ");
			start = user_input.nextLine();
		}

		calculatePath(start);
		// TODO this class is to be implemented
		
	}

	/**
	 * Method to calculate the shortest path around all cities
	 * @param start
	 */
	private void calculatePath(String start) {
		Graph naive = new Graph();
		naive.naiveSolution(start);
	}
//
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
/*
* *An edge in the graph - the cost and link from one node to another
*/
class Edge{
	public Vertex linkedTo;
	public double costTo;

	public Edge(Vertex link,double cost){
		this.linkedTo = link;
		this.costTo = cost;
	}
}
/*
*The actual Node which contains its name and links to adjacent
* nodes
*White = undiscoverd ; Grey = not all adjacencies discovered
* Black = Fully explored
*/

class Vertex{
	public String nodeName;
	public List<Edge> adjacentVert;
	public String colour;

	public Vertex(String name){
		this.nodeName = name;
		adjacentVert = new LinkedList<Edge>();
		colour = "White";
	}

	public void exploring(){
		colour = "Grey";
	}

	public void explored(){
		colour = "Black";
	}

}

class Graph{

	Vertex root = new Vertex("A");
	Vertex adjB = new Vertex("B");
	Vertex adjC = new Vertex("C");



	Graph(){
		root.adjacentVert.add(new Edge(adjB,20));
		root.adjacentVert.add(new Edge(adjC,10));

		adjC.adjacentVert.add(new Edge(root,10));
		adjC.adjacentVert.add(new Edge(adjB,5));

		adjB.adjacentVert.add(new Edge(root,20));
		adjB.adjacentVert.add(new Edge(adjC,5));
	}

	public void naiveSolution(String start){
		double fullDistance = 0.0;
		Vertex startPostion = root;
		PathTree paths = new PathTree(startPostion);
		Queue<Vertex> vertices = new LinkedList<Vertex>();
		vertices.add(startPostion);
		startPostion.explored();
		while (!vertices.isEmpty()){
			Vertex currPosition = vertices.remove();

			for (Edge edges: currPosition.adjacentVert){
				Vertex edgeVertex = edges.linkedTo;
				if (!edgeVertex.colour.equals("Black")){
					fullDistance = fullDistance + edges.costTo;
					paths.insert(currPosition,edgeVertex,edges.costTo);
					//So only adds to list if has't been explored
					if (edgeVertex.colour.equals("White")){
						vertices.add(edgeVertex);
						edgeVertex.exploring();
					}

				}
			}
			//currPosition.explored();
		}
		System.out.println(fullDistance);
	}

}

class Path{
	Vertex root;
	int dist;

}

