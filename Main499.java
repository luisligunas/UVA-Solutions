import java.util.*;

public class Main499 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String g = rennacS.nextLine();
            int[] freq = new int[52];
            int max = 0;
            
            for(int i = 0; i < g.length(); i++) {
                int mander = g.charAt(i);
                if(mander >= 'A' && mander <= 'Z') {
                    freq[mander - 'A']++;
                    max = Math.max(freq[mander - 'A'], max);
                }
                else if(mander >= 'a' && mander <= 'z') {
                    freq[mander - 'a' + 26]++;
                    max = Math.max(freq[mander - 'a' + 26], max);
                }
            }
            for(int i = 0; i < freq.length; i++) {
                if(freq[i] == max) {
                    if(i < freq.length/2) System.out.print((char)(i + 'A'));
                    else System.out.print((char)(i + 'a' - 26));
                }
            }
            System.out.println(" " + max);
        }
    }
}
