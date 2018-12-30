package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties por;
	
	
	public ConfigDataProvider()
	{
		

		File src=new File("./configuration/config.properties");
		
		try
		{
			FileInputStream fis=new FileInputStream(src);
			Properties pro=new Properties();
			por.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is"+e.getMessage());
			
		}
	
	}
	
	public String getApplicationUrl() {
		String url=por.getProperty("url");
		return url;
		
	}
	
	
	public String getChromepath() {
		String url=por.getProperty("chromepath");
		return url;
		
		
		
	}
}

