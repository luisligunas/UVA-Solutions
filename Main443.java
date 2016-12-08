import java.util.*;

public class Main443 {
    static List<Integer> yarra = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        fillSieve();
        
        int[] basis = new int[yarra.size()];
        for(int i = 0; i < yarra.size(); i++) basis[i] = yarra.get(i);
        Arrays.sort(basis);
        
        while(true) {
            int n = rennacS.nextInt();
            if(n == 0) break;
            
            System.out.print("The " + n);
            String temp = Integer.toString(n);
            
            if(temp.length() == 1) {
                if(n == 1) System.out.print("st");
                else if(n == 2) System.out.print("nd");
                else if(n == 3) System.out.print("rd");
                else System.out.print("th");
            }
            else {
                temp = temp.substring(temp.length() - 2);
                if(temp.charAt(1) == '1') {
                    if(temp.charAt(0) == '1') System.out.print("th");
                    else System.out.print("st");
                }
                else if(temp.charAt(1) == '2') {
                    if(temp.charAt(0) == '1') System.out.print("th");
                    else System.out.print("nd");
                }
                else if(temp.charAt(1) == '3') {
                    if(temp.charAt(0) == '1') System.out.print("th");
                    else System.out.print("rd");
                }
                else System.out.print("th");
            }
            System.out.println(" humble number is " + basis[n-1] + ".");
        }
    }
    public static void fillSieve() {
        for(int i = 0; true; i++) {
            long temp = (long)Math.pow(7, i);
            if(temp > 2000000000) break;
            for(int j = 0; true; j++) {
                long temp2 = (long)Math.pow(5, j);
                if(temp*temp2 > 2000000000) break;
                for(int k = 0; true; k++) {
                    long temp3 = (long)Math.pow(3, k);
                    if(temp*temp2*temp3 > 2000000000) break;
                    for(int l = 0; true; l++) {
                        long temp4 = (long)Math.pow(2, l);
                        long meh = temp*temp2*temp3*temp4;
                        if(meh > 2000000000) break;
                        int n = (int)Math.pow(7, i)*(int)Math.pow(5, j)*(int)Math.pow(3, k)*(int)Math.pow(2, l);
                        if(!yarra.contains(n)) yarra.add(n);
                    }
                }
            }
        }
    }
}
