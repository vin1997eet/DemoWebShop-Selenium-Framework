package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.File;

public class ConfigReader {

	private static Properties prop;
	static
	{
		try {
			prop=new Properties();
			String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "config.properties";
			FileInputStream fis=new FileInputStream(path);
			prop.load(fis);
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static String get(String key)
	{
		return prop.getProperty(key);
	}
	
}
