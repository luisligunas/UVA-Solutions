import java.io.*;
import java.util.*;

public class Main106 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<Integer>();
        String str;
        int N = 0;
        int num;
        
        while((str = br.readLine()) != null) {
            num = Integer.parseInt(str);
            N = Math.max(num, N);
            q.add(num);
        }
        
        int[] primeTripleHere = new int[N + 1];
        int[] minusHere = new int[N + 1];
        int[] earliest = new int[N + 1];
        
        for(int i = 1; i*i <= N; i++) {
            for(int j = 1; j < i; j++) {
                if(!(i % 2 == 0 ^ j % 2 == 0)) continue;
                if(gcd(i, j) != 1) continue;

                int a = i*i - j*j;
                int b = 2*i*j;
                int c = i*i + j*j;
                if(c > N) continue;
                primeTripleHere[c]++;

                for(int k = 1; c*k <= N; k++) {
                    if(earliest[a*k] == 0) {
                        earliest[a*k] = c*k;
                        minusHere[c*k]++;
                    }
                    else {
                        if(c*k < earliest[a*k]) {
                            minusHere[earliest[a*k]]--;
                            minusHere[c*k]++;
                            earliest[a*k] = c*k;
                        }
                    }
                    if(earliest[b*k] == 0) {
                        earliest[b*k] = (int)(c*k);
                        minusHere[c*k]++;
                    }
                    else {
                        if(c*k < earliest[b*k]) {
                            minusHere[earliest[b*k]]--;
                            minusHere[c*k]++;
                            earliest[b*k] = c*k;
                        }
                    }
                    if(earliest[c*k] == 0) {
                        earliest[c*k] = c*k;
                        minusHere[c*k]++;
                    }
                    else {
                        if(c*k < earliest[c*k]) {
                            minusHere[earliest[c*k]]--;
                            minusHere[c*k]++;
                            earliest[c*k] = c*k;
                        }
                    }
                }
            }
        }
        for(int i = 1; i < minusHere.length; i++) {
            minusHere[i] = minusHere[i-1] + 1 - minusHere[i];
            primeTripleHere[i] += primeTripleHere[i - 1];
        }
        while(!q.isEmpty()) {
            num = q.remove();
            pw.println(primeTripleHere[num] + " " + minusHere[num]);
        }
        pw.close();
    }
    public static long gcd(long a, long b) {
        if(a == 0 || b == 0) return a + b;
        return gcd(b, a % b);
    }
}