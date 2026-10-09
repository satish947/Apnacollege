import java.util.*;
public class Solution {
     public static int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
       int closest = nums[0] + nums[1] + nums[2];
       for(int i = 0; i<nums.length-2;i++){
        int lp = i+1;
        int rp = nums.length-1;
        while (lp<rp){
            int sum = nums[i] + nums[lp] + nums[rp];
            if(Math.abs(target-sum)< Math.abs(target - closest)){
                closest = sum;
            }
            if(sum<target){
                lp++;
            }else if(sum >target){
                rp--;
            }else{
                return sum;
            }
        }
       }
       return closest;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }
        
    }
   

