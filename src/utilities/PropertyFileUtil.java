package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
	
	public static String getValueForKey(String Key) throws Exception{
		
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream("D:\\Batch82\\StockAccounting_Hybrid\\PropertiesFile\\Enviroment.properties");
		
		p.load(fis);
		
	    return p.getProperty(Key);

	}

}
