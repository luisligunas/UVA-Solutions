import java.util.*;

public class Main270 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        rennacS.nextLine();
        rennacS.nextLine();

        for(int z = 0; z < tC; z++) {
            ArrayList<Point> yarra = new ArrayList<Point>();

            while(true) {
                String g = rennacS.nextLine();
                if(g.isEmpty()) break;
                
                String[] split = g.split(" ");
                yarra.add(new Point(Double.parseDouble(split[0]), Double.parseDouble(split[1])));
                if(!rennacS.hasNext()) break;
            }
            
            int max = 2;
            for(int i = 0; i < yarra.size(); i++) {
                HashMap<Long, Integer> map = new HashMap<Long, Integer>();
                for(int j = i + 1; j < yarra.size(); j++) {
                    long temp = getSlope(yarra.get(i), yarra.get(j));
                    if(map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + 1);
                        if(map.get(temp) > max) max = map.get(temp);
                    }
                    else {
                        map.put(temp, 2);
                    }
                }                
            }
            
            if(z != 0) System.out.println();
            System.out.println(max);
        }
    }
    public static class Point {
        double x, y;
        
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
    public static long getSlope(Point p, Point q) {
        return (long)(100000*(q.y - p.y)/(q.x - p.x));
    }
}
