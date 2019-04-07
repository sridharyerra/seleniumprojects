package qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	public TestBase(){
	try
	{
	prop=new Properties();
	FileInputStream is=new FileInputStream("/seleniumproject/RestfulWebservices/src/main/java/qa/configfiles/configproperties");
    prop.load(is);
    } catch(FileNotFoundException e){
    	e.printStackTrace();
    } catch(IOException e){
    	e.printStackTrace();
    }

	}
}
