package zhmi.me.javatraining;

public class TestR_Rectangle 
{
	public static void main(String[] args)
	{
		R_Rectangle r_rectangle = new R_Rectangle(1,2,5,6);
		System.out.println("r_rectangle����" + "(" + r_rectangle.point.xAxis + "," + r_rectangle.point.yAxis + ")"); 
		System.out.println("width:" + r_rectangle.getWidth());
		System.out.println("height:" + r_rectangle.getHeight());
		Point p = new Point(7,1);
		System.out.println("��p�ھ����У�" + r_rectangle.contains(p));
		r_rectangle.moveTo(7, 8);
		System.out.println("r_rectangle���Ͻ������ƶ����µ�����Ϊ��" + "(" + r_rectangle.point.xAxis + "," + r_rectangle.point.yAxis + ")"); 
		System.out.println("r_rectangle��ǰ���Ͻǵ����꣺" + "(" + r_rectangle.getWhere().xAxis + "," + r_rectangle.getWhere().yAxis + ")"); 
	}
}
