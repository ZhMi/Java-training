package zhmi.me.javatraining;
import java.util.Scanner;

public class TestLine 
{
	private static final String UNUSED = "unused";
	private static final String UNUSED2 = UNUSED;
  

	public static void main(String[] args)
	{
		@SuppressWarnings(UNUSED) // problem of jdk causes the warning
		Line lineOne = new Line(1,2,1,3);
		@SuppressWarnings(UNUSED)
		Line lineTwo = new Line(0.0,0.0,0.0,1.0);
		
		double distance = lineOne.length();
		System.out.println("distance of lineOne:" + distance);

		/*
		System.out.println("请输入要判断的线");
		Scanner sc = new Scanner(System.in); 
		Line tempLine = sc.getClass();
		*/
		
        if(lineOne.isHoriszontal())
        {
        	System.out.println("lineOne is horisezontal");
        }
        else
        {   
            if(lineOne.isVertical())
            {
            	System.out.println("lineOne is Vertical");
            }
            else 
            {
            	System.out.println("lineOne is neither horisezontal nor vertical line.");
            }
        }
        
        System.out.println("lineTwo 的斜率 ：" + lineTwo.slope());
        System.out.println("lineTwo 的中点坐标 ：" + "(" + lineTwo.middlePoint().xAxis + "," + lineTwo.middlePoint().yAxis + ")");
        System.out.println("lineTwo 和  lineOne 是否相等 ：" + lineOne.equals(lineTwo));		
	}
	
}
