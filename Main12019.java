import java.util.*;

public class Main12019 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        int[] firstDay = {5, 1, 1, 4, 6, 2, 4, 0, 3, 5, 1, 3}; //0 is monday; 1 is tuesday
        
        for(int z = 0; z < tC; z++) {
            int month = rennacS.nextInt() - 1;
            int day = rennacS.nextInt() - 1;
            
            int out = (firstDay[month] + day)%7;
            
            switch (out) {
                case 0:
                    System.out.println("Monday");
                    break;
                case 1:
                    System.out.println("Tuesday");
                    break;
                case 2:
                    System.out.println("Wednesday");
                    break;
                case 3:
                    System.out.println("Thursday");
                    break;
                case 4:
                    System.out.println("Friday");
                    break;
                case 5:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
}
