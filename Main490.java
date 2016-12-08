//this is correct. If ever future Luis tries to run this again and wonders why it won't work, you just have to put a file parameter in the scanner. You're welcome.

import java.util.Scanner;
import java.util.ArrayList;

public class Main490 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        ArrayList<String> yarra = new ArrayList<String>();
        
        while(rennacS.hasNext()) yarra.add(0, rennacS.nextLine());
        
        while(true) {
            String g = "";
            for(int i = 0; i < yarra.size(); i++) {
                String temp = yarra.get(i);
                
                if(temp.length() > 1) {
                    g += temp.substring(0, 1);
                    yarra.set(i, temp.substring(1, temp.length()));
                }
                else if(temp.length() == 1) {
                    g += temp;
                    yarra.set(i, "");
                }
                else g += " ";
            }
            System.out.println(g);
            
            boolean out = true;
            for(int i = 0; i < yarra.size(); i++) {
                if(!yarra.get(i).equals("")) {
                    out = false;
                    break;
                }
            }
            if(out) break;
        }
    }
}
