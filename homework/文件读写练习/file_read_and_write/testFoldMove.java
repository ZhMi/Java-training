package zhmi.me.file_read_and_write;

public class testFoldMove 
{
	public static void main(String[] args)
	{
		String from = "H:\\Java-training\\homework\\ÎÄ¼þ¶ÁÐ´Á·Ï°\\file_read_and_write";
		String to   = "H:\\test_out";
		
		folderMove object = new folderMove();
		try 
		{
			folderMove.fileMove(from, to);
			System.out.println("Remove folders successfully.");
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Remove folders fail.");
		}
				
	}

}
