package zhmi.me.javatraining;

public class Line
{
	Point pointStart = new Point();
	Point pointEnd = new Point();
    public Line()
    {
    	this.pointStart.xAxis = 0;
    	this.pointStart.yAxis = 0;
    	this.pointEnd.xAxis = 0;
    	this.pointEnd.yAxis = 0;
    }
    public Line(double x,double y)
    {
    	this.pointEnd.xAxis = x;
    	this.pointEnd.yAxis = y;
    }
    public Line(double x1,double y1,double x2,double y2)
    {
    	this.pointStart.xAxis = x1;
    	this.pointStart.yAxis = y1;
    	this.pointEnd.xAxis = x2;
    	this.pointEnd.yAxis = y2;
    }
    public Line(Point p)
    {
    	this.pointStart = p;
    }
    public Line(Point p1,Point p2)//构造方法
    {
    	this.pointStart = p1;
    	this.pointEnd = p2;
    }
    public double length()//求线段的长度
    {
    	double squareLength = Math.pow((this.pointStart.xAxis - this.pointEnd.xAxis), 2)+ Math.pow((this.pointStart.yAxis - this.pointEnd.yAxis), 2);
    	double length = Math.sqrt(squareLength);
    	return length;
    }
    public boolean isHoriszontal()//判断是否为水平线
    {
    	return this.pointStart.yAxis == this.pointEnd.yAxis;
    }
    public boolean isVertical()//判断是否为垂直线
    {
    	return this.pointStart.xAxis == this.pointEnd.xAxis;
    }
    public double slope()//计算线段的斜率
    {
    	if(this.isVertical())
    	{
    		System.out.println("线段为垂直线，没有斜率");
    		return Double.POSITIVE_INFINITY;
    	}
    	else if (this.isHoriszontal())
    	{
    		System.out.println("线段为水平线，斜率为0");
    		return 0;
    	}
    	else
    	{
    		double slope = (this.pointStart.yAxis - this.pointEnd.yAxis) / (this.pointStart.xAxis - this.pointEnd.xAxis) ;
    		return slope;
    	}
    }
    
    public Point middlePoint()//计算线段的中点
    {
    	Point midPoint = new Point();
    	midPoint.xAxis = (this.pointStart.xAxis + this.pointEnd.xAxis) / 2;
    	midPoint.yAxis = (this.pointStart.yAxis + this.pointEnd.yAxis) / 2;
    	return midPoint;
    }
    
    public boolean equals(Line l)//判断两条线段是否相等
    {
    	if(Double.isInfinite(this.slope()))
    	{
    		if(Double.isInfinite(l.slope()))
    		{
    			if(this.pointStart.xAxis == l.pointStart.xAxis)
    			{
    				System.out.println(this.pointStart.xAxis + "," + l.pointStart.xAxis);
    				return true;
    			}
    		}
    	}
    	else
    	{
    		if(this.slope() == l.slope())
    		{
    			if(this.pointStart.yAxis - this.slope()*this.pointStart.xAxis == l.pointStart.yAxis - l.slope()*l.pointStart.xAxis)
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    
    }
}