import java.util.*;

public class Main10901 {
    static int currTime, travelTime, allowableCars;
    static boolean atLeft;
    static Queue<Car> left, right;
    static int[] answers;
    public static void main(String[] args) {
    	Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            allowableCars = rennacS.nextInt();
            travelTime = rennacS.nextInt();
            int cars = rennacS.nextInt();
            answers = new int[cars];
            
            left = new LinkedList<Car>();
            right = new LinkedList<Car>();
            
            for(int i = 0; i < cars; i++) {
                int num = rennacS.nextInt();
                if(rennacS.next().equals("left")) left.add(new Car(i, num));
                else right.add(new Car(i, num));
            }
            currTime = 0;
            atLeft = true;
            
            while(!left.isEmpty() || !right.isEmpty()) {
                if(left.isEmpty()) {
                    emptyQueue(right);
                    continue;
                }
                else if(right.isEmpty()) {
                    emptyQueue(left);
                    continue;
                }
                if(atLeft) emptyBothQueues(left);
                else emptyBothQueues(right);
                atLeft = !atLeft;
            }
            if(z != 0) System.out.println("");
            for(int i = 0; i < cars; i++) System.out.println(answers[i]);
        }
    }
    public static void emptyQueue(Queue<Car> q) {
        while(!q.isEmpty()) {
            if(q == left ^ atLeft) {
                atLeft = !atLeft;
                if(currTime < q.peek().time) currTime = q.peek().time;
                currTime += travelTime;
            }
            
            currTime = Math.max(currTime, q.peek().time);
            int onIt = 0;
            while(!q.isEmpty() && onIt < allowableCars) {
                if(q.peek().time <= currTime) {
                    answers[q.poll().index] = currTime + travelTime;
                    onIt++;
                }
                else break;
            }
            atLeft = !atLeft;
            currTime += travelTime;
        }
    }
    public static void emptyBothQueues(Queue<Car> here) {
        Queue<Car> there = here==right ? left:right;
        if(here.peek().time <= there.peek().time || here.peek().time <= currTime) {
            currTime = Math.max(currTime, here.peek().time);
            int onIt = 0;
            while(!here.isEmpty() && onIt < allowableCars) {
                if(here.peek().time <= currTime) {
                    answers[here.poll().index] = currTime + travelTime;
                    onIt++;
                }
                else break;
            }
            currTime += travelTime;
        }
        else currTime = Math.max(currTime + travelTime, there.peek().time + travelTime);
    }
    public static class Car {
        int index, time;
        
        public Car(int index, int time) {
            this.index = index;
            this.time = time;
        }
    }
}