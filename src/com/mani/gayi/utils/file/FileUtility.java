package com.mani.gayi.utils.file;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileUtility {
	
	private static String fileName = "MathLogger.log";
	
//	public static boolean isFileExits()
//	{
//		boolean returnValue = false;
//		
//		File file = new File(fileName);
//		
//		returnValue = file.exists();
//		
//		return returnValue ;
//	}
	
	public static void writeInfoToLog(String logdata)
	{
		File newFile = new File(fileName);
		try {
		// if the file exiss write data data to it.
		if(newFile.exists())
		{
			FileWriter fw = new FileWriter(newFile.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(logdata);
			pw.close();
			bw.close();
		}
		else
		{
			// as file is not present create new file.
			
			
				newFile.createNewFile();
				
				FileWriter fw = new FileWriter(newFile.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println(logdata);
				pw.close();
				bw.close();
				
		}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		
		
	}
	
	public void writeExceptionToLog(String logdata)
	{

		File newFile = new File(fileName);
		try {
		// if the file exiss write data data to it.
		if(newFile.exists())
		{
			FileWriter fw = new FileWriter(newFile.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(logdata);
			pw.close();
			bw.close();
		}
		else
		{
			// as file is not present create new file.
			
			
				newFile.createNewFile();
				
				FileWriter fw = new FileWriter(newFile.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println(logdata);
				pw.close();
				bw.close();
				
		}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
		
		
	
	}
	
	
	
	public static void main(String[] args) {
		FileUtility.writeInfoToLog("Gayi");
	}
	

}
