package zhmi.me.javatraining;

public class R_Rectangle extends Rectangle
{
	public Point point = new Point();
	// public Rectangle rectangle;
    
	/*
	public R_Rectangle() 
    {
	}
	*/
    public R_Rectangle(Rectangle r,Point p)//���췽��
    {
    	this.setWidth(r.getWidth());
    	this.setHeight(r.getHeight());
    	this.point = p;
    }
    public R_Rectangle(double x,double y,double width,double height)//���췽��
    {
    	this.setWidth(width);
    	this.setHeight(height);
    	this.point.xAxis = x;
    	this.point.yAxis = y;
    }
    public boolean contains(Point p)//���Բ������Ƿ����ڸþ���������
    {
    	if(p.xAxis >= this.point.xAxis && (p.xAxis <= this.point.xAxis + this.getWidth()))
    	{
    		if(p.yAxis <= this.point.yAxis && (p.yAxis >= this.point.yAxis - this.getHeight()))
    			return true;
    	}
    	return false;
    }
    public void moveTo(double x,double y)//����������ָ��λ��
    {
    	this.point.xAxis = x;
    	this.point.yAxis = y;
    }
    public Point getWhere()//��������ĵ�ǰλ��
    {
    	return this.point;
    }
}