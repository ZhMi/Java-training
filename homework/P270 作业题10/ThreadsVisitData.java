public class ThreadsVisitData 
{
	public static void main(String[] args) 
	{
		ShareData share = new ShareData();
		share.getSignal(0);
		new Thread(new Runnable() 
		{	
			public void run() 
			{
				for (int i = 0; i < 100; i++) 
				{
					if(share.isCarInTunnelSignal() == 0)
					{
						share.leftCarDrive();
						share.getSignal(1);
						try 
						{
							Thread.sleep(300);
						} 
						catch (InterruptedException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						share.getSignal(0);
					}
				}
			}
		}
		).start();
		
		new Thread(new Runnable() 
		{
			public void run() 
			{
				for (int i = 0; i < 100; i++)
				{
					if(share.isCarInTunnelSignal() == 0)
					{
						share.rightCarDrive();
						share.getSignal(1);
					try 
					{
						Thread.sleep(100);
					} 
					catch (InterruptedException e)
					{
						e.printStackTrace();
					}
					share.getSignal(0);
					}
				}
				
			}
		}
		).start();
	}
}

