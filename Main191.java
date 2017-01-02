import java.awt.Polygon;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.*;

public class Main191 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine().split("\\s+")[0]);
        String[] split;
        
        for(int z = 0; z < tC; z++) {
            split = br.readLine().split("\\s+");
            
            Line2D.Double line = new Line2D.Double(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
            int left = Integer.parseInt(split[4]);
            int up = Integer.parseInt(split[5]);
            int right = Integer.parseInt(split[6]);
            int down = Integer.parseInt(split[7]);
            Polygon p = new Polygon();
            p.addPoint(left, up);
            p.addPoint(right, up);
            p.addPoint(right, down);
            p.addPoint(left, down);
            Rectangle2D.Double rect = new Rectangle2D.Double(left, up, right - left, down - up);
            
            if(line.intersects(rect) 
                    || p.contains(line.getP1())
                    || p.contains(line.getP2())
                    || line.intersectsLine(new Line2D.Double(left, up, right, up)) 
                    || line.intersectsLine(new Line2D.Double(left, down, right, down))
                    || line.intersectsLine(new Line2D.Double(left, up, left, down))
                    || line.intersectsLine(new Line2D.Double(right, up, right, down))) {
                pw.println("T");
                continue;
            }
            pw.println("F");
        }
        
        pw.close();
    }
}
