package threads;

public class BookTicket extends Thread{
	Object train,compart;
	public BookTicket(Object train,Object compart)
	{
	this.train=train;
	this.compart=compart;
	}
	public void run()
	{
		synchronized(train)
		{
			System.out.println("Book Ticket locked on Train");
			try {
			Thread.sleep(150);
			}
			catch(InterruptedException ie)
			{
				
			}
			System.out.println("Book Ticket now waiting to lock on compartment....");
		}
		synchronized(compart)
		{
			System.out.println("Book Ticket locked on Compartment");
		}
	}
}
