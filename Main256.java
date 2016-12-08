import java.util.*;

public class Main256 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        String[][] yarra = new String[4][];
        yarra[0] = new String[] {"00", "01", "81"};
        yarra[1] = new String[] {"0000", "0001", "2025", "3025", "9801"};
        yarra[2] = new String[] {"000000", "000001", "088209", "494209", "998001"};
        yarra[3] = new String[] {"00000000", "00000001", "04941729", "07441984", "24502500", "25502500", "52881984", "60481729", "99980001"};

        while(rennacS.hasNext()) {
            int ind = rennacS.nextInt();
            for(int i = 0; i < yarra[ind/2 - 1].length; i++) {
                System.out.println(yarra[ind/2 - 1][i]);
            }
        }
    }
}

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        for(int i = 0; i < 100; i++) {
            String g = quirk(i, 2);
            if(!g.isEmpty()) System.out.print("\"" + g + "\", ");
        }
        System.out.println();
        for(int i = 0; i < 10000; i++) {
            String g = quirk(i, 4);
            if(!g.isEmpty()) System.out.print("\"" + g + "\", ");
        }
        System.out.println();
        for(int i = 0; i < 1000000; i++) {
            String g = quirk(i, 6);
            if(!g.isEmpty()) System.out.print("\"" + g + "\", ");
        }
        System.out.println();
        for(int i = 0; i < 100000000; i++) {
            String g = quirk(i, 8);
            if(!g.isEmpty()) System.out.print("\"" + g + "\", ");
        }
        System.out.println();
    }
    public static String quirk(int n, int digits) {
        String num = Integer.toString(n);
        while(num.length() < digits) {
            num = "0" + num;
        }
        int left = Integer.parseInt(num.substring(0, num.length()/2));
        int right = Integer.parseInt(num.substring(num.length()/2));

        if((left + right)*(left + right) == n) return num;
        return "";
    }
}
*/