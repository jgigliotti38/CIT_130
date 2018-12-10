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

public class Inventory_Map {
    
    Map<Integer, Inventory> csvMap = new HashMap<>();
    //Integer       Product No.
    //Inventory     Contains Updated info on that product
    
    public void CSV_Map(Integer key, Inventory value) {
        
        csvMap.put(key,value);
    }
    
}
