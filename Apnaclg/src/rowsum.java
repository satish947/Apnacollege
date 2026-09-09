public class rowsum {
    public static void sumofrow(int matrix[][]){
        int sum = 0;
        for(int row =1;row<2 ; row++){
            for(int col = 0 ; col<matrix[0].length ;col++){
                sum += matrix[row][col];
            }
        }
        System.out.print(sum);
    }
    public static void main(Palindromestring args[]){
        int matrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
         sumofrow(matrix);

    }

    
}
