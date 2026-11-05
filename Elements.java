import java.util.Scanner;

public class Elements {
    Scanner scanner = new Scanner(System.in);
    
    
    int elem(DataEntry data){
        int x = data.x;
        int y = data.y;

        System.out.print("Enter elements: ");
        for (int row = 0; row < x; row++) {
            for(int col = 0; col < y; col++){
                data.arr[row][col] = scanner.nextInt();
            }
        }

        return 0;
    }
}
