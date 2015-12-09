class ShareData 
{
	private int isCarInTunnel = 0;
	private int leftCar = 0;
	private int rightCar = 0;
		
	public void getSignal(int signal)
	{
		this.isCarInTunnel = signal;
	}
	
	public synchronized void leftCarDrive() 
	{	
		if(isCarInTunnel == 0)
		{
			++leftCar;
			System.out.printf("左边第 %d 辆车正在通过隧道 \n ",leftCar );
			isCarInTunnel = 1;
		}
	}
	public synchronized void rightCarDrive() 
	{
		if(isCarInTunnel == 0)
		{
			++rightCar;
			System.out.printf("右边第 %d 辆车正在通过隧道 \n ",rightCar);
			isCarInTunnel = 1;
		}
	}
	
	public int isCarInTunnelSignal()
	{
		return this.isCarInTunnel;
	}
}
