package com.mani.gayi.utils.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// there is a properties file and this file will read that properties file.

public class FileProperties {

	public  Properties getFileProperties() {
		Properties properties = new Properties();
		// property file name.
		String input = "log.properties";

		// Read the properties file in the local Project path.
		InputStream inputStream = getClass().getClassLoader()
				.getResourceAsStream(input);

		if (inputStream != null) {
			try {
				properties.load(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				throw new FileNotFoundException("property file '" + input
						+ "' not found in the classpath");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return properties;
	}

}
