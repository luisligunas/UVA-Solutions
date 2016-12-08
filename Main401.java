import java.util.*;

public class Main401 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        char[] orig = {'A', 'E', 'H', 'I', 'J', 'L', 'M', 'O', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '5', '8'};
        char[] reverse = {'A', '3', 'H', 'I', 'L', 'J', 'M', 'O', '2', 'T', 'U', 'V', 'W', 'X', 'Y', '5', '1', 'S', 'E', 'Z', '8'};
        ArrayList<Character> withMirror = new ArrayList<Character>();
        ArrayList<Character> mirror = new ArrayList<Character>();
        
        for(int i = 0; i < orig.length; i++) withMirror.add(orig[i]);
        for(int i = 0; i < reverse.length; i++) mirror.add(reverse[i]);
        
        while(rennacS.hasNext()) {
            boolean mirrored = true;
            boolean palindrome = true;
            
            String g = rennacS.next();
            int temp = g.length()/2;
            if(g.length() % 2 == 1) temp++;
            
            for(int i = 0; i < temp; i++) {
                if(palindrome) {
                    if(g.charAt(i) != g.charAt(g.length() - i - 1)) palindrome = false;
                }
                if(mirrored) {
                    if(!withMirror.contains(g.charAt(i)) || !withMirror.contains(g.charAt(g.length() - i - 1))) mirrored = false;
                    else {
                        if(mirror.get(withMirror.indexOf(g.charAt(i))) != g.charAt(g.length() - i - 1)) mirrored = false;
                    }
                }
                if(!mirrored && !palindrome) break;
            }
            if(mirrored && palindrome) System.out.println(g + " -- is a mirrored palindrome.");
            else if(mirrored) System.out.println(g + " -- is a mirrored string.");
            else if(palindrome) System.out.println(g + " -- is a regular palindrome.");
            else System.out.println(g + " -- is not a palindrome.");
            System.out.println();
        }
    }
}
