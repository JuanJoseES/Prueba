/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.Scanner; 
/**
 *
 * @author juanjo
 */
public class ReadFile {
    
    private ArrayList<String> fileContent; 
    private   File FilePath ;

    
    public ReadFile(String path) {
        FilePath =new File(path);
        ReadFile();
    }

    public ArrayList<String> getFileContent() {
        return fileContent;
    }

    public void setFileContent(ArrayList<String> fileContent) {
        this.fileContent = fileContent;
    }

    public File getProductPath() {
        return FilePath;
    }

    public void setProductPath(File ProductPath) {
        this.FilePath = ProductPath;
    }

    public void ReadFile(){
       fileContent=new ArrayList<>();

    try {
      Scanner myReader = new Scanner(FilePath);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        fileContent.add(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}
