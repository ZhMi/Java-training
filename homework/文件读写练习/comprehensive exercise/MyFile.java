package file_read_and_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;  
  

public class MyFile 
{
	public void copy(String source, String dist)
	{
		FileInputStream  fis = null;
		FileOutputStream fos = null;
		System.out.println("声明流对象");
		try
		{
			fis = new FileInputStream(source);
			System.out.println("创建流对象 fis ");
			fos = new FileOutputStream(dist);
			System.out.println("创建流对象 fos ");
			System.out.println("读取数据，并将读取到的数据存储到数组中 ");
		
			byte[] data = new byte[1024]; 
			System.out.println("建立数据存放的数组 ");
		
			int i = 0; 
			System.out.println("定义当前下标 i = 0 ");
			
			System.out.println("读取流中的第一个字节数据");
			int n = fis.read();
			System.out.println("依次读取后续的数据");
			while (n != -1) 
			{ 
				data[i] = (byte) n;
				i++;
				n = fis.read();
			}
			System.out.println("到达流的末尾");
			System.out.println("解析数据");
			String s = new String(data, 0, i);
			System.out.println("输出字符串");
			System.out.println(s);
			byte[] b1 = s.getBytes();
			fos.write(b1);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				System.out.println("关闭流，释放资源");
				fis.close();
				fos.close();
			}
			catch (Exception e) 
			{
				System.out.println("Error!");
			}
		}
	}
    public long getlength(File f)throws Exception//取得文件夹大小
    {
        long size = 0;
        File flist[] = f.listFiles();
        for (int i = 0; i < flist.length; i++)
        {
            if (flist[i].isDirectory())
            {
                size = size + getlength(flist[i]);
            } else
            {
                size = size + flist[i].length();
            }
        }
        return size;
    }

	public void copyDir(String source, String dist)throws Exception
	{
		try {
			File dir = new File(source);
			// 文件一览
			File[] files = dir.listFiles();
			if (files == null)
				return;
			// 目标
			File moveDir = new File(dist);
			if (!moveDir.exists()) 
			{
				moveDir.mkdirs();
			}
			// 文件移动
			for (int i = 0; i < files.length; i++) 
			{
				if (files[i].isDirectory()) 
				{
					copyDir(files[i].getPath(), dist + "\\" + files[i].getName());
					// 成功，删除原文件
					//files[i].delete();
				}
				File moveFile = new File(moveDir.getPath() + "\\" + files[i].getName());
				// 目标文件夹下存在的话，删除
				if (moveFile.exists()) 
				{
					moveFile.delete();
				}
				files[i].renameTo(moveFile);
			}
		} catch (Exception e) {
			throw e;
		}
	}
}
		

