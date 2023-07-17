package threads;

public class Deadlock {
public static void main(String[] args)
{
	Object train=new Object();
	Object compart=new Object();
	
	BookTicket bt=new BookTicket(train,compart);
	CancelTicket ct=new CancelTicket(train,compart);
	
	Thread t1=new Thread(bt);
	Thread t2=new Thread(ct);
	
	t1.start();
	t2.start();
	
}
}
