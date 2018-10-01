/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jgigl16
 * pre-made Expedition Map Class
 */
public class ExpeditionMap {
    
    private static Map<String, String> expedMap = new HashMap<>();
    
    public void ExpedtionMap() {
        expedMap.put("USA", "90");
        expedMap.put("Egypt", "26");
        expedMap.put("Canada", "56");
        expedMap.put("Mexico", "5");
    }
    /**
     * 
     * @return The uploaded pre-made Map
     */
    public Map<String,String> get() {
        return this.expedMap;
    }
    
    /**
     * 
     * @param myMap 
     * sets your Map to this pre-made Map
     * 
     */
    public void setMap(Map<String,String> myMap) {
        myMap = expedMap;
    }
}
