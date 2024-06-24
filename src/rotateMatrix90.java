public class rotateMatrix90 {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//        bruteForce(arr);
//        transpose(arr);
        optimal(arr);
    }
    public static void bruteForce(int [][] arr){
        int col = arr.length;
        int row = arr[0].length;
        int [][] matrix = new int [row][col];
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <row ; j++) {
                matrix[j][col-1-i]=arr[i][j];
            }
        }
        printMatrix(matrix);
    }
    public static void transpose(int [][]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr[i].length ; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        printMatrix(arr);
    }
    public static void optimal(int [][]matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++){
            int a=0;
            int b=matrix[i].length-1;
            while(a<=b){
                int temp = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b]=temp;
                a++;
                b--;
            }
        }
        printMatrix(matrix);
    }
    public static void printMatrix(int [][]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
