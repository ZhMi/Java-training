package zhmi.me.javatraining;

public class TestR_Rectangle 
{
	public static void main(String[] args)
	{
		R_Rectangle r_rectangle = new R_Rectangle(1,2,5,6);
		System.out.println("r_rectangle坐标" + "(" + r_rectangle.point.xAxis + "," + r_rectangle.point.yAxis + ")"); 
		System.out.println("width:" + r_rectangle.getWidth());
		System.out.println("height:" + r_rectangle.getHeight());
		Point p = new Point(7,1);
		System.out.println("点p在矩形中：" + r_rectangle.contains(p));
		r_rectangle.moveTo(7, 8);
		System.out.println("r_rectangle左上角坐标移动后，新的坐标为：" + "(" + r_rectangle.point.xAxis + "," + r_rectangle.point.yAxis + ")"); 
		System.out.println("r_rectangle当前左上角的坐标：" + "(" + r_rectangle.getWhere().xAxis + "," + r_rectangle.getWhere().yAxis + ")"); 
	}
}
