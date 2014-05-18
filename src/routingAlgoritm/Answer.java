package routingAlgoritm;

import java.util.Stack;

public class Answer extends Message
{
	private Stack<Position> route = new Stack<Position>();
	private Event event;
	
	public Answer(Stack<Position> route, Event event)
	{
		super(2);
		this.route = route;
		this.event = event;
	}
	
	public void update()
	{
		/* Uppdatera event här? */
	}
	
	public Event getEvent()
	{
		return event;
	}
	
	public Position getFirstPosInStack()
	{
		if(route.size()>1)
		{
			return route.pop();
		}
		else
			return route.peek();
	}
}
