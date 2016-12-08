import java.util.*;

public class Main11877 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        
        while(true) {
            int empty = rennacS.nextInt();
            if(empty == 0) break;
            
            System.out.println(empty/2);
            
            //You can simulate it but lol no.
//            int drank = 0;
//            
//            while(empty >= 3) {
//                drank += empty/3;
//                
//                empty = (empty%3) + (empty/3);
//            }
//            if(empty == 2) drank++;
//            System.out.println(drank);
        }
    }
}
