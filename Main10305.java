import java.util.*;

public class Main10305 {
    static boolean[] visited, expanding;
    static ArrayList<ArrayList<Integer>> yarra;
    static Stack<Integer> s;
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        for(int z = 0; true; z++) {
            int n = rennacS.nextInt();
            int m = rennacS.nextInt();
            
            if(m == 0 && n == 0) break;
            
            yarra = new ArrayList<ArrayList<Integer>>();
            visited = new boolean[n];
            expanding = new boolean[n];
            s = new Stack<Integer>();
            
            for(int i = 0; i < n; i++) yarra.add(new ArrayList<Integer>());
            
            for(int i = 0; i < m; i++) {
                yarra.get(rennacS.nextInt() - 1).add(rennacS.nextInt() - 1);
            }
            
            for(int i = 0; i < n; i++) boom(i);
            while(!s.isEmpty()) {
                if(s.size() != n) System.out.print(" ");
                System.out.print(s.pop() + 1);
            }
            System.out.println();
        }
    }
    public static void boom(int n) {
        if(visited[n]) return;
        visited[n] = true;
        expanding[n] = true;
        
        ArrayList<Integer> waddup = yarra.get(n);
        
        for(int i = 0; i < waddup.size(); i++) {
            if(!visited[waddup.get(i)] && !expanding[waddup.get(i)]) boom(waddup.get(i));
        }
        s.add(n);
        expanding[n] = false;
    }
}
