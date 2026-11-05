public class RowSum {
    
    int[] rowSum(DataEntry data){
        int rowSum[] = new int[data.x];
        for(int row = 0; row < data.x; row++){
            for(int col = 0; col < data.y; col++){
                rowSum[row] += data.arr[row][col];
            }
        }
       return rowSum;
    }
}
