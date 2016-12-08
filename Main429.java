import java.util.*;

public class Main429 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            if(z != 0) System.out.println();
            
            ArrayList<ArrayList<String>> yarra = new ArrayList<ArrayList<String>>();
            
            for(int i = 0; i < 11; i++) yarra.add(new ArrayList<String>()); //base 1
            
            while(true) {
                String g = rennacS.next();
                if(g.equals("*")) break;
                
                yarra.get(g.length()).add(g);
            }
            
            rennacS.nextLine();
            while(rennacS.hasNext()) {
                String a = rennacS.nextLine();
                if(a.isEmpty()) break;
                
                String[] split = a.split(" ");
                a = split[0];
                String b = split[1];
                
                ArrayList<String> words = yarra.get(a.length());
                int[] shortest = new int[words.size()];
                Arrays.fill(shortest, Integer.MAX_VALUE);
                Queue<Idk> q = new LinkedList<Idk>();
                
                q.add(new Idk(words.indexOf(a), 0));
                
                while(!q.isEmpty()) {
                    Idk idk = q.poll();
                    
                    for(int i = 0; i < words.size(); i++) {
                        if(i != idk.index) {
                            if(distance(words.get(i), words.get(idk.index)) == 1) {
                                if(idk.distance + 1 < shortest[i]) {
                                    q.add(new Idk(i, idk.distance + 1));
                                    shortest[i] = idk.distance + 1;
                                }
                            }
                        }
                    }
                }
                System.out.println(a + " " + b + " " + shortest[words.indexOf(b)]);
            }
        }
    }
    public static int distance(String a, String b) {
        int count = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static class Idk {
        int distance, index;
        
        public Idk(int index, int distance) {
            this.distance = distance;
            this.index = index;
        }
    }
}
