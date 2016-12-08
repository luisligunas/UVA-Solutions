import java.util.*;

public class Main12397 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            int num = rennacS.nextInt();
            
            String g = Integer.toString(num);
            int sticks = 0;
            for(int i = 0; i < g.length(); i++) {
                sticks += getNumSticks(Integer.parseInt(g.substring(g.length() - 1 - i, g.length() - i)), i);
            }
            System.out.println(sticks);
        }
    }
    public static int getNumSticks(int digit, int place) { //place = 0 if ones, place = 1 if tens
        if(digit == 0) return 0;
        if(place == 0) {
            if(digit < 4) return digit;
            if(digit == 4 || digit == 9) return 3;
            return digit-3;
        }
        if(place == 1) {
            if(digit < 4) return digit*2;
            if(digit == 4 || digit == 9) return 4;
            return (digit-4)*2;
        }
        if(place == 2) {
            if(digit < 4)  return digit*2;
            if(digit < 9) return Math.abs(digit-5)*2 + 3;
            return 6;
        }
        return 4*digit;
    }
}
