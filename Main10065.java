import java.util.*;

public class Main10065 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        for(int z = 1; true; z++) {
            int points = rennacS.nextInt();
            if(points == 0) break;
            
            double smaller = 0;
            ArrayList<Point> yarra = new ArrayList<Point>();
            for(int i = 0; i < points; i++) {
                yarra.add(new Point(rennacS.nextInt(), rennacS.nextInt()));
            }
            yarra.add(yarra.get(0));
            
            for(int i = 0; i < points; i++) {
                smaller += yarra.get(i).x*yarra.get(i+1).y - yarra.get(i).y*yarra.get(i+1).x;
            }
            yarra.remove(points);
            Collections.sort(yarra);
            
            ArrayList<Integer> upHull = new ArrayList<Integer>();
            
            for(int i = 0; i < points; i++) {
                if(upHull.size() < 2) {
                    upHull.add(i);
                    continue;
                }
                int aNum = upHull.get(upHull.size() - 2);
                int bNum = upHull.get(upHull.size() - 1);
                Point a = yarra.get(aNum);
                Point b = yarra.get(bNum);
                Point c = yarra.get(i);
                
                int determinant = (a.x - b.x)*(c.y - b.y) - (c.x - b.x)*(a.y - b.y);
                
                if(determinant >= 0) upHull.add(i);
                else {
                    upHull.remove(upHull.size() - 1);
                    i--;
                }
            }
            ArrayList<Integer> downHull = new ArrayList<Integer>();
            
            for(int i = points - 1; i >= 0; i--) {
                if(downHull.size() < 2) {
                    downHull.add(i);
                    continue;
                }
                int aNum = downHull.get(downHull.size() - 2);
                int bNum = downHull.get(downHull.size() - 1);
                Point a = yarra.get(aNum);
                Point b = yarra.get(bNum);
                Point c = yarra.get(i);
                
                int determinant = (a.x - b.x)*(c.y - b.y) - (c.x - b.x)*(a.y - b.y);
                
                if(determinant >= 0) downHull.add(i);
                else {
                    downHull.remove(downHull.size() - 1);
                    i++;
                }
            }
            
            double bigger = 0;
            for(int i = 0; i < upHull.size() - 1; i++) {
                bigger += yarra.get(upHull.get(i)).x*yarra.get(upHull.get(i+1)).y - yarra.get(upHull.get(i)).y*yarra.get(upHull.get(i+1)).x;
            }
            for(int i = 0; i < downHull.size() - 1; i++) {
                bigger += yarra.get(downHull.get(i)).x*yarra.get(downHull.get(i+1)).y - yarra.get(downHull.get(i)).y*yarra.get(downHull.get(i+1)).x;
            }
            smaller /= 2.0;
            bigger /= 2.0;
            
            System.out.print("Tile #" + z + "\nWasted Space = ");
            System.out.printf("%.2f ", Math.abs(1.0 - Math.abs(smaller/bigger))*100);
            System.out.println("%\n");
        }
    }
    public static void recurse() {
        
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