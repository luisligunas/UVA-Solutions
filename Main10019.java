import java.util.*;

public class Main10019 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        
        for(int z = 0; z < tC; z++) {
            long num = rennacS.nextLong();
            long decBit = Long.bitCount(num);
            long hexInDec = hexToDec(Long.toString(num));
            long hexBit = Long.bitCount(hexInDec);
            
            System.out.println(decBit + " " + hexBit);
        }
    }
    public static long hexToDec(String hex) {
        long decimal = 0;
        
        for(int i = 0; i < hex.length(); i++) {
            char curr = hex.charAt(hex.length() - 1 - i);
            
            int mult = 0;
            if(curr >= '0' && curr <= '9') mult = curr - '0';
            else mult = curr - 'a' + 10; //'di ata kailangan lol
            
            decimal += mult*(1 << 4*i);
        }
        return decimal;
    }
}
