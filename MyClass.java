package threads;

public class MyClass extends Thread{
	int count=0;
	public void run()
	{
		for(int i=0;i<=777;i++)
		{
			count++;
		}
		System.out.println("Completed Thread: "+Thread.currentThread().getName());
		System.out.println("Its Priority: "+Thread.currentThread().getPriority());
		
	}

}
