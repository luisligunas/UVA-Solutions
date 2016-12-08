import java.util.*;

public class Main924 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int numEmployees = rennacS.nextInt();
        
        Person[] employees = new Person[numEmployees];
        
        for(int i = 0; i < numEmployees; i++) {
            int numFriends = rennacS.nextInt();
            employees[i] = new Person();
            
            for(int j = 0; j < numFriends; j++) {
                employees[i].friends.add(rennacS.nextInt());
            }
        }
        int tC = rennacS.nextInt();
        for(int z = 0; z < tC; z++) {
            boolean[] heard = new boolean[numEmployees];
            int source = rennacS.nextInt();
            int size = 0, boom = 0;
            heard[source] = true;
            
            ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
            temp.add(employees[source].friends);
            Queue<ArrayList<ArrayList<Integer>>> q = new LinkedList<>();
            q.add(temp);
            
            for(int i = 1; !q.isEmpty(); i++) {
                ArrayList<ArrayList<Integer>> curr = q.poll();
                ArrayList<ArrayList<Integer>> next = new ArrayList<>();
                int numHeard = 0;
                for(int j = 0; j < curr.size(); j++) {
                    ArrayList<Integer> friends = curr.get(j);
                    for(int k = 0; k < friends.size(); k++) {
                        if(!heard[friends.get(k)]) {
                            heard[friends.get(k)] = true;
                            next.add(employees[friends.get(k)].friends);
                            numHeard++;
                        }
                    }
                }
                if(numHeard > size) {
                    size = numHeard;
                    boom = i;
                }
                if(!next.isEmpty()) q.add(next);
            }
            
            if(size == 0 && boom == 0) System.out.println("0");
            else System.out.println(size + " " + boom);
        }
    }
    public static class Person {
        ArrayList<Integer> friends;
        
        public Person() {
            friends = new ArrayList<Integer>();
        }
    }
}
