import java.util.*;

public class Main200 {
    static Stack<Integer> s;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> thing;
    
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        ArrayList<String> yarra = new ArrayList<String>();
        boolean[] inList = new boolean[26];
        thing = new ArrayList<ArrayList<Integer>>();
        s = new Stack<Integer>();
        visited = new boolean[26];
        
        while(true) {
            String g = rennacS.next();
            if(g.equals("#")) break;
            yarra.add(g);
            for(int i = 0; i < g.length(); i++) inList[g.charAt(i) - 'A'] = true;
        }
        for(int i = 0; i < 26; i++) thing.add(new ArrayList<Integer>());
        
        for(int i = 0; i < yarra.size() - 1; i++) {
            String a = yarra.get(i);
            String b = yarra.get(i + 1);
            
            for(int j = 0; true; j++) {
                if(a.length() == j || b.length() == j) break;
                if(a.charAt(j) != b.charAt(j)) {
                    thing.get(a.charAt(j) - 'A').add(b.charAt(j) - 'A');
                    break;
                }
            }
        }
        for(int i = 0; i < 26; i++) {
            if(!inList[i]) continue;
            boom(i);
        }
        while(!s.isEmpty()) {
            System.out.print((char)(s.pop() + 'A'));
        }
        System.out.println("");
    }
    public static void boom(int n) {
        if(visited[n]) return;
        visited[n] = true;
        
        ArrayList<Integer> yarra = thing.get(n);
        
        for(int i = 0; i < yarra.size(); i++) {
            if(!visited[yarra.get(i)]) boom(yarra.get(i));
        }
        s.add(n);
    }
}
