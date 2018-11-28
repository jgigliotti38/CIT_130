/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory_Updater;

/**
 *
 * @author jgigl16
 * 
 * 
 */
import java.io.*;
import java.util.*;
//import Hash_Encryption.Tokenizer;
public class Inventory_Updater {
    
    //StringTokenizer st;
    static Scanner scan = new Scanner(System.in);
    static String fileName;
    static String fileLocation;
    static Tokenizer st = new Tokenizer();
    static Tokenizer inMap = new Inventory_Map();
     
   
    
    public static void main(String[] args) {
        System.out.println("EnterFileNAME: \n");
        fileName = scan.nextLine();
        fileLocation = "C:\\Users\\jgigl16\\Documents\\NetBeansProjects\\Inventory_Updater\\" + fileName + ".csv";
        File file = new File(fileLocation);
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String s;
            
            //******************************************************
            br.mark(1);
            st.findKey(br.readLine());
            br.reset();        
            st.findInventoryColumn(br.readLine());
            br.reset();
            st.findProductColumn(br.readLine());
            br.reset();
            st.findCostColumn(br.readLine());
            br.reset();
            st.findPriceColumn(br.readLine());

            //****** SEARCHES COLUMNS FOR HEADERS
            
            while ((s = br.readLine()) != null) {
                //System.out.println(s); -> Will directly Print
                System.out.println();
                st.TokenizeAll(s); // Prints entire .csv file
            }
            System.out.println();
            //System.out.println(st);
            
            
            
        } catch (IOException e) {
            System.out.println("File Not Found!");
        }
        
        
    }
    
    
}
