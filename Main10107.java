import java.util.*;

public class Main10107 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        ArrayList<Long> numbers = new ArrayList<Long>();
        
        while(rennacS.hasNext()) {
            numbers.add(rennacS.nextLong());
            Collections.sort(numbers);
            int temp = numbers.size();
            if(temp % 2 == 0) System.out.println((numbers.get(temp/2) + numbers.get(temp/2 - 1)) / 2);
            else System.out.println(numbers.get(temp/2));
        }
    }
}
