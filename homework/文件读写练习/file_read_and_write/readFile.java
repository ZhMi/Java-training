package zhmi.me.file_read_and_write;

import java.io.*;

/**
 * ʹ��FileInputStream��ȡ�ļ�
 */
public class readFile 
{
	public static void main(String[] args)
	{
		// ����������
		FileInputStream fis = null;
		try
		{
			// ����������
			fis = new FileInputStream("h:\\��������.txt");
			// ��ȡ���ݣ�������ȡ�������ݴ洢��������
			byte[] data = new byte[1024]; // ���ݴ洢������
			int i = 0; // ��ǰ�±�
			// ��ȡ���еĵ�һ���ֽ�����
			int n = fis.read();
			// ���ζ�ȡ����������
			while (n != -1) { // δ��������ĩβ
				// ����Ч���ݴ洢��������
				data[i] = (byte) n;
				// �±�����
				i++;
				// ��ȡ��һ���ֽڵ�����
				n = fis.read();
			}

			// ��������
			String s = new String(data, 0, i);
			// ����ַ���
			System.out.println(s);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				// �ر������ͷ���Դ
				fis.close();
			}
			catch (Exception e) 
			{
				System.out.println("Error!");
			}
		}
	}
}