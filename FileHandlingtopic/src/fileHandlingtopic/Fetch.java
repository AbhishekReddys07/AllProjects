package fileHandlingtopic;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fetch {
	public static void main(String[] args) throws  Exxx, IOException  {
		FileReader f = new FileReader("C:/Users/7348913/Desktop/DB/abhi/checking/ccc.doc");
		System.out.println("inside try block");
		List<String> dataList = new ArrayList<>();
		BufferedReader bufferedReader = new BufferedReader(f);

		//storing purpose
		String line;

		while ((line = bufferedReader.readLine()) != null) {
			dataList.add(line);
		}
		bufferedReader.close();
		int i = 0;
		for (String data : dataList) {
			if (data.contains("kong.automation.client - No drives available for any tests. Kong is going to idle.")) 
			{
				System.out.println("true");
				System.err.println(data);
				String[] s = data.split(",");
				System.out.println(s[i]);
				i++;
			}
			
		}
		f.close();
	}

}