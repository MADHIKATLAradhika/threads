package threads;

public class CancelTicket extends Thread {
	Object train,compart;
	public CancelTicket(Object train,Object compart)
	{
		this.train=train;
		this.compart=compart;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("Cancel Ticket locked on Compartment");
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException ie)
			{
				
			}
			System.out.println("Cancel Ticket now waitiong to lock on Train");
		}
			synchronized(compart)
			{
				System.out.println("Cancel Ticket lock on Train");
			}
			
		}
	}
	


