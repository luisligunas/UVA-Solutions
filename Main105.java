import java.io.*;

public class Main105 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String str;
        String[] split;
        int[] yarra = new int[10001];
        
        while((str = br.readLine()) != null) {
            split = str.split("\\s+");
            int l = Integer.parseInt(split[0]);
            int h = Integer.parseInt(split[1]);
            int r = Integer.parseInt(split[2]);
            
            while(l < r) {
                yarra[l] = Math.max(yarra[l++], h);
            }
        }
        
        int past = 0;
        int i = -1;
        
        while(yarra[i++ + 1] == 0) {};
        past = yarra[i];
        pw.print(i);
        
        for(; i < yarra.length; i++) {
            if(yarra[i] != past) {
                pw.print(" " + past + " " + i);
                past = yarra[i];
            }
        }
        
        pw.println(" 0");
        pw.close();
    }
}
