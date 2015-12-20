package zhmi.me.file_read_and_write;

public class testFileMove 
{
	public static void main(String[] args)
	{
		String from = "H:\\source\\files";
		String to   = "D:\\target\\files";
		try 
		{
			fileMove fileMoveObject = new fileMove();
			fileMoveObject.fileMove(from, to);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
