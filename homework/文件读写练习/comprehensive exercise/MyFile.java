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
		System.out.println("����������");
		try
		{
			fis = new FileInputStream(source);
			System.out.println("���������� fis ");
			fos = new FileOutputStream(dist);
			System.out.println("���������� fos ");
			System.out.println("��ȡ���ݣ�������ȡ�������ݴ洢�������� ");
		
			byte[] data = new byte[1024]; 
			System.out.println("�������ݴ�ŵ����� ");
		
			int i = 0; 
			System.out.println("���嵱ǰ�±� i = 0 ");
			
			System.out.println("��ȡ���еĵ�һ���ֽ�����");
			int n = fis.read();
			System.out.println("���ζ�ȡ����������");
			while (n != -1) 
			{ 
				data[i] = (byte) n;
				i++;
				n = fis.read();
			}
			System.out.println("��������ĩβ");
			System.out.println("��������");
			String s = new String(data, 0, i);
			System.out.println("����ַ���");
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
				System.out.println("�ر������ͷ���Դ");
				fis.close();
				fos.close();
			}
			catch (Exception e) 
			{
				System.out.println("Error!");
			}
		}
	}
    public long getlength(File f)throws Exception//ȡ���ļ��д�С
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
			// �ļ�һ��
			File[] files = dir.listFiles();
			if (files == null)
				return;
			// Ŀ��
			File moveDir = new File(dist);
			if (!moveDir.exists()) 
			{
				moveDir.mkdirs();
			}
			// �ļ��ƶ�
			for (int i = 0; i < files.length; i++) 
			{
				if (files[i].isDirectory()) 
				{
					copyDir(files[i].getPath(), dist + "\\" + files[i].getName());
					// �ɹ���ɾ��ԭ�ļ�
					//files[i].delete();
				}
				File moveFile = new File(moveDir.getPath() + "\\" + files[i].getName());
				// Ŀ���ļ����´��ڵĻ���ɾ��
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
		

