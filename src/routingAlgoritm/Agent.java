package routingAlgoritm;
import java.util.ArrayList;
import java.util.HashMap;

public class Agent extends Message
{
	private int maxNrOfJumps = 50;
	private	int nrOfJumps = 0;
	private HashMap<Integer,Event> events = new HashMap<Integer,Event>
	private ArrayList<Position> visited = new ArrayList<Position>();
	
	public Agent()
	{
		super(1);
	}
	
	public void updateNrOfJumps()
	{
		nrOfJumps++;
	}
	
	public void setvisitedposition(Position position)
	{
		visited.add(position);
	}

	public ArrayList<Position> getVisitedList()
	{
		return visited;
	}
	
}
