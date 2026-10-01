public class lastOccur {
    public static int LastOcuurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound= LastOcuurence(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {8,3,5,7,1,5,7,9};
        System.out.println(LastOcuurence(arr,5,0));
    }
    
}
