package zhmi.me.file_read_and_write;

import java.io.*;

/**
 * 使用FileOutputStream写文件示例
 */
public class writeFile 
{
	public static void main(String[] args) 
	{
		String s = "Java语言";
		int n = 100;
		// 声明流对象
		FileOutputStream fos = null;
		try 
		{
			// 创建流对象
			fos = new FileOutputStream("H:\\out.txt");
			// 转换为byte数组
			byte[] b1 = s.getBytes();
			// 换行符
			byte[] b2 = "\r\n".getBytes();
			byte[] b3 = String.valueOf(n).getBytes();
			// 依次写入文件
			fos.write(b1);
			fos.write(b2);
			fos.write(b3);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fos.close();
			} 
			catch (Exception e)
			{
				System.out.println("Error!");
			}
		}
	}
}