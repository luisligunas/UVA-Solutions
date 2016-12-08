import java.util.Scanner;

public class Main382 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        System.out.println("PERFECTION OUTPUT");
        while(true) {
            int n = rennacS.nextInt();
            if(n == 0) break;
            
            String digits = Integer.toString(n);
            for(int i = 0; i < 5 - digits.length(); i++) System.out.print(" ");
            System.out.print(n + "  ");
            
            int compar = 0;
            for(int i = 2; i <= Math.sqrt(n) + 1; i++) {
                if(n % i == 0) {
                    compar = i;
                    break;
                }
            }
            if(compar == 0) System.out.println("DEFICIENT");
            else if(compar*compar == n) System.out.println("DEFICIENT");
            else if(n == 2) System.out.println("DEFICIENT");
            else{
                double ll = Math.sqrt(n);
                int sum = compar + 1 + (n/compar);
                compar = n/compar;
                for(int i = compar - 1; i >= ll; i--) {
                    if(n % i == 0) {
                        if(i*i != n) sum += (n/i);
                        sum += i;
                    }
                    if(sum > n) break;
                }
                if(sum > n) System.out.println("ABUNDANT");
                else if(sum < n) System.out.println("DEFICIENT");
                else System.out.println("PERFECT");
            }
        }
        System.out.println("END OF OUTPUT");
    }
}
