public class transpose {
    public static void printmatrix(int matrix[][]){
        System.out.println("Enter a matrix");
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j] +" ");

            }
            System.out.println();
            
        }
      

        
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,7}};
        int row = 2; int col = 3;
        printmatrix(matrix);
        int transpose[][] = new int[col][row];
        for(int i = 0; i<row; i++){
            for(int j = 0 ;j<col;j++){
                transpose[j][i] = matrix[i][j];

            }


        }
        printmatrix(transpose);
    }
    
}
