/**
 * 
 */
package routingAlgoritm;

/**
 * @author fredrik
 *
 */
public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		Environment env = new Environment();
		for(int i = 0; i<1200;i++)
		{
			env.step();
		}
		

	}

}
