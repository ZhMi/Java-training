package zhmi.me.javatraining;

public class TestPoint 
{
	public static void main(String[] args)
    {
		// test "point()"
        Point pointOne = new Point();
        System.out.println("����Point()���캯����ĵ�����" + "(" + pointOne.xAxis + "," + pointOne.yAxis + ")");   
        
        // test "Point(double x,double y)"
        Point pointTwo = new Point(1.2,3.5);
        System.out.println("����Point(double x,double y)���캯����ĵ�����" + "(" + pointTwo.xAxis + "," + pointTwo.yAxis + ")");   
        
        // test Point(Point p)
        pointOne.xAxis = 0.9;
        pointOne.yAxis = 1.2;
        Point pointThree = new Point(pointOne);
        System.out.println("����test Point(Point p)���캯����ĵ�����" + "(" + pointThree.xAxis + "," + pointThree.yAxis + ")");   
       
        // test move(double x,double y)
        pointOne.move(1,2);
        System.out.println("����move(double x,double y)��ĵ�����" + "(" + pointOne.xAxis + "," + pointOne.yAxis + ")");   
        
        // test move(int way)
        pointOne.move(3);
        System.out.println("����move(int way)��ĵ�����" + "(" + pointOne.xAxis + "," + pointOne.yAxis + ")");   
        
        // test public double distance(double x,double y)
        System.out.println("����distance(double x,double y)������ľ���" + pointOne.distance(0.1, 0.3));  
        
        // test public double distance(Point p)
        System.out.println("����distance(Point p)������ľ���" + pointOne.distance(pointTwo));  
        
        // test double getX()
        System.out.println("����getX()��,����pointOne�ĺ����� X��" + pointOne.getX());
        
        // test double getY()
        System.out.println("����getY()��,����pointOne�������� X��" + pointOne.getY());
    
        // test public String toString()
        System.out.println("����toString()��,����pointOne������ ��" + pointOne.toString());
    }

}
