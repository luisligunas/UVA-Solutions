import java.util.*;

public class Main478 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        ArrayList<Shape> yarra = new ArrayList<Shape>();
        double exp = Math.exp(-6);

        while(true) {
            String type = rennacS.next();
            if(type.equals("*")) break;

            if(type.equals("r")) yarra.add(new Shape(rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble(), type.charAt(0)));
            else if(type.equals("c")) yarra.add(new Shape(rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble(), type.charAt(0)));
            else yarra.add(new Shape(rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble(), rennacS.nextDouble(), type.charAt(0)));
        }

        for(int z = 1; true; z++) {
            double x = rennacS.nextDouble();
            double y = rennacS.nextDouble();

            if(Math.abs(x - 9999.9) <= exp && Math.abs(x - 9999.9) <= exp) break;

            boolean pasok = false;
            for(int i = 0; i < yarra.size(); i++) {
                Shape curr = yarra.get(i);
                if(curr.type == 'c') {
                    if(Math.sqrt(Math.pow(curr.a - x, 2) + Math.pow(curr.b - y, 2)) < curr.c) {
                        System.out.println("Point " + z + " is contained in figure " + (i + 1));
                        pasok = true;
                    }
                }
                else if(curr.type == 'r') {
                    if(x > curr.a && x < curr.c && y < curr.b && y > curr.d) {
                        System.out.println("Point " + z + " is contained in figure " + (i + 1));
                        pasok = true;
                    }
                }
                else {
                    //det = (a.x - center.x) * (b.y - center.y) - (b.x - center.x) * (a.y - center.y)
                    double determinant = (curr.a - curr.c)*(y - curr.d) - (x - curr.c)*(curr.b - curr.d);
                    if(Math.abs(determinant) <= exp) continue;
                    
                    boolean positive = determinant > 0;
                    
                    determinant = (curr.c - curr.e)*(y - curr.f) - (x - curr.e)*(curr.d - curr.f);
                    if(Math.abs(determinant) <= exp) continue;
                    if(determinant > 0 ^ positive) continue;
                    
                    determinant = (curr.e - curr.a)*(y - curr.b) - (x - curr.a)*(curr.f - curr.b);
                    
                    if(Math.abs(determinant) <= exp) continue;
                    if(determinant > 0 ^ positive) continue;
                    
                    System.out.println("Point " + z + " is contained in figure " + (i + 1));
                    pasok = true;
                }
            }
            if(!pasok) System.out.println("Point " + z + " is not contained in any figure");
        }
    }
    public static class Shape {
        char type;
        double a, b, c, d, e, f;

        public Shape(double a, double b, double c, double d, char type) { //Rectangle
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.type = type;
        }
        public Shape (double a, double b, double c, char type) { //Circle
            this.a = a;
            this.b = b;
            this.c = c;
            this.type = type;
        }
        public Shape(double a, double b, double c, double d, double e, double f, char type) { //Triangle
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.type = type;
        }
    }
}