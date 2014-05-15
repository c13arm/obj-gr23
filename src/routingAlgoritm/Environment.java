package routingAlgoritm;

import java.util.ArrayList;

/**
 * 
 * @author fredrik
 *
 */
public class Environment
{
	private final int width = 5;
	private final int height = 5;
	
	private Node [][]nodes;
	private int time;
	private ArrayList<Node> requestNodes;
	private int currentId;
	
	public Environment()
	{
		nodes = new Node[width][height];
		requestNodes = new ArrayList<Node>();
		createNodes();
	}
	/**
	 * 
	 */
	private void createNodes()
	{
		int x;
		int y;
		
		for(int i = 0;i<height;i++)
		{
			for(int j = 0;j<width;j++)
			{
				nodes[j][i] = new Node(new Position(j,i));
			}
		}
		
		for(int i = 0;i<4;i++)
		{
			x = (int)(Math.random()*(width));
			y = (int)(Math.random()*height);
			if(!requestNodes.contains(nodes[x][y]))
			{
				requestNodes.add(nodes[x][y]);
			}
			else 
				i--;
		}
	}
	/**
	 * 
	 */
	public void step()
	{
		int id = 1+(int)(Math.random()*(currentId));
		time++;
		for(int i = 0;i<height;i++)
		{
			for(int j = 0;j<width;j++)
			{
				checkForEvents(nodes[j][i]);
				
				if(isRequestNode(nodes[j][i]) && time%400 == 0 && currentId>0)
				{
					nodes[j][i].sendRequest(id);
					System.out.println("RequestNode at:" + j+"," + i+" with id:"+id);
				}
				receiveMessage(nodes[j][i]);
				createRequest(nodes[j][i]);
				sendMessage(nodes[j][i]);
			}
		}
	}
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	private boolean isRequestNode(Node node)
	{
		if(requestNodes.contains(node))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param node
	 */
	private void checkForEvents(Node node)
	{
		//kolla om ett event ska uppstå.
		double num = Math.random();
		if(num < 0.0001)
		{
			System.out.println("Event detected.");
			node.createEvent(time,getNewId());
			checkForAgent(node);
		}
		
	}
	
	/**
	 * 
	 * @param node
	 */
	private void checkForAgent(Node node)
	{
		//kolla om det ska uppstå en agent.
		double num = Math.random();
		if(num < 0.5)
		{
			System.out.println("Agent was created.");
			node.createAgent();
		}
	}
	
	/**
	 * 
	 * @param node
	 */
	private void receiveMessage(Node node)
	{
		node.receiveMessage();
	}
	/**
	 * 
	 * @param node
	 */
	private void createRequest(Node node)
	{
		node.checkRequest();
	}
	/**
	 * 
	 * @param node
	 */
	private void sendMessage(Node node)
	{
		if(!node.hasReceivedMessage())
		{
			node.forwardMessage();
		}
	}
	/**
	 * 
	 * @return
	 */
	public int getNewId()
	{
		currentId++;
		return currentId;
	}
	/**
	 * Returnerar nuvarande tidssteg
	 * @return time - nuvarande tidssteg
	 */
	public int getTime()
	{
		return time;
	}
	/**
	 * Metod som tar in en position och returnerar Noden för denna position.
	 * @param pos - Position som man vill ha nod till.
	 * @return nodes[x][y] - Noden på positionen som gavs.
	 */
	public Node getNodeInPos(Position pos)
	{
		int x = pos.getX();
		int y = pos.getY();
		return nodes[x][y];
	}
}
