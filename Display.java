public class Display {
    
    int display(DataEntry data){
        RowSum rowSum = new RowSum();
        ColSum colSum = new ColSum();
        Duplicates dupes = new Duplicates();

        int[] rowSums = rowSum.rowSum(data);
        int[] colSums = colSum.colSum(data);

       
        for(int row = 0; row < data.x; row++){
            for(int col = 0; col < data.y; col++){
                System.out.print("\t" + data.arr[row][col] + "\t");
            }
            System.out.println("Sum: " + rowSums[row]);
        }
        System.out.print("Sum: ");
        for(int col = 0; col < colSums.length; col++){
            System.out.print("\t" + colSums[col] + "\t");
        }
        System.out.println();
        
        dupes.Dupes(data);


        return 0;
    }
}
