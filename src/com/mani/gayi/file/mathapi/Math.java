
package com.mani.gayi.file.mathapi;
import com.mani.gayi.utils.file.FileProperties;
import com.mani.gayi.utils.file.FileUtility;


public class Math {
	
	FileProperties readProperties = new FileProperties();
	
	
	
	public int division(int input1,int input2)
	{
		
		String loglevel = readProperties.getFileProperties().getProperty("log_level");
		
		System.out.println("Log Level "+loglevel);
		
		if(loglevel.equals("HIGH")||loglevel.equals("INFO"))
		
		FileUtility.writeInfoToLog("Entering Math::divison input1: "+input1+" input2: "+input2);
		
			
		int result = 0;
		
		try
		{
			result = input1/input2;
		}
		catch(ArithmeticException exception)
		{
			if(loglevel.equals("HIGH")||loglevel.equals("EXCEPTION"))
			FileUtility.writeInfoToLog("Exception data "+exception.getMessage());
		}
		
		if(loglevel.equals("HIGH")||loglevel.equals("INFO"))
		
		FileUtility.writeInfoToLog("Exiting Math::divison input1: result "+result);
		
		
		return result;
	}

}
