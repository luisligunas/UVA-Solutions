import java.io.*;

public class Main10192 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        for(int z = 1; true; z++) {
            String a = br.readLine();
            if(a.equals("#")) break;
            String b = br.readLine();
            
            int[][] yarra = new int[a.length() + 1][b.length() + 1]; //a yung left; b yung up
            
            for(int i = 1; i < a.length() + 1; i++) {
                for(int j = 1; j < b.length() + 1; j++) {
                    if(a.charAt(i - 1) == b.charAt(j - 1)) yarra[i][j] = yarra[i-1][j-1] + 1;
                    else yarra[i][j] = Math.max(yarra[i-1][j], yarra[i][j-1]);
                }
            }
            
            pw.println("Case #" + z + ": you can visit at most " + yarra[a.length()][b.length()] + " cities.");
        }
        pw.close();
    }
}