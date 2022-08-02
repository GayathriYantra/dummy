package com.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * 
 * @author admin
 *
 */
public class FileUtility 
{
	/**
	 * to fetch the common data from the property file
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyValue(String key) throws Throwable
	{
		FileInputStream fileinputstream=new FileInputStream(IConstants.filePath);
		Properties properties= new Properties();
		properties.load(fileinputstream);
		String value = properties.getProperty(key, "IncorrectData");
		return value;
	}
}
