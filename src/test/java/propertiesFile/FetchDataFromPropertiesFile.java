package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertiesFile 
{

	public static void main(String[] args) throws IOException 
	{
		//step1 : convert physical file in to java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		
		//step2: create an instance of properties class
		// properties class available in java.util package
		Properties p = new Properties();
		
		//step3: Load properties file in to project
		p.load(fis);
		
		//step4: fetch data from properties file
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));

	}

}
