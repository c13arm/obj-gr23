package routingAlgoritm;
import java.util.ArrayList;

public class Agent extends Message
{
	private int maxNrOfJumps = 50;
	private	int nrOfJumps = 0;
	private ArrayList<Event> event = new ArrayList<Event>();
	private ArrayList<Position> visited = new ArrayList<Position>();
	
	public Agent()
	{
		super(1);
	}
	
	public void update()
	{
		nrOfJumps++;
	}

	public void setVisited(Position p)
	{
		visited.add(p);
	}
	
	public ArrayList<Position> getVisitedList()
	{
		return visited;
	}

}
