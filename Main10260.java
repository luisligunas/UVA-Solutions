import java.util.*;

public class Main10260 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String g = rennacS.next();
            
            for(int i = 0; i < g.length(); i++) {
                char mander = g.charAt(i);
                
                if(mander == 'A' || mander == 'E' || mander == 'I' || mander == 'O' || mander == 'U' || mander == 'H' || mander == 'W' || mander == 'Y') continue;
                
                int soundex = soundex(mander);
                while(i != g.length() - 1 && soundex(g.charAt(i+1)) == soundex) i++;
                System.out.print(soundex);
            }
            System.out.println("");
        }
    }
    public static int soundex(char mander) {
        switch (mander) {
            case 'B':
            case 'F':
            case 'P':
            case 'V':
                return 1;
            case 'C':
            case 'G':
            case 'J':
            case 'K':
            case 'Q':
            case 'S':
            case 'X':
            case 'Z':
                return 2;
            case 'D':
            case 'T':
                return 3;
            case 'L':
                return 4;
            case 'M':
            case 'N':
                return 5;
            case 'R':
                return 6;
            default:
                return 7;
        }
    }
}
