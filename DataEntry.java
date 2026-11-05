import java.util.Scanner;

public class DataEntry {
    Scanner scanner = new Scanner(System.in);
    int x, y;
    int[][] arr;

    void data(){
        System.out.print("Enter row: ");
        x = scanner.nextInt();
        System.out.print("Enter Column: ");
        y = scanner.nextInt();
        arr = new int[x][y];

        Elements elem = new Elements();
        elem.elem(this);
    }
}
