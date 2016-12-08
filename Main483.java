import java.util.Scanner;

public class Main483 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        while(rennacS.hasNext()) {
            String g = rennacS.nextLine();
            String temp = "";
            
            if(g.equals("")) System.out.println();
            else {
                for(int i = 0; i < g.length(); i++) {
                    if(g.charAt(i) == ' ') {
                        for(int j = temp.length() - 1; j >= 0; j--) System.out.print(temp.charAt(j));
                        System.out.print(" ");
                        temp = "";
                        if(i == g.length() - 1) break;
                    }
                    else temp += g.charAt(i);
                    if(i == g.length() - 1) {
                        for(int j = temp.length() - 1; j >= 0; j--) System.out.print(temp.charAt(j));
                    }
                }
                System.out.println();
            }
        }
    }
}
