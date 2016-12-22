import java.io.*;
import java.util.HashMap;

public class Main107 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static HashMap<Integer, Boolean> primes = new HashMap<>();
    
    public static void main(String[] args) throws IOException {
        fillSieve();
        String[] split;
        
        while(true) {
            split = br.readLine().split("\\s+");
            long hx = Long.parseLong(split[0]);
            long f1 = Long.parseLong(split[1]);
            if(hx + f1 == 0) break;
            
            if(hx == 1) {
                pw.println("0 1");
                continue;
            }
            if(f1 == 1) {
                long count = 0;
                long totHeight = 1;
                while(hx != 1) {
                    count++;
                    totHeight += hx;
                    hx /= 2;
                }
                pw.println(count + " " + totHeight);
                continue;
            }
            if(f1 + 1 == hx) {
                pw.println("1 " + (f1+hx));
                continue;
            }
            long x = getCommonExponent(hx, f1) + 1;
            //x is the number of stages of cats
            long N = (long)Math.pow(hx, 1.0/(x - 1)) - 1;
            while((long)Math.pow(N + 1, x - 1) < hx) N++;
            while((long)Math.pow(N + 1, x - 1) > hx) N--;
            //N is the number of cats in a hat

            long notWorkers = 0;
            long totalHeight = f1;
            long catsOnLevel = 1;
            
            while(catsOnLevel != f1) {
                notWorkers += catsOnLevel;
                totalHeight += catsOnLevel*hx;
                hx /= (N+1);
                catsOnLevel *= N;
            }
            
            pw.println(notWorkers + " " + totalHeight);
        }
        
        pw.close();
    }
    public static void fillSieve() {
        boolean[] composite = new boolean[1000001];
        
        for (int i = 2; i < composite.length; i++) {
            if(!composite[i]) {
                primes.put(i, true);
                for (int j = 2; i * j < composite.length; j++) {
                    composite[i*j] = true;
                }
            }
        }
    }
    public static long gcd(long a, long b){
        if(a == 0 || b == 0) return a + b;
        return gcd(b, a % b);
    }
    public static long getDivisor(long n) {
        for(HashMap.Entry<Integer, Boolean> entry : primes.entrySet()) {
            if(n % entry.getKey() == 0) return entry.getKey();
        }
        return n;
    }
    public static long getCommonExponent(long a, long b) {
        int minA = Integer.MAX_VALUE;
        while(a != 1) {
            long div = getDivisor(a);
            int count = 0;
            while(a % div == 0) {
                a /= div;
                count++;
            }
            minA = Math.min(minA, count);
        }
        int minB = Integer.MAX_VALUE;
        while(b != 1) {
            long div = getDivisor(b);
            int count = 0;
            while(b % div == 0) {
                b /= div;
                count++;
            }
            minB = Math.min(minB, count);
        }
        return gcd(minA, minB);
    }
}
