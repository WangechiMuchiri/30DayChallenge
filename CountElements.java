
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wangechi
 */
// Time complexity O(n)
// Space Complexity O(n)
// This approach involves a single pass through the input array
public class CountElements {
    public static int countElements(int [] arr){
        HashMap <Integer, Integer> myMap = new HashMap<Integer,Integer>();
        int counter = 0,count = 0;
        for(int i = 0; i<arr.length;i++){
            if(myMap.containsKey(arr[i]-1) || myMap.containsKey(arr[i]+1)){
              myMap.put(arr[i],counter);
              count++;
              
                
            }
            else{
                myMap.put(arr[i],counter);
                
            }
            
        }
        return count;
        
        
    }
    public static void main(String[] args) {
        int [] myArray = {1,2,3};
        countElements(myArray);
    }
    
}
