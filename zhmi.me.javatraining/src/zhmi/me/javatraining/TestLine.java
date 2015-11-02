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
		System.out.println("������Ҫ�жϵ���");
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
        
        System.out.println("lineTwo ��б�� ��" + lineTwo.slope());
        System.out.println("lineTwo ���е����� ��" + "(" + lineTwo.middlePoint().xAxis + "," + lineTwo.middlePoint().yAxis + ")");
        System.out.println("lineTwo ��  lineOne �Ƿ���� ��" + lineOne.equals(lineTwo));		
	}
	
}
