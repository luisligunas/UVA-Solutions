import java.util.*;

public class Main10252 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String a = rennacS.nextLine();
            String b = rennacS.nextLine();
            
            if(a.length() > b.length()) {
                String temp = a;
                a = b;
                b = temp;
            }
            
            char[] yarra = new char[a.length()];
            int emptyPart = 0;
            for(int i = 0; i < a.length(); i++) {
                if(b.contains(a.substring(i, i + 1))) {
                    yarra[emptyPart++] = a.charAt(i);
                    String temp = a.substring(i, i+1);
                    a = a.replaceFirst(temp, "");
                    b = b.replaceFirst(temp, "");
                    i--;
                }
            }
            Arrays.sort(yarra);
            for(int i = yarra.length - emptyPart; i < yarra.length; i++) System.out.print(yarra[i]);
            System.out.println("");
        }
    }
}