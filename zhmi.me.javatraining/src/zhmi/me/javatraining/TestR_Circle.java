package zhmi.me.javatraining;

public class TestR_Circle 
{
	public static void main(String[] args)
	{
		Point p = new Point(4,7);
		R_Circle r_circle = new R_Circle();
		r_circle.setRadius(4);
		r_circle.point.xAxis = 0;
		r_circle.point.yAxis = 0;
		System.out.println("Ô²°üº¬Pµã£º" + r_circle.contains(p));		
	}
}
