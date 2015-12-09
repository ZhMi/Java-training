/* Page 161 problem five */

package problem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class problemFive
{
    public static void main(String[] args)
    {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            System.out.println("请输入日期，输入格式为：年-月-日");
            String date = extracted().nextLine();
            Date d1 = df.parse(date);
            System.out.println("日期:" + df.format(d1));
        }
        catch(Exception e)
        {
            ;
        }
    }

    private static Scanner extracted()
    {
        return new Scanner(System.in);
    }
}
