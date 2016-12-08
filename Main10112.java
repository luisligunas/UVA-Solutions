import java.util.*;

public class Main10112 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        double exp = Math.exp(-16);

        while(true) {
            int nodes = rennacS.nextInt();
            if(nodes == 0) break;

            ArrayList<Point> yarra = new ArrayList<Point>();
            for(int i = 0; i < nodes; i++) yarra.add(new Point(rennacS.next(), rennacS.nextInt(), rennacS.nextInt()));

            double max = 0;
            String thing = "wtf";

            for(int i = 0; i < nodes; i++) {
                for(int j = i+1; j < nodes; j++) {
                    for(int k = j+1; k < nodes; k++) {
                        Point a = yarra.get(i);
                        Point b = yarra.get(j);
                        Point c = yarra.get(k);

                        double area = Math.abs((c.y - a.y)*(b.x - a.x) - (b.y - a.y)*(c.x - a.x))/2.0;
                        if(area < max) continue;
                        if(Math.abs(getSlope(a, b) - getSlope(b, c)) <= exp) continue;


                        boolean rekt = false;
                        for(int l = 0; l < yarra.size(); l++) {
                            if(l == i || l == j || l == k) continue;
                            Point d = yarra.get(l);

                            int e = (a.x - b.x)*(d.y - b.y) - (d.x - b.x)*(a.y - b.y);
                            int f = (b.x - c.x)*(d.y - c.y) - (d.x - c.x)*(b.y - c.y);
                            int g = (c.x - a.x)*(d.y - a.y) - (d.x - a.x)*(c.y - a.y);

                            boolean e0 = e == 0;
                            boolean ep = e > 0;
                            boolean en = e < 0;
                            boolean f0 = f == 0;
                            boolean fp = f > 0;
                            boolean fn = f < 0;
                            boolean g0 = g == 0;
                            boolean gp = g > 0;
                            boolean gn = g < 0;

                            if((e0 && ((fp && gp) || (fn && gn))) || (f0 && ((ep && gp) || (en && gn))) || (g0 && ((ep && fp) || (en && fn))) || (ep && fp && gp) || (en && fn && gn)) {
                                rekt = true;
                                break;
                            }
                        }
                        if(!rekt) {
                            max = area;
                            thing = a.name + b.name + c.name;
                        }
                    }
                }
            }
            System.out.println(thing);
        }
    }
    public static double getSlope(Point a, Point b) {
        if(a.x == b.x) return 13214.41463;
        return ((a.y - b.y)*1.0)/(a.x - b.x);
    }
    public static class Point {
        int x, y;
        String name;

        public Point(String name, int x, int y) {
            this.name = name;
            this.x = x;
            this.y = y;
        }
    }
}