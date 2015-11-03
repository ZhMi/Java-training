/* Page 161 problem one */

package problem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class problemOne
{
    public static void main(String[] args)
    {
        // DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            // Date d1 = df.parse("1949-10-01 13:31:40");
            Date d1 = df.parse("1949-10-01");
            System.out.println("date 1:" + df.format(d1));
            // Date d2 = df.parse("2010-8-15  11:30:24");
            Date d2 = df.parse("2010-8-15");
            System.out.println("date 2:" + df.format(d2));
            long diff = d2.getTime() - d1.getTime();
            long days = diff / (1000 * 60 * 60 * 24);
            System.out.println("两个日期之间相差 ：" + days + "天");
        }
        catch(Exception e)
        {
            ;
        }
    }
}
