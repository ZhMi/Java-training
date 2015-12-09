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
			System.out.printf("��ߵ� %d ��������ͨ����� \n ",leftCar );
			isCarInTunnel = 1;
		}
	}
	public synchronized void rightCarDrive() 
	{
		if(isCarInTunnel == 0)
		{
			++rightCar;
			System.out.printf("�ұߵ� %d ��������ͨ����� \n ",rightCar);
			isCarInTunnel = 1;
		}
	}
	
	public int isCarInTunnelSignal()
	{
		return this.isCarInTunnel;
	}
}
