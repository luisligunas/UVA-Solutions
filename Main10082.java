import java.util.Scanner;

public class Main10082 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        String base = " `1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        
        while(rennacS.hasNext()) {
            String g = rennacS.nextLine();
            String out = "";
            for(int i = 0; i < g.length(); i++) {
                int ind = base.indexOf(g.substring(i, i + 1));
                if(ind == 0) out += " ";
                else out += base.substring(ind - 1, ind);
            }
            System.out.println(out);
        }
    }
}
