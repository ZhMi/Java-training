package zhmi.me.file_read_and_write;

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
