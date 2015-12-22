package file_read_and_write;

import java.io.File;
import java.text.DecimalFormat;

public class testMyFile 
{
	public static void main(String[] args)
	{
		MyFile objectMyFile = new MyFile();
		String source = "H:\\out.txt";
		String dist = "H:\\test_out\\out_copy.txt";
		objectMyFile.copy(source, dist);
	
		
		String sourceTwo = "F:\\source_file";
		String distTwo   = "H:\\test_out";
		
		try 
		{
			objectMyFile.copyDir(sourceTwo, distTwo);
			System.out.println("copy folders successfully.");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("copy folders fail.");
		}
		
       
        long startTime = System.currentTimeMillis();
        System.out.println("求文件大小功能开始时间为：" + (startTime) + "毫秒...");
        try
        {
            long l = 0;
            String path = "H:\\test_out";
            File ff = new File(path);
            if (ff.isDirectory())
            { //如果路径是文件夹的时候
           
                l = objectMyFile.getlength(ff);
                //转换文件大小
                DecimalFormat df = new DecimalFormat("#.00");
                String fileSizeString = "";
                if (l < 1024)
                {
                        fileSizeString = df.format((double) l) + "B";
                } 
                else if (l < 1048576) 
                {
                        fileSizeString = df.format((double) l / 1024) + "K";
                } 
                else if (l < 1073741824) 
                {
                        fileSizeString = df.format((double) l / 1048576) + "M";
                } 
                else 
                {
                        fileSizeString = df.format((double) l / 1073741824) + "G";
                }
                    
                System.out.println(path + "目录的大小为：" + fileSizeString);
            }
            else 
            {
                System.out.println("     文件个数           1");
                System.out.println("文件");
                l = objectMyFile.getlength(ff);
                
                DecimalFormat df = new DecimalFormat("#.00");
                String fileSizeString = "";
                if (l < 1024)
                {
                        fileSizeString = df.format((double) l) + "B";
                } 
                else if (l < 1048576) 
                {
                        fileSizeString = df.format((double) l / 1024) + "K";
                } 
                else if (l < 1073741824) 
                {
                        fileSizeString = df.format((double) l / 1048576) + "M";
                } 
                else 
                {
                        fileSizeString = df.format((double) l / 1073741824) + "G";
                }
                System.out.println(path + "文件的大小为：" + fileSizeString);
            }
           
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("结束时间为：" + (endTime) + "毫秒...");
        System.out.println("总共花费时间为：" + (endTime - startTime) + "毫秒...");
		
	}
}
