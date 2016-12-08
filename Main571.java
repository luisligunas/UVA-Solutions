import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main571 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            Queue<int[]> coords = new LinkedList<>();
            Queue<String> log = new LinkedList<>();
            int cA = rennacS.nextInt();
            int cB = rennacS.nextInt();
            int goal = rennacS.nextInt();
            int[] start = {0, 0};
            boolean[][] wrong = new boolean[1001][1001];
            String out = "";
            
            coords.add(start);
            log.add("");
            while(true) {
                int[] temp = (int[])coords.remove();
                String s = (String)log.remove();
                if(!wrong[temp[0]][temp[1]]) {
                    if(temp[0] == goal || temp[1] == goal) {
                        out = s;
                        break;
                    }
                    wrong[temp[0]][temp[1]] = true;
                    
                    
                    coords.add(fillA(temp, cA));
                    coords.add(fillB(temp, cB));
                    coords.add(emptyA(temp));
                    coords.add(emptyB(temp));
                    coords.add(pourAtoB(temp, cB));
                    coords.add(pourBtoA(temp, cA));
                    log.add(s.concat("1"));
                    log.add(s.concat("2"));
                    log.add(s.concat("3"));
                    log.add(s.concat("4"));
                    log.add(s.concat("5"));
                    log.add(s.concat("6"));
                }
            }
            for(int i = 0; i < out.length(); i++) {
                if(out.charAt(i) == '1') System.out.println("fill A");
                else if(out.charAt(i) == '2') System.out.println("fill B");
                else if(out.charAt(i) == '3') System.out.println("empty A");
                else if(out.charAt(i) == '4') System.out.println("empty B");
                else if(out.charAt(i) == '5') System.out.println("pour A B");
                else System.out.println("pour B A");
            }
            System.out.println("success");
        }
    }
    public static int[] fillA(int[] yarra, int cA) {
        int[] temp = {cA, yarra[1]};
        return temp;
    }
    public static int[] fillB(int[] yarra, int cB) {
        int[] temp = {yarra[0], cB};
        return temp;
    }
    public static int[] emptyA(int[] yarra) {
        int[] temp = {0, yarra[1]};
        return temp;
    }
    public static int[] emptyB(int[] yarra) {
        int[] temp = {yarra[0], 0};
        return temp;
    }
    public static int[] pourAtoB(int[] yarra, int cB) {
        if(yarra[0] + yarra[1] <= cB) {
            int[] temp = {0, yarra[0] + yarra[1]};
            return temp;
        }
        int[] temp = {yarra[0] + yarra[1] - cB , cB};
        return temp;
    }
    public static int[] pourBtoA(int[] yarra, int cA) {
        if(yarra[0] + yarra[1] <= cA) {
            int[] temp = {yarra[0] + yarra[1], 0};
            return temp;
        }
        int[] temp = {cA, yarra[0] + yarra[1] - cA};
        return temp;
    }
}
