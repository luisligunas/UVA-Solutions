import java.util.*;
import java.math.BigInteger;

public class Main10070 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        BigInteger fourh = new BigInteger("400");
        BigInteger four = new BigInteger("4");
        BigInteger hun = new BigInteger("100");
        BigInteger fift = new BigInteger("15");
        BigInteger fiftfiv = new BigInteger("55");
        
        while(rennacS.hasNext()) {
            BigInteger year = new BigInteger(rennacS.next());
            
            boolean leap = year.mod(fourh).compareTo(BigInteger.ZERO) == 0 || (year.mod(four).compareTo(BigInteger.ZERO) == 0 && year.mod(hun).compareTo(BigInteger.ZERO) != 0);
            boolean hulu = year.mod(fift).compareTo(BigInteger.ZERO) == 0;
            
            if(leap) System.out.println("This is leap year.");
            if(hulu) System.out.println("This is huluculu festival year.");
            if(leap && (year.mod(fiftfiv).compareTo(BigInteger.ZERO) == 0)) System.out.println("This is bulukulu festival year.");
            
            if(!hulu && !leap) System.out.println("This is an ordinary year.");
            
            if(rennacS.hasNext()) System.out.println("");
        }
    }
}
