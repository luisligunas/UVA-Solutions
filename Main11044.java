import java.util.*;

public class Main11044 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            int rows = rennacS.nextInt() - 2;
            int columns = rennacS.nextInt() - 2;
            
            int totalRows = rows/3;
            if(rows % 3 != 0) totalRows++;
            
            int totalCols = columns/3;
            if(columns % 3 != 0) totalCols++;
            
            System.out.println(totalRows*totalCols);
        }
    }
}
