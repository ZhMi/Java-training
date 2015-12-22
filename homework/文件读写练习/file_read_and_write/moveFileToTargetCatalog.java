package zhmi.me.file_read_and_write;

import java.io.*;  

//  移动文件到指定目录下;  

public class moveFileToTargetCatalog 
{  
    public static void main(String[] args) 
    {  
        try 
        {  
            File afile = new File("G:\\file_move\\out.txt");  
            System.out.println("把 G:\\file_move\\ 目录下的 out.txt 文件移动到 H:\\test\\ 目录下");
            if (afile.renameTo(new File("H:\\test\\" + afile.getName()))) 
            {  
                System.out.println("File is moved successful!");  
            } 
            else 
            {  
                System.out.println("File is failed to move!");  
            }  
        } 
        catch (Exception e) 
        {  
            e.printStackTrace();  
        }  
    }  
}  