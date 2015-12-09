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
    public R_Rectangle(Rectangle r,Point p)//构造方法
    {
    	this.setWidth(r.getWidth());
    	this.setHeight(r.getHeight());
    	this.point = p;
    }
    public R_Rectangle(double x,double y,double width,double height)//构造方法
    {
    	this.setWidth(width);
    	this.setHeight(height);
    	this.point.xAxis = x;
    	this.point.yAxis = y;
    }
    public boolean contains(Point p)//测试参数点是否落在该矩形区域内
    {
    	if(p.xAxis >= this.point.xAxis && (p.xAxis <= this.point.xAxis + this.getWidth()))
    	{
    		if(p.yAxis <= this.point.yAxis && (p.yAxis >= this.point.yAxis - this.getHeight()))
    			return true;
    	}
    	return false;
    }
    public void moveTo(double x,double y)//将区域移至指定位置
    {
    	this.point.xAxis = x;
    	this.point.yAxis = y;
    }
    public Point getWhere()//返回区域的当前位置
    {
    	return this.point;
    }
}