/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IoExample;



import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author A-2
 */
public class IoRead {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader ("C:\\Users\\A-2\\Desktop\\myData.txt");
            int charecter;
            System.out.println("\n Reading from File: ");
            while ((charecter = reader.read()) != -1) {
                System.out.print((char) charecter);
            }
            
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
//     public String x = charecter;
}
