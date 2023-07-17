package threads;

public class TrainTickets implements Runnable {
	int wanted,available=1;
	public TrainTickets(int i)
	{
		wanted=i;
	}
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Available Berths are: "+available);
			if(available>=wanted)
			{
				String name=Thread.currentThread().getName();
				System.out.println(wanted+" Berth Reserved for "+name);
				try
				{
					Thread.sleep(1500);
					available-=wanted;
				}
				catch(InterruptedException ie)
				{
					
				}
			}
			else
				System.out.println("No berth is available");
		}
	}

}
