package uk.co.brotherlogic.forum;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TransferProperties {

	static Properties props;

	public static String getProperty(String key) {
		if (props == null)
			buildProps();
		return props.getProperty(key);
	}

	private static void buildProps() {
		props = new Properties();
		try {
			FileInputStream fis = new FileInputStream("forum.properties");
			props.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
