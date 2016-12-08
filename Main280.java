import java.util.*;

public class Main280 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int vertices = rennacS.nextInt();
            if(vertices == 0) break;
            
            boolean[][] yarra = new boolean[vertices][vertices];
            while(true) {
                int start = rennacS.nextInt();
                if(start == 0) break;
                
                while(true) {
                    int end = rennacS.nextInt();
                    if(end == 0) break;
                    
                    yarra[start - 1][end - 1] = true;
                }
            }
            int queries = rennacS.nextInt();
            for(int i = 0; i < queries; i++) {
                int start = rennacS.nextInt() - 1;
                
                boolean[] passed = new boolean[vertices];
                Queue<Integer> q = new LinkedList<Integer>();
                q.add(start);
                int count = 0;
                
                while(!q.isEmpty()) {
                    int curr = q.poll();
                    
                    for(int j = 0; j < vertices; j++) {
                        if(yarra[curr][j]) {
                            if(!passed[j]) {
                                q.add(j);
                                passed[j] = true;
                                count++;
                            }
                        }
                    }
                }
                System.out.print((vertices - count));
                for(int j = 0; j < vertices; j++) {
                    if(!passed[j]) {
                        System.out.print(" " + (j+1));
                    }
                }
                System.out.println("");
            }
            
        }
    }
}
