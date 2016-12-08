import java.util.*;

public class Main10008 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        Integer[] frequency = new Integer[26];
        Arrays.fill(frequency, 0);
        rennacS.nextLine();
        
        for(int i = 0; i < testCases; i++) {
            String g = rennacS.nextLine().toUpperCase();
            for(int j = 0; j < g.length(); j++) {
                if(g.charAt(j) >= 65) {
                    if(g.charAt(j) <= 90) frequency[g.charAt(j) - 65]++;
                }
            }
        }
        ArrayList<Integer> yarra = new ArrayList<Integer>(Arrays.asList(frequency));
        Integer[] temp = frequency.clone();
        Arrays.sort(temp);
        
        for(int i = 25; i >= 0; i--) {
            if(temp[i] == 0) break;
            int blah = yarra.indexOf(temp[i]);
            char s = (char)(blah + 65);
            System.out.println(s + " " + temp[i]);
            yarra.set(blah, -1);
        }
        
    }
}
