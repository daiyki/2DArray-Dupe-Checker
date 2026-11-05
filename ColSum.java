public class ColSum {
    int[] colSum(DataEntry data){
        int[] colSum = new int[data.y];
        
        for(int col = 0; col < data.y; col++){
            for(int row = 0; row < data.x; row++){
                colSum[col] += data.arr[row][col];
            }
        }
        return colSum;
    }
}
