package com.epam.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtils {

	public static String getPropFileData(String fileName,String key) {
		FileInputStream file = null;
		Properties prop=null;
		String value="";
		
		try {
			if (file==null) {
				file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\epam\\config\\"+fileName+".properties");
			}
			prop=new Properties();
			prop.load(file);
			value=prop.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
}
