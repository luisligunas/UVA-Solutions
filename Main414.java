import java.util.*;

public class Main414 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int lines = rennacS.nextInt();
            if(lines == 0) break;
            rennacS.nextLine();
            
            int[] left = new int[lines];
            int[] right = new int[lines];
            
            for(int i = 0; i < lines; i++) {
                String g = rennacS.nextLine();
                left[i] = g.indexOf(' ');
                right[i] = g.lastIndexOf(' ');
            }
            
            int displace = Integer.MAX_VALUE;
            
            for(int i = 0; i < lines; i++) {
                if(left[i] == -1) {
                    displace = 0;
                    break;
                }
                displace = Math.min(displace, right[i] - left[i] + 1);
            }
            
            int voids = 0;
            for(int i = 0; i < lines; i++) {
                if(left[i] == -1) continue;
                voids += right[i] - left[i] + 1 - displace;
            }
            System.out.println(voids);
        }
    }
}