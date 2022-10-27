package firstProblem;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LastTenChars
{

	public static void main(String[] args) throws IOException 
	{    
		//creating a file
		File f=new File("F:\\Ashish\\file1.txt");
		//creating random access file
		RandomAccessFile raf = new RandomAccessFile(f,"r");
		int length = (int) raf.length();
		//checking given file length greter than 10 or not
		if (length > 10) 
		 {
			//pointing to last 10 chars
            raf.seek(length - 10);  
		 }
            
            //System.out.println(raf.readLine());
         //logic to print last 10 chars
		byte[] b = new byte[10];
		raf.read(b);
		for (int i = 0; i < 10; i++)
            {
                System.out.print((char) b[i]);
            }
		System.out.println();
        raf.close();  //close the raf
	  
	}

}
