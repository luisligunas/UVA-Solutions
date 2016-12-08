import java.util.*;

public class Main706 {
    static int[][] yarra = {{1, 3, 0, 3, 1},
                            {0, 2, 0, 2, 0},
                            {1, 2, 1, 1, 1},
                            {1, 2, 1, 2, 1},
                            {0, 3, 1, 2, 0},
                            {1, 1, 1, 2, 1},
                            {1, 1, 1, 3, 1},
                            {1, 2, 0, 2, 0},
                            {1, 3, 1, 3, 1},
                            {1, 3, 1, 2, 1}};
    static int[] digits;
    
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(true) {
            int size = rennacS.nextInt();
            String number = rennacS.next();
            if(size == 0 && number.equals("0")) break;
            
            String[] split = number.split("");
            digits = new int[split.length];
            for(int i = 0; i < digits.length; i++) digits[i] = Integer.parseInt(split[i]);
            
            String one = topMidBot(size, 0);
            String two = twoFour(size, 1);
            String three = topMidBot(size, 2);
            String four = twoFour(size, 3);
            String five = topMidBot(size, 4);
            
            System.out.println(one);
            for(int i = 0; i < size; i++) System.out.println(two);
            System.out.println(three);
            for(int i = 0; i < size; i++) System.out.println(four);
            System.out.println(five);
            System.out.println("");
        }
    }
    public static String topMidBot(int size, int index) {
        String out = "";
        for(int i = 0; i < digits.length; i++) {
            int num = digits[i];
            if(i != 0) out += "  ";
            else out += " ";
            
            char rahc = ' ';
            
            if(yarra[num][index] == 1) rahc = '-';
            for(int j = 0; j < size; j++) out += rahc;
            
            out += " ";
        }
        return out;
    }
    public static String twoFour(int size, int index) {
        String out = "";
        for(int i = 0; i < digits.length; i++) {
            int num = digits[i];
            if(i != 0) out += " ";
            
            switch (yarra[num][index]) {
                case 1:
                    out += "|";
                    for(int j = 1; j < size + 2; j++) out += ' ';
                    break;
                case 2:
                    for(int j = 1; j < size + 2; j++) out += ' ';
                    out += "|";
                    break;
                default:
                    out += "|";
                    for(int j = 2; j < size + 2; j++) out += ' ';
                    out += "|";
                    break;
            }
        }
        return out;
    }
}
