package zhmi.me.javatraining;

public class TestPoint 
{
	public static void main(String[] args)
    {
		// test "point()"
        Point pointOne = new Point();
        System.out.println("调用Point()构造函数后的点坐标" + "(" + pointOne.xAxis + "," + pointOne.yAxis + ")");   
        
        // test "Point(double x,double y)"
        Point pointTwo = new Point(1.2,3.5);
        System.out.println("调用Point(double x,double y)构造函数后的点坐标" + "(" + pointTwo.xAxis + "," + pointTwo.yAxis + ")");   
        
        // test Point(Point p)
        pointOne.xAxis = 0.9;
        pointOne.yAxis = 1.2;
        Point pointThree = new Point(pointOne);
        System.out.println("调用test Point(Point p)构造函数后的点坐标" + "(" + pointThree.xAxis + "," + pointThree.yAxis + ")");   
       
        // test move(double x,double y)
        pointOne.move(1,2);
        System.out.println("调用move(double x,double y)后的点坐标" + "(" + pointOne.xAxis + "," + pointOne.yAxis + ")");   
        
        // test move(int way)
        pointOne.move(3);
        System.out.println("调用move(int way)后的点坐标" + "(" + pointOne.xAxis + "," + pointOne.yAxis + ")");   
        
        // test public double distance(double x,double y)
        System.out.println("调用distance(double x,double y)后，求出的距离" + pointOne.distance(0.1, 0.3));  
        
        // test public double distance(Point p)
        System.out.println("调用distance(Point p)后，求出的距离" + pointOne.distance(pointTwo));  
        
        // test double getX()
        System.out.println("调用getX()后,返回pointOne的横坐标 X：" + pointOne.getX());
        
        // test double getY()
        System.out.println("调用getY()后,返回pointOne的纵坐标 X：" + pointOne.getY());
    
        // test public String toString()
        System.out.println("调用toString()后,返回pointOne的坐标 ：" + pointOne.toString());
    }

}
