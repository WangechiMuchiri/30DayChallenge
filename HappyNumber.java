
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
public class HappyNumber {

    public static void findHappyNumber(int num) {
        //get individual digits from given number
        //store seen numbers in a map
        int count = 0, temp = 0, digit = 0, sum_of_squares = 0;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        while (num != 1) {
            if(myMap.containsKey(num)){
                System.out.println("This is a repetititve loop");
            }
            else{
                myMap.put(num, count);
                temp = num;
            while (num > 0) {
                num = num / 10;
                count++;
            }
            while (temp > 0) {
                digit = temp % 10;
                sum_of_squares = sum_of_squares + (digit * digit);

                temp = temp / 10;
                count--;
            }

            System.out.println("sum " + sum_of_squares);
            num = sum_of_squares;
            myMap.put(num, count);

            System.out.println("HASHMAP IS " + myMap);

         }}
        if(num == 1){
            System.out.println("HAppy Number is ");
        }
            }
                


    public static void main(String[] args) {
        findHappyNumber(19);
    }

}
