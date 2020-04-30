/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wangechi
 */

// Two pointer approach for Zero and non Zero elements
//Time complexity O(n)
//Space Complexity O(1)
public class MoveZeroesToEnd {

    public static void moveZeroesToEnd(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        //swap nums i and nums j
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }

                }

            }

        }

    }

    public static void main(String[] args) {
        int[] myArray = {0, 1, 0, 3, 12};
        moveZeroesToEnd(myArray);

    }

}
