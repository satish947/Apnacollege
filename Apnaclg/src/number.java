public class number {
    public static void sum(int matrix[][]){
      
        int num = 0;
        for(int row = 0 ; row<matrix.length;row++){
            for(int col = 0 ; col< matrix[0].length ;col++){
        if(matrix[row][col] == 7){
            num += 1;
        }
       
       
    }
     

    }
     System.out.println(num);
     
}
    public static void main(Palindromestring args[]){
        int matrix[][] ={{4,7,8},{8,8,7},{7,7,5}};
        sum(matrix);
    }
    
}
