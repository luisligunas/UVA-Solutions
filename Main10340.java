import java.util.*;

public class Main10340 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            char[] aA = rennacS.next().toCharArray();
            char[] bA = rennacS.next().toCharArray();
            ArrayList<Character> a = new ArrayList<Character>();
            ArrayList<Character> b = new ArrayList<Character>();
            boolean yes = true;
            
            for(int i = 0; i < aA.length; i++) a.add(aA[i]);
            for(int i = 0; i < bA.length; i++) b.add(bA[i]);
            
            while(!a.isEmpty()) {
                int temp = b.indexOf(a.get(0));
                
                if(temp == -1) {
                    yes = false;
                    break;
                }
                for(int i = 0; i <= temp; i++) b.remove(0);
                a.remove(0);
            }
            if(yes) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
