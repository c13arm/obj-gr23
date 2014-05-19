package routingAlgoritm;
import java.util.Stack;

public class Request extends Message
{
	private Stack<Position> route = new Stack<Position>();
	private int id;
	private int maxNrOfJumps = 45;
	private int nrOfJumps = 0;
	private boolean knowRoute;
	
	public Request(int id)
	{
		super(0);
		this.id = id;
	}
	
	public void update()
	{
		nrOfJumps++;
	}
	
	public Stack<Position> getRoute()
	{
		return route;
	}
	
	public int getNrOfJumps()
	{
		return nrOfJumps;
	}
	
	public int getId()
	{
		return id;
	}
}
