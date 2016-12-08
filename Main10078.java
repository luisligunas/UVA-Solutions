import java.util.*;

public class Main10078 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        Pair[] yarra = new Pair[1];
        
        while(true) {
            String g = rennacS.nextLine();
            if(g.equals("0")) break;
            if(!g.contains(" ")) {
                yarra = new Pair[Integer.parseInt(g) + 2];
                continue;
            }
            String[] split = g.split(" ");
            yarra[0] = new Pair(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            
            for(int i = 1; i < yarra.length - 2; i++) yarra[i] = new Pair(rennacS.nextInt(), rennacS.nextInt());
            yarra[yarra.length - 2] = yarra[0];
            yarra[yarra.length - 1] = yarra[1];
            rennacS.nextLine();
            
            int first = (yarra[0].x-yarra[1].x)*(yarra[2].y-yarra[1].y) - (yarra[2].x-yarra[1].x)*(yarra[0].y-yarra[1].y);
//            System.out.println("wat: " + first);
            boolean okay = true;
            
            for(int i = 1; i < yarra.length - 2; i++) {
                int dot = (yarra[i].x-yarra[i+1].x)*(yarra[i+2].y-yarra[i+1].y) - (yarra[i+2].x-yarra[i+1].x)*(yarra[i].y-yarra[i+1].y);
//                System.out.println("wat: " + dot);
                
                if(first <= 0 ^ dot <= 0) {
                    okay = false;
                    break;
                }
            }
            if(okay) System.out.println("No");
            else System.out.println("Yes");
        }
    }
    public static class Pair {
        int x, y;
        
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
