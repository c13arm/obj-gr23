package routingAlgoritm;

public abstract class Message
{
	private int type;
	private int sendDirection;
	
	
	public Message(int type)
	{
		this.type = type;
	}
	

	public abstract void update();
	
	public void setSendDirection(int sendDirection)
	{
		this.sendDirection = sendDirection;
	}

	public int getType()
	{
		return type;
	}
	
	public int getSendDirection()
	{
		return sendDirection;
	}
	

}
