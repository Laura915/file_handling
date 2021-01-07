package com.files;

import java.io.*;

import com.files.util.Constants;

//As a developer, write a program to read, write, and append to a file.

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "created file");
        // CreateFile.createFile();
        createFileUsingFileClass();
        modifyFile(Constants.RecordedPath,"","new string");
        
        
     
    }    
    
    private static void createFileUsingFileClass() throws IOException
    {
    	File file = new File(Constants.RecordedPath);
          
  
          //Create the file
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          //Write Content
          FileWriter writer = new FileWriter(file);
          writer.write("Test data");
          writer.close();
    }
    
    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File(filePath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        
    }
    
}
