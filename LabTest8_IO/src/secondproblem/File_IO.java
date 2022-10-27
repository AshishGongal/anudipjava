package secondproblem;

import java.io.File;

public class File_IO 
{

	public static void main(String[] args)
	{ 
		//directory
		File dir=new File("F:");  
	    File files[]=dir.listFiles(); //read all files in given directory 
	    for(File file:files)
	    {  
	        System.out.println("\n"+file.getName()+file.getAbsolutePath()+" Can Write: "+file.canWrite()+
	        		
	       "Is Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes"+"Last modified"+file.lastModified());  
	    }  
	}

}
