import java.io.*;

public class Main10179 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        while(true) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) break;
            
            pw.println(totient(num));
        }
        pw.close();
    }
    public static int totient(int n) {
        if (n <= 1) return 1;
        
        int tot = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) tot -= tot / i;
            while (n % i == 0) n /= i;
        }
        return tot - (n > 1 ? tot / n : 0);
    }
}