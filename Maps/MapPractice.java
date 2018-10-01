
 /* To change this license header, choose License Heade
 rs in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;

/**
 *
 * @author jgigl16
 */
import java.util.*;




public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> gps = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String input; 
        int output;
        boolean exit = false;
        
        
        
        gps.put("USA", "90");
        gps.put("Egypt", "26");
        gps.put("Canada", "56");
        gps.put("Mexico", "5");
        

        
        System.out.print(printMap(gps));
        
        System.out.println();
        System.out.println("DONE!!!!!!!!");
        
        
        
        
        
        
    }//End MAIN
    /**
     * 
     * @author jgigl16
     * @param inMap
     * @return the values of the inputted Map
     */
    public static List<String> printMap (Map<String, String> inMap) {
        String key;
        String value;
        
        Set<String> mapSet = inMap.keySet();
        Iterator<String> mapIter = mapSet.iterator();
        List<String> mapList = new ArrayList<>();
        while(mapIter.hasNext()) {
            key = mapIter.next();
            value = inMap.get(key);
            mapList.add(key + "'s value is: " + value + "\n"); 
        }
        
       
        return mapList;
    }//Displays a list of Keys and Values of types String from a Map
}
