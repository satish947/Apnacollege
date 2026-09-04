public class Trappedwater {
    public static int trappedwater(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n ; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        } 
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i =n-2 ;i>=0 ;i--){
            rightmax[i] = Math.max (height[i],rightmax[i+1]);
        }
        int trappedwater = 0;
        for(int i = 0; i<n ; i++){
            int waterlevel = Math.min(leftMax[i],rightmax[i]);
            trappedwater += waterlevel - height[i];
        }
        return trappedwater;

    }
    public static void main(String args[]){
        int height[] ={4 ,0,2,6,4,5};
        System.out.print(trappedwater(height)); 
    }
    
}
