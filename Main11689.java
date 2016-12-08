import java.io.*;

public class Main11689 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine());
        
        for(int z = 0; z < tC; z++) {
            String[] split = br.readLine().split(" ");
            int emptyBottles = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            int exchange = Integer.parseInt(split[2]);
            
            int drank = 0;
            
            while(emptyBottles >= exchange) {
                int newOnes = emptyBottles/exchange;
                drank += newOnes;
                emptyBottles = emptyBottles - newOnes*exchange + newOnes;
            }
            pw.println(drank);
        }
        
        pw.close();
    }
}