import java.io.*;

public class Main11462 {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
            int nums = Integer.parseInt(b.readLine());
            if(nums == 0) break;
            
            String[] lol = b.readLine().split(" ");
            int[] yarra = new int[100];
            boolean firstPassed = false;
            
            for(int i = 0; i < lol.length; i++) {
                yarra[Integer.parseInt(lol[i])]++;
            }
            
            for(int i = 0; i < yarra.length; i++) {
                for(int j = 0; j < yarra[i]; j++) {
                    if(firstPassed) log.write(" ");
                    else firstPassed = true;
                    log.write(Integer.toString(i));
                }
            }
            log.write("\n");
        }
        log.flush();
    }
}