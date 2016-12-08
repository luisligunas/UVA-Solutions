import java.util.*;

public class Main11995 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            ArrayList<Integer> s = new ArrayList<Integer>();
            ArrayList<Integer> q = new ArrayList<Integer>();
            ArrayList<Integer> p = new ArrayList<Integer>();
            boolean st = true;
            boolean qu = true;
            boolean pq = true;
            
            int operations = rennacS.nextInt();
            
            for(int i = 0; i < operations; i++) {
                int oneOrTwo = rennacS.nextInt();
                int element = rennacS.nextInt();
                
                if(oneOrTwo == 1) {
                    if(st) s.add(element);
                    if(qu) q.add(element);
                    if(pq) {
                        p.add(element);
                        Collections.sort(p);
                    }
                }
                else {
                    if(st) {
                        if(!s.isEmpty()) {
                            if(s.get(s.size() - 1) != element) st = false;
                            else s.remove(s.size() - 1);
                        }
                        else st = false;
                    }
                    
                    if(qu) {
                        if(!q.isEmpty()) {
                            if(q.get(0) != element) qu = false;
                            else q.remove(0);
                        }
                        else qu = false;
                    }
                    if(pq) {
                        if(!p.isEmpty()) {
                            if(p.get(p.size() - 1) != element) pq = false;
                            else p.remove(p.get(p.size() - 1));
                        }
                        else pq = false;
                    }
                }
            }
            int possibles = (st?1:0) + (qu?1:0) + (pq?1:0);
            if(possibles > 1) System.out.println("not sure");
            else if(possibles == 0) System.out.println("impossible");
            else {
                if(st) System.out.println("stack");
                else if(qu) System.out.println("queue");
                else System.out.println("priority queue");
            }
        }
    }
}