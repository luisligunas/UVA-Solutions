import java.util.*;

public class Main476 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        ArrayList<Rectangle> yarra = new ArrayList<Rectangle>();

        while(true) {
            if(rennacS.next().equals("*")) break;

            yarra.add(new Rectangle(rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble()));
        }

        for(int z = 1; true; z++) {
            double x = rennacS.nextDouble();
            double y = rennacS.nextDouble();

            if(Math.abs(x - 9999.9) <= Math.exp(-6) && Math.abs(x - 9999.9) <= Math.exp(-6)) break;

            boolean pasok = false;
            for(int i = 0; i < yarra.size(); i++) {
                Rectangle curr = yarra.get(i);
                if(x > curr.x1 && x < curr.x2 && y < curr.y1 && y > curr.y2) {
                    System.out.println("Point " + z + " is contained in figure " + (i + 1));
                    pasok = true;
                }
            }
            if(!pasok) System.out.println("Point " + z + " is not contained in any figure");
        }
    }
    public static class Rectangle {
        double x1, y1, x2, y2;

        public Rectangle(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
}