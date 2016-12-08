import java.util.*;

public class Main109 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        ArrayList<ArrayList<Point>> kingdoms = new ArrayList<ArrayList<Point>>();
        ArrayList<Double> areas = new ArrayList<Double>();
        
        while(true) {
            int structures = rennacS.nextInt();
            if(structures == -1) break;
            
            ArrayList<Point> yarra = new ArrayList<Point>();
            for(int i = 0; i < structures; i++) yarra.add(new Point(rennacS.nextInt(), rennacS.nextInt()));
            Collections.sort(yarra);
            
            
            ArrayList<Integer> topHull = new ArrayList<Integer>();
            
            for(int i = 0; i < structures; i++) {
                if(topHull.size() < 2) {
                    topHull.add(i);
                    continue;
                }
                
                Point a = yarra.get(topHull.get(topHull.size() - 2));
                Point b = yarra.get(topHull.get(topHull.size() - 1));
                Point c = yarra.get(i);
                
                int determinant = (a.x - b.x)*(c.y - b.y) - (c.x - b.x)*(a.y - b.y);
                
                if(determinant >= 0) topHull.add(i);
                else {
                    topHull.remove(topHull.size() - 1);
                    i--;
                }
            }
            
            ArrayList<Integer> bottomHull = new ArrayList<Integer>();
            
            for(int i = structures - 1; i >= 0; i--) {
                if(bottomHull.size() < 2) {
                    bottomHull.add(i);
                    continue;
                }
                
                Point a = yarra.get(bottomHull.get(bottomHull.size() - 2));
                Point b = yarra.get(bottomHull.get(bottomHull.size() - 1));
                Point c = yarra.get(i);
                
                int determinant = (a.x - b.x)*(c.y - b.y) - (c.x - b.x)*(a.y - b.y);
                
                if(determinant >= 0) bottomHull.add(i);
                else {
                    bottomHull.remove(bottomHull.size() - 1);
                    i++;
                }
            }
            double bigger = 0;
            for(int i = 0; i < topHull.size() - 1; i++) {
                bigger += yarra.get(topHull.get(i)).x*yarra.get(topHull.get(i+1)).y - yarra.get(topHull.get(i)).y*yarra.get(topHull.get(i+1)).x;
            }
            for(int i = 0; i < bottomHull.size() - 1; i++) {
                bigger += yarra.get(bottomHull.get(i)).x*yarra.get(bottomHull.get(i+1)).y - yarra.get(bottomHull.get(i)).y*yarra.get(bottomHull.get(i+1)).x;
            }
            ArrayList<Point> finalHull = new ArrayList<Point>();
            for(int i = 0; i < topHull.size(); i++) finalHull.add(yarra.get(topHull.get(i)));
            for(int i = 1; i < bottomHull.size(); i++) finalHull.add(yarra.get(bottomHull.get(i)));
            kingdoms.add(finalHull);
            areas.add(Math.abs(bigger/2.0));
        }
        double totalDestroyed = 0;
        boolean[] boomed = new boolean[kingdoms.size()];
        while(rennacS.hasNext()) {
            Point c = new Point(rennacS.nextInt(), rennacS.nextInt());

            for(int i = 0; i < kingdoms.size(); i++) {
                ArrayList<Point> curr = kingdoms.get(i);
                boolean pweds = true;
                for(int j = 0; j < curr.size() - 1; j++) {
                    Point a = curr.get(j);
                    Point b = curr.get(j+1);
                
                    if((a.x - b.x)*(c.y - b.y) - (c.x - b.x)*(a.y - b.y) < 0) {
                        pweds = false;
                        break;
                    }
                }
                if(pweds) {
                    if(!boomed[i]) {
                        boomed[i] = true;
                        totalDestroyed += areas.get(i);
                    }
                    break;
                }
            }
        }
        System.out.printf("%.2f\n", totalDestroyed);
    }
    public static class Point implements Comparable<Point> {
        int x, y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        @Override
        public int compareTo(Point p) {
            if(x == p.x) return y - p.y;
            return x - p.x;
        }
    }
}
