package zhmi.me.javatraining;

class Test
{
    IRange r;
    Point p;
    public Test(IRange r, Point p)
    {
        this.r=r;
        this.p=p;
    }
    public void go(int way)
    {
        while(r.contains(p))
        	p.move(way);
        System.out.println("p�����յ����꣺" + "(" + p.xAxis + "," + p.yAxis + ")");
    }
    
    public static void main(String[] args)
    {
        Point p=new Point(90, 90);
        IRange r=new R_Circle(50, p);// pΪԲ�ģ�50Ϊ�뾶
        Point p1=new Point(90, 90);
        new Test(r, p1).go(Point.EAST);
    }
}