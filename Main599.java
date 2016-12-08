import java.util.Scanner;
import java.util.ArrayList;

public class Main599 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int z = 0; z < testCases; z++) {
            ArrayList<String> yarra = new ArrayList<String>();
            boolean[] check = new boolean[26];
            
            while(true) {
                String g = rennacS.next();
                if(g.charAt(0) == '*') break;
                
                int temp1 = g.charAt(1) - 65;
                int temp2 = g.charAt(3) - 65;
                boolean rawr1 = check[temp1];
                boolean rawr2 = check[temp2];
                
                if(rawr1) {
                    int meh1 = indexOfLetter(yarra, g.substring(1, 2));
                    if(rawr2) {
                        int meh2 = indexOfLetter(yarra, g.substring(3, 4));
                        if(meh1 != meh2) {
                            yarra.set(meh1, yarra.get(meh1) + yarra.get(meh2));
                            yarra.remove(meh2);
                        }
                    }
                    else {
                        check[temp2] = true;
                        yarra.set(meh1, yarra.get(meh1) + g.substring(3,4));
                    }
                }
                else {
                    check[temp1] = true;
                    if(rawr2) {
                        int meh2 = indexOfLetter(yarra, g.substring(3, 4));
                        yarra.set(meh2, yarra.get(meh2) + g.substring(1, 2));
                    }
                    else {
                        check[temp2] = true;
                        yarra.add(g.substring(1, 2) + g.substring(3, 4));
                    }
                }
            }
            String g = rennacS.next();
            int acorns = 0;
            for(int i = 0; i < g.length(); i += 2) {
                if(!check[g.charAt(i) - 65]) acorns++;
            }
            System.out.println("There are " + yarra.size() + " tree(s) and " + acorns + " acorn(s).");
        }
    }
    public static int indexOfLetter(ArrayList<String> yarra, String c) {
        for(int i = 0; i < yarra.size(); i++) {
            if(yarra.get(i).contains(c)) return i;
        }
        return -1;
    }
}