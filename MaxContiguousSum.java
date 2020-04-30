/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wangechi
 */
public class MaxContiguousSum {
    public static int findMaxContiguousSum(int [] nums){
        int max_so_far = 0,max_ending_here = 0;
        for (int i = 0; i < nums.length; i++){
            max_ending_here = max_ending_here + nums[i];
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
            else if(max_ending_here > max_so_far){
                max_so_far = max_ending_here;
            }
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        int [] myArray = {-2,1,-3,4,-1,2,1,-5,4};
        findMaxContiguousSum(myArray);
    }
    
}
