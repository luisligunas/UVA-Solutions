import java.util.*;

public class Main336 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int caseNum = 1;
        
        while(true) {
            int NC = rennacS.nextInt();
            if(NC == 0) break;
            
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
            
            for(int i = 0; i < NC; i++) {
                int a = rennacS.nextInt();
                int b = rennacS.nextInt();
                
                ArrayList<Integer> temp;
                if(map.containsKey(a)) temp = map.get(a);
                else temp = new ArrayList<Integer>();
                temp.add(b);
                map.put(a, temp);
                
                ArrayList<Integer> temp2;
                if(map.containsKey(b)) temp2 = map.get(b);
                else temp2 = new ArrayList<Integer>();
                temp2.add(a);
                map.put(b, temp2);
            }
            
            while(true) {
                int start = rennacS.nextInt();
                int ttl = rennacS.nextInt();
                
                if(start == 0 && ttl == 0) break;
                Queue<Idk> q = new LinkedList<Idk>();
                
                q.add(new Idk(start, ttl));
                
                HashMap<Integer, Integer> passed = new HashMap<Integer, Integer>();
                
                while(!q.isEmpty()) {
                    Idk idk = q.poll();
                    
                    if(map.containsKey(idk.currNode)) {
                        //dead
                        if(idk.life == 0) {
                            if(!passed.containsKey(idk.currNode)) {
                                passed.put(idk.currNode, 0);
                            }
                            continue;
                        }
                        //dead

                        //memoizing
                        if(passed.containsKey(idk.currNode)) {
                            if(passed.get(idk.currNode) < idk.life) {
                                passed.put(idk.currNode, idk.life);
                            }
                        }
                        else {
                            passed.put(idk.currNode, idk.life);
                        }
                        //memoizing

                        ArrayList<Integer> connections = map.get(idk.currNode);
                        if(connections == null) continue;

                        for(int i = 0; i < connections.size(); i++) {
                            if(passed.containsKey(connections.get(i))) {
                                if(passed.get(connections.get(i)) < idk.life - 1) {
                                    q.add(new Idk(connections.get(i), idk.life - 1));
                                }
                            }
                            else {
                                q.add(new Idk(connections.get(i), idk.life - 1));
                            }
                        }
                    }
                }
                System.out.println("Case " + caseNum++ + ": " + (map.size() - passed.size()) + " nodes not reachable from node " + start + " with TTL = " + ttl + ".");
            }
        }
    }
    public static class Idk {
        int life, currNode;
        
        public Idk(int currNode, int life) {
            this.life = life;
            this.currNode = currNode;
        }
    }
}
