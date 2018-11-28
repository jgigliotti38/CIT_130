/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory_Updater;

/**
 *
 * @author jgigl16
 */
import java.util.*;
public class Tokenizer {
    
    String input;
    final String DELIM = ",";
    final String KEY_COLUMN_NAME = "Product No.";
    final String PRODUCT_COLUMN_NAME = "Product Name";
    final String INVENTORY_COLUMN_NAME = "Inventory";
    final String PRICE_COLUMN_NAME = "Price($)";
    final String COST_COLUMN_NAME = "Cost($)";
    
    int keyMarker;
    StringTokenizer st;
    //Inventory_Map inMap = new Inventory_Map();
    /*
    String ProductKey;
    ProductInfo values;
    Map<String, ProductInfo> inMap = new HashMap<>();
    */
    public void TokenizeAll(String input) {
        
        this.input = input;
        st = new StringTokenizer(input,DELIM);
        //Print(st);      
    } // tokenizes a string input
    
    @Override
    public String toString() {
        String t = "String has been Tokenized";
        return t;
    }
    
    public static void Print(StringTokenizer st) {
       while (st.hasMoreTokens()) {
           String info = st.nextToken();
           System.out.println(info);
       }
    } //Prints entire Tokenized object
    
    public void findKey(String input) {
        int count = 1;
        st = new StringTokenizer(input, DELIM);
        while (st.hasMoreTokens()) {
            if (!st.nextToken().equals(KEY_COLUMN_NAME)) {
                count++;
            }
            else {
                System.out.println("key column is: " + count);
            }
        }
        keyMarker = count;
    } //Searches header for Product No. column
    
    public void findInventoryColumn(String input) {
        //System.out.println("GUCCI");
        int count = 1;
        st = new StringTokenizer(input, DELIM);
        while (st.hasMoreTokens()) {
            if (!st.nextToken().equals(INVENTORY_COLUMN_NAME)) {
                count++;
            }
            else {
                System.out.println("Inventory column is: " + count);
            }
        }
        
    } //Searches header for Inventory Column
    
    public void findPriceColumn(String input) {
        int count = 1;
        st = new StringTokenizer(input, DELIM);
        while (st.hasMoreTokens()) {
            if (!st.nextToken().equals(PRICE_COLUMN_NAME)) {
                count++;
            }
            else {
                System.out.println("Price column is: " + count);
            }
        }
        
    } //Searches header for Price Column
        
    public void findCostColumn(String input) {
        int count = 1;
        st = new StringTokenizer(input, DELIM);
        while (st.hasMoreTokens()) {
            if (!st.nextToken().equals(COST_COLUMN_NAME)) {
                count++;
            }
            else {
                System.out.println("Cost column is: " + count);
            }
        }
        
    } //Searches header for Cost Column
    
    public void findProductColumn(String input) {
        int count = 1;
        st = new StringTokenizer(input, DELIM);
        while (st.hasMoreTokens()) {
            if (!st.nextToken().equals(PRODUCT_COLUMN_NAME)) {
                count++;
            }
            else {
                System.out.println("ProductName column is: " + count);
            }
        }
        
    } // Searches header for Product Name Column
    
}