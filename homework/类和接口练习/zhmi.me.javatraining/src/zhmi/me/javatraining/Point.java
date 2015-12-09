package zhmi.me.javatraining;

public class Point
{
    public final static int EAST=1;
    public final static int SOUTH=2;
    public final static int WEST=3;
    public final static int NORTH=4;
 
    public double xAxis;
    public double yAxis;
   
    
    public Point()
    {
    	this.xAxis = 0;
    	this.yAxis = 0;
    }
    public Point(double x,double y)
    {
    	this.xAxis = x;
    	this.yAxis = y;
    }
    public Point(Point p)
    {
    	this.xAxis = p.getX();
    	this.yAxis = p.getY();
    }
    
    public void move(double x,double y)
    {
    	this.xAxis = x;
    	this.yAxis = y;
    }//��ǰ���ƶ���ָ��λ��
    public void move(int way)
    {
    	switch(way)
    	{
    		case 1 : ++this.xAxis;break;
    		case 2 : --this.yAxis;break;
    		case 3 : --this.xAxis;break;
    		case 4 : ++this.xAxis;break;
    		default : System.out.println("illegal input,w should be an integer between 1 and 4.");
    	}
    }//��ָ���ķ��򽫵�ǰ���ƶ�1����λ
    public double distance(double x,double y)
    {
    	double squareDistance = Math.pow((this.xAxis - x),2) + Math.pow((this.yAxis-y),2);
    	double distance = Math.sqrt(squareDistance);
    	return distance;
    }//��������֮�����
    public double distance(Point p)
    {
    	double squareDistance = Math.pow((this.xAxis - p.getX()),2) + Math.pow((this.yAxis-p.getY()),2);
    	double distance = Math.sqrt(squareDistance);
    	return distance;
    }//��������֮�����
    public double getX()
    {
    	return this.xAxis;
    }//���ص�ǰ��x����
    public double getY()
    {
    	return this.yAxis;
    }//���ص�ǰ��y����
    public String toString()
    {
    	String stringPoint  = "(" + this.getX() + "," + this.getY() + ")" ;
     	return stringPoint;
    }//��(x,y)��ʽ���ص�ǰ����ַ�����ʾ
}