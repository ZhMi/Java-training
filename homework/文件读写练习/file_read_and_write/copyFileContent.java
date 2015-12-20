package zhmi.me.file_read_and_write;

import java.io.*;

/**
 * 使用FileInputStream读取文件
 * 读一个文本文件，并把文件写入另外一个文件中
 */

public class copyFileContent 
{
	public static void main(String[] args)
	{
		FileInputStream  fis = null;
		FileOutputStream fos = null;
		System.out.println("声明流对象");
		try
		{
			fis = new FileInputStream("H:\\垃圾短信.txt");
			System.out.println("创建流对象 fis ");
			fos = new FileOutputStream("H:\\out.txt");
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
				System.out.println("未到达流的末尾, 将有效数据存储到数组中");
				data[i] = (byte) n;
				System.out.println("下标增加");
				i++;
				System.out.println("读取下一个字节的数据");
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
}