public class setMatrixToZero {
    public static void main(String[] args) {
        int [][] arr = {{1,1,1,1},{1,0,0,1},{1,1,0,1},{1,1,1,1}};
        setZero(arr);
        printMatrix(arr);
    }
    public static void setZero(int [][] arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j] == 0) {
                    markRow(arr, i);
                    markCol(arr, j);
                }
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==-1)
                {
                    arr[i][j]=0;
                }
            }
        }
    }
    public static void markRow(int [][]arr,int i)
    {
        for (int j = 0; j <arr[i].length ; j++) {
            if(arr[i][j]!=0)
            {
                arr[i][j]=-1;
            }
        }
    }
    public static void markCol(int [][] arr,int j)
    {
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }
    public static void printMatrix(int [][]arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
