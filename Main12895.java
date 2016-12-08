import java.util.Scanner;
import java.math.BigInteger;

public class Main12895 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        
        for(int z = 0; z < testCases; z++) {
            BigInteger n = new BigInteger(rennacS.next());
            String meh = n.toString();
            boolean armstrong = false;
            
            for(int i = 1; i < 31; i++) {
                BigInteger temp = BigInteger.ZERO;
                for(int j = 0; j < meh.length(); j++) {
                    BigInteger bleh = new BigInteger(meh.substring(j, j + 1));
                    temp = temp.add(bleh.pow(i));
                    if(temp.compareTo(n) > 0) break;
                }
                if(temp.compareTo(n) > 0) break;
                else if(temp.compareTo(n) == 0) {
                    armstrong = true;
                    break;
                }
            }
            if(armstrong) System.out.println("Armstrong");
            else System.out.println("Not Armstrong");
        }
    }
}