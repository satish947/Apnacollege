import java.util.*;
public class Matrixsearch {
    public static boolean search(int matrix[][],int key){
        for(int i = 0 ; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print(+i +"," +j);
                    return true;
                }
                }
            }
            System.out.print("not found");
        return false;
        
       
    }
    public static void main(Palindromestring args[]){
        int matrix[][]= new int[3][3];
        int n = matrix.length ;int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
          for(int i = 0 ; i<matrix.length; i++){
        for(int j = 0; j<matrix[0].length;j++){
        matrix[i][j] =sc.nextInt();
       
        }

    
    }
    for(int i = 0 ; i<n; i++){
        for(int j = 0 ; j< m; j++){
            System.out.print(matrix[i][j]+ " ");

        }
        System.out.println();
    }

   search(matrix,5);
        
    }
    
    
}
