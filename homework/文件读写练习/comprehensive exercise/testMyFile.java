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
        System.out.println("���ļ���С���ܿ�ʼʱ��Ϊ��" + (startTime) + "����...");
        try
        {
            long l = 0;
            String path = "H:\\test_out";
            File ff = new File(path);
            if (ff.isDirectory())
            { //���·�����ļ��е�ʱ��
           
                l = objectMyFile.getlength(ff);
                //ת���ļ���С
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
                    
                System.out.println(path + "Ŀ¼�Ĵ�СΪ��" + fileSizeString);
            }
            else 
            {
                System.out.println("     �ļ�����           1");
                System.out.println("�ļ�");
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
                System.out.println(path + "�ļ��Ĵ�СΪ��" + fileSizeString);
            }
           
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("����ʱ��Ϊ��" + (endTime) + "����...");
        System.out.println("�ܹ�����ʱ��Ϊ��" + (endTime - startTime) + "����...");
		
	}
}
