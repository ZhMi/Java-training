package zhmi.me.file_read_and_write;

import java.io.*;  

//  �ƶ��ļ���ָ��Ŀ¼��;  

public class moveFileToTargetCatalog 
{  
    public static void main(String[] args) 
    {  
        try 
        {  
            File afile = new File("G:\\file_move\\out.txt");  
            System.out.println("�� G:\\file_move\\ Ŀ¼�µ� out.txt �ļ��ƶ��� H:\\test\\ Ŀ¼��");
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