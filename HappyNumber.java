
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    static List<Integer> myList = new ArrayList<Integer>();
    static boolean result;

    //get individual digits from given number
    //store seen numbers in a list
    public static boolean computeSumOfSquares(int num) {
        int count = 0, temp = 0, digit = 0, sum_of_squares = 0;
        if (num == 1) {
            result = true;
        }
        if (myList.contains(num)) {
            System.out.println("Cycle Detected");
            result = false;
        }
        while (num != 1 && (!myList.contains(num))) {
            myList.add(num);
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

            num = sum_of_squares;

            computeSumOfSquares(num);
        }

        return result;

    }

    public static void main(String[] args) {

        computeSumOfSquares(2);
    }

}
