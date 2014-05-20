package routingAlgoritm;

public abstract class Message
{
	int type;
	int sendDirection;
	
	public Message(int type)
	{
		this.type = type;
	}
	
	public int getType()
	{
		return type;
	}
	
	public abstract void updateNrOfJumps();
	
	public int getSendDirection()
	{
		return sendDirection;
	}
	
	public void setSendDirection(int sendDirection)
	{
		this.sendDirection = sendDirection;
	}
}
