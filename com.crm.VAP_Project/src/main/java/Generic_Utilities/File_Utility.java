package Generic_Utilities;
import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	
	public String getComonData(String key) throws Throwable {
		FileInputStream f = new FileInputStream("./comondata.property");
		Properties p = new Properties();
		p.load(f);
		String value = p.getProperty(key);
		return value;
	}

}
