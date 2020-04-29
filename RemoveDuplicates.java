
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wangechi
 */
public class RemoveDuplicates {

    public static void getUniqueNumbers(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {

            if (myMap.containsKey(arr[i])) {
                myMap.remove(arr[i]);
            } else {
                myMap.put( arr[i],count);
            }

        }
        System.out.println(myMap.keySet());
       


    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] myArray = {2,2,1};
        getUniqueNumbers(myArray);
    }
}
