import java.util.*;

public class Main10986 {
    public static class FirstElementComparator implements Comparator<int[]>
    {
        @Override
        public int compare(int[] x, int[] y)
        {
            if(x[0] < y[0]) return -1;
            if(x[0] > y[0]) return 1;
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        for(int z = 0; z < tC; z++) {
            Comparator<int[]> comp = new FirstElementComparator();
            PriorityQueue<int[]> q = new PriorityQueue<>(comp);
            ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
            ArrayList<ArrayList<Integer>> distances = new ArrayList<>();
            
            int n = rennacS.nextInt();
            int m = rennacS.nextInt();
            int s = rennacS.nextInt();
            int t = rennacS.nextInt();
            
            for(int i = 0; i < n; i++) {
                edges.add(new ArrayList<>());
                distances.add(new ArrayList<>());
            }
            
            for(int i = 0; i < m; i++) {
                int x = rennacS.nextInt();
                int y = rennacS.nextInt();
                int w = rennacS.nextInt();
                if(edges.get(x).contains(y)) {
                    int temp = edges.get(x).indexOf(y);
                    if(w < distances.get(x).get(temp)) {
                        int temp2 = edges.get(y).indexOf(x);
                        distances.get(x).set(temp, w);
                        distances.get(y).set(temp2, w);
                    }
                }
                else {
                    edges.get(x).add(y);
                    edges.get(y).add(x);
                    distances.get(x).add(w);
                    distances.get(y).add(w);
                }
            }
            int[] distance = new int[n];
            Arrays.fill(distance, Integer.MAX_VALUE);
            
            q.add(new int[]{0, s});
            
            while(!q.isEmpty()) {
                int[] temp = (int[])q.remove();
                
                if(distance[temp[1]] == Integer.MAX_VALUE) {
                    distance[temp[1]] = temp[0];
                    for(int x: edges.get(temp[1])) {
                        int meh = temp[0] + distances.get(temp[1]).get(edges.get(temp[1]).indexOf(x));
                        if(meh < distance[x]) q.add(new int[]{meh, x});

                    }
                }
            }
            System.out.print("Case #" + (z+1) + ": ");
            if(distance[t] == Integer.MAX_VALUE) System.out.println("unreachable");
            else System.out.println(distance[t]);
        }
    }
}