public class majorityelement {
    public static int majorityelement(int nums[]){
        int majoritycount = nums.length/2;
       
        for(int i = 0; i<nums.length;i++){
            int count = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count+=1;
                }
            }
            if(count >majoritycount){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] =  {2,2,1,1,1,2,2};
        System.out.print(majorityelement(nums));
    }
}
