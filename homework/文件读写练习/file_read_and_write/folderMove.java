package zhmi.me.file_read_and_write;

import java.io.File;

public class folderMove {
	/**
	 * �ƶ�ָ���ļ����ڵ�ȫ���ļ�
	 * 
	 * @param fromDir
	 *            Ҫ�ƶ����ļ�Ŀ¼
	 * @param toDir
	 *            Ŀ���ļ�Ŀ¼
	 * @throws Exception
	 */
	public static void fileMove(String from, String to) throws Exception
	{
		try {
			File dir = new File(from);
			// �ļ�һ��
			File[] files = dir.listFiles();
			if (files == null)
				return;
			// Ŀ��
			File moveDir = new File(to);
			if (!moveDir.exists()) 
			{
				moveDir.mkdirs();
			}
			// �ļ��ƶ�
			for (int i = 0; i < files.length; i++) 
			{
				if (files[i].isDirectory()) 
				{
					fileMove(files[i].getPath(), to + "\\" + files[i].getName());
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