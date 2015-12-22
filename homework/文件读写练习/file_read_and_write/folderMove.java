package zhmi.me.file_read_and_write;

import java.io.File;

public class folderMove {
	/**
	 * 移动指定文件夹内的全部文件
	 * 
	 * @param fromDir
	 *            要移动的文件目录
	 * @param toDir
	 *            目标文件目录
	 * @throws Exception
	 */
	public static void fileMove(String from, String to) throws Exception
	{
		try {
			File dir = new File(from);
			// 文件一览
			File[] files = dir.listFiles();
			if (files == null)
				return;
			// 目标
			File moveDir = new File(to);
			if (!moveDir.exists()) 
			{
				moveDir.mkdirs();
			}
			// 文件移动
			for (int i = 0; i < files.length; i++) 
			{
				if (files[i].isDirectory()) 
				{
					fileMove(files[i].getPath(), to + "\\" + files[i].getName());
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