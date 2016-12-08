import java.util.Scanner;

public class Main10341 {
    private static int p;
    private static int q;
    private static int r;
    private static int s;
    private static int t;
    private static int u;

    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            p = rennacS.nextInt();
            q = rennacS.nextInt();
            r = rennacS.nextInt();
            s = rennacS.nextInt();
            t = rennacS.nextInt();
            u = rennacS.nextInt();
            
            double e0 = equation(0);
            double e1 = equation(1);
            
            if(e0 == 0) System.out.println("0.0000");
            else if((e0 <= 0 && e1 >= 0) || (e0 >= 0 && e1 <= 0)) {
                double ratio = 2;
                double curr = 1;
                while(true) {
                    double temp = equation(curr);
                    if(Math.abs(temp) < Math.exp(-20)) break;

                    if(temp > 0) curr += 1/ratio;
                    else curr -= 1/ratio;
                    ratio *= 2;
                }
                System.out.printf("%.4f\n", curr);
            }
            else System.out.println("No solution");
        }
    }
    public static double equation(double x) {
        return p*Math.exp(-x) + q*Math.sin(x) + r*Math.cos(x) + s*Math.tan(x) + t*x*x + u;
    }
}