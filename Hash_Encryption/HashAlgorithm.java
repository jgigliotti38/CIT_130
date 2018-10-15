/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash_Encryption;

/**
 *
 * @author jgigl16
 * 
 * 
 */
import java.io.*;
import java.util.*;
public class HashAlgorithm {
    
    StringTokenizer st;
    static Scanner scan = new Scanner(System.in);
    static String fileName;
    
   
    
    public static void main(String[] args) {
        System.out.println("EnterFileNAME:");
        fileName = scan.nextLine();
        File file = new File(fileName);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            while (br.readLine() != null) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            System.out.println("File Not Found!");
        }
        
        
    }
    
    
}
