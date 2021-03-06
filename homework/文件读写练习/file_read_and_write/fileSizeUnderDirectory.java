package zhmi.me.file_read_and_write;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class fileSizeUnderDirectory
{
   /*
    public long getFileSizes(File f) throws Exception{//取得文件大小
        long s=0;
        if (f.exists()) {
            FileInputStream fis = null;
            fis = new FileInputStream(f);
           s= fis.available();
        } else {
            f.createNewFile();
            System.out.println("文件不存在");
        }
        return s;
    }
     */
    // 递归取得文件夹（包括子目录）中所有文件的大小
    public long getFileSize(File f)throws Exception//取得文件夹大小
    {
        long size = 0;
        File flist[] = f.listFiles();
        for (int i = 0; i < flist.length; i++)
        {
            if (flist[i].isDirectory())
            {
                size = size + getFileSize(flist[i]);
            } else
            {
                size = size + flist[i].length();
            }
        }
        return size;
    }
    public String FormetFileSize(long fileS) {//转换文件大小
        DecimalFormat df = new DecimalFormat("#.00");
        String fileSizeString = "";
        if (fileS < 1024) {
            fileSizeString = df.format((double) fileS) + "B";
        } else if (fileS < 1048576) {
            fileSizeString = df.format((double) fileS / 1024) + "K";
        } else if (fileS < 1073741824) {
            fileSizeString = df.format((double) fileS / 1048576) + "M";
        } else {
            fileSizeString = df.format((double) fileS / 1073741824) + "G";
        }
        return fileSizeString;
    }
   
    public long getlist(File f){//递归求取目录文件个数
        long size = 0;
        File flist[] = f.listFiles();
        size=flist.length;
        for (int i = 0; i < flist.length; i++) {
            if (flist[i].isDirectory()) {
                size = size + getlist(flist[i]);
                size--;
            }
        }
        return size;
    }
    public long getDir(File f){//递归求取目录中文件（包括目录）的个数
        long size = 0;
        File flist[] = f.listFiles();
        size=flist.length;
        for (int i = 0; i < flist.length; i++) {
            if (flist[i].isDirectory()) {
                size = size + getDir(flist[i]);
               
            }
        }
        return size;
    }
   
    public static void main(String args[])
    {
        fileSizeUnderDirectory g = new fileSizeUnderDirectory();
        
       
        long startTime = System.currentTimeMillis();
        System.out.println("开始时间为：" + (startTime) + "毫秒...");
        try
        {
            long l = 0;
            String path = "G:\\eclipse workspace\\zhmi.me.file_read_and_write";
            File ff = new File(path);
            if (ff.isDirectory()) { //如果路径是文件夹的时候
                System.out.println("文件个数           " + g.getlist(ff));
                System.out.println("文件和目录总个数           " + g.getDir(ff));
            
                System.out.println("目录");
                l = g.getFileSize(ff);
                System.out.println(path + "目录的大小为：" + g.FormetFileSize(l));
            } else {
                System.out.println("     文件个数           1");
                System.out.println("文件");
                l = g.getFileSize(ff);
                System.out.println(path + "文件的大小为：" + g.FormetFileSize(l));
            }
           
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("结束时间为：" + (endTime) + "毫秒...");
        System.out.println("总共花费时间为：" + (endTime - startTime) + "毫秒...");
        
    }
}