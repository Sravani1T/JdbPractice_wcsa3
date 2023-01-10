package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataInToPropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		//step1: convert physical file in to java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		
		//step2: 
		Properties p = new Properties();
		
		//step3: load properties file to project
		p.load(fis);
		
		//step4: write data into properties file
		p.put("url2", "https://www.facebook.com/");
		
		//step5: save properties file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/commonData.properties");
		p.store(fos, "Data updated successfully");
		
	}

}
