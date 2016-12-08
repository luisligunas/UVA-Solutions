import java.util.*;

public class Main477 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        ArrayList<Shape> yarra = new ArrayList<Shape>();
        double exp = Math.exp(-6);

        while(true) {
            String type = rennacS.next();
            if(type.equals("*")) break;

            if(type.equals("r")) yarra.add(new Shape(rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble()));
            else yarra.add(new Shape(rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble()));
        }

        for(int z = 1; true; z++) {
            double x = rennacS.nextDouble();
            double y = rennacS.nextDouble();

            if(Math.abs(x - 9999.9) <= exp && Math.abs(x - 9999.9) <= exp) break;

            boolean pasok = false;
            for(int i = 0; i < yarra.size(); i++) {
                Shape curr = yarra.get(i);
                if(Math.abs(curr.d - 9999.9) <= exp && Math.sqrt(Math.pow(curr.a - x, 2) + Math.pow(curr.b - y, 2)) < curr.c) {
                    System.out.println("Point " + z + " is contained in figure " + (i + 1));
                    pasok = true;
                }
                else if(x > curr.a && x < curr.c && y < curr.b && y > curr.d) {
                    System.out.println("Point " + z + " is contained in figure " + (i + 1));
                    pasok = true;
                }
            }
            if(!pasok) System.out.println("Point " + z + " is not contained in any figure");
        }
    }
    public static class Shape {
        double a, b, c, d;

        public Shape(double a, double b, double c, double d) { //Rectangle
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        public Shape (double a, double b, double c) { //Circle
            this.a = a;
            this.b = b;
            this.c = c;
            d = 9999.9;
        }
    }
}