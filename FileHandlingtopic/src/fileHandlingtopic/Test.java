package fileHandlingtopic;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
    
		File f1=new File("C:/Users/7348913/Desktop/DB/abhi/checking/Kong.txt");
	   // File f2=new File("C:\\Users\\sudarshan Reddy\\OneDrive\\Desktop\\a1\rockk");
	if(	f1.mkdirs()){
		System.out.println("done");
	}else{
		System.out.println("already present");
	}
		if(f1.mkdir()==false){
			System.out.println("good");
		}
		else{
			System.out.println("could not be done");
		}
//		 File f3=new File("C:\\Users\\sudarshan Reddy\\OneDrive\\Desktop\\a1\\name.doc");
//		if(f3.createNewFile()==true){
//			System.out.println("created");
//		}
//		else{
//			System.out.println("could not creat");
//		}
//		FileWriter fw=new FileWriter(f3);
//       	fw.write("My First");
//       	fw.write(" second");
//       	fw.flush();
//       	fw.close();
       	FileReader fr=new FileReader(f1);
       	char[]arr=new char[(int)f1.length()];
       	fr.read(arr);
       	String s=new String(arr);
       	System.err.println(s);
       	fr.close();
       	
	
       
       	
	}
}
