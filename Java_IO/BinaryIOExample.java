package IoExample;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author A-2
 */
public class BinaryIOExample {
    public static void main(String[] args) {
//        try {
//            File input = new File ("F:\\Pictures\\download (3).jpg");
//            File output = new File ("F:\\Pictures\\test\\copy.jpg");
//            
//            if (!output.exists()){
//            output.getParentFile().mkdirs();
//            output.createNewFile();
//            }
//            FileInputStream fis = new FileInputStream(input);
//            FileOutputStream fos = new FileOutputStream(input);
//            
//            byte [] buffer = new byte [4096];
//            int bytesRead;
//            
//        } catch (Exception e) {
//        }
        
//        try {
//            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\Pictures\\download (3).jpg"));
//            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\Pictures\\test\\copy.jpg"));
//            
//            byte [] buffer = new byte [4096];
//            int bytesRead;
//            
//            while ((bytesRead = bis.read(buffer)) != 1) {
//            bos.write(buffer, 0, bytesRead);
//            }
//            
//            System.out.println("File copied using buffered streams");
//        } catch (IOException e) {
//            System.err.println("Error copying file" + e.getMessage());
//        }
        Path fileOldPath = Paths.get("F:\\Pictures\\IRUL (2021) Dual 1080p.mkv");
        Path fileNewPath = Paths.get("F:\\Pictures\\big.mp4");


        try {
            Files.createDirectories(fileNewPath.getParent());
            Files.copy(fileOldPath, fileNewPath, StandardCopyOption.REPLACE_EXISTING);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    
    
            
}
