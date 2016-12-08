import java.util.Scanner;

public class Main10696 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int n = rennacS.nextInt();
            if(n == 0) break;
            
            System.out.printf("f91(%d) = ", n);
            if(n < 102) System.out.println(91);
            else System.out.println(n - 10);
        }
    }
}
//import java.util.Scanner;
//
//public class Main10696 {
//    public static void main(String[] args) {
//        Scanner rennacS = new Scanner(System.in);
//        
//        while(true) {
//            int n = rennacS.nextInt();
//            if(n == 0) break;
//            System.out.println(f91(n));
//        }
//    }
//    public static int f91(int n) {
//        if(n <= 100) return f91(f91(n + 11));
//        return n - 10;
//    }
//}
