
public class Duplicates {

    void Dupes(DataEntry data){

        for(int row = 0; row < data.x; row++){
            for(int col = 0; col < data.y; col++){
                
                boolean dupe = false;
                
                for(int x = 0; x < data.x; x++){
                    for(int y = 0; y < data.y; y++){

                        if(row == x && col == y) continue;

                        if(data.arr[row][col] == data.arr[x][y]){
                            dupe = true;
                        }
                    }
                }

                if(dupe){
                    System.out.println("Duplicate number: " + data.arr[row][col]);
                    System.out.println("Found at: [" + row + "][" + col + "]");
                }
            }
        }
    }
}
