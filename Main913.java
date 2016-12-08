//ProgVar Tryouts Problems
//from netbook

import java.util.Scanner;
import java.math.BigInteger;

public class Main913 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            BigInteger input = new BigInteger(rennacS.nextLine());
            input = input.add(new BigInteger("1"));
            input = input.multiply(input);
            input = input.multiply(new BigInteger("3"));
            input = input.divide(new BigInteger("2"));
            input = input.subtract(new BigInteger("9"));
            
            System.out.println(input.toString());
        }
    }
}
