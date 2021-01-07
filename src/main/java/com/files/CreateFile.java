package com.files;

import java.io.File;
import java.io.IOException;
import com.files.util.Constants;

public class CreateFile {
	
	public static void createFile() {
		try {
			
//			File myObj= new File("/Users/me/eclipse-workspace/text.txt");
			File myObj = new File(Constants.RecordedPath);
			
			if (myObj.createNewFile()) {
				System.out.println("File created name: "+ myObj.getName());
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("Error occured");
		}
	}
	
}
