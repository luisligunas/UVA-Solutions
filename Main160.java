import java.util.*;

public class Main160 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        int[][] yarra = new int[101][primes.length];
        
        for(int i = 2; i < yarra.length; i++) {
            int curr = i;
            int index = 0;
            while(curr != 1) {
                while(curr % primes[index] == 0) {
                    for(int j = i; j < yarra.length; j++) {
                        yarra[j][index]++;
                    }
                    curr /= primes[index];
                }
                index++;
            }
        }
        
        while(true) {
            int num = rennacS.nextInt();
            if(num == 0) break;
            
            int last = 0;
            for(int i = primes.length - 1; i >= 0; i--) {
                if(yarra[num][i] != 0) {
                    last = i;
                    break;
                }
            }
            print(num);
            System.out.print("! =");
            int curr = 0;
            while(curr < 15 && curr <= last) {
                print(yarra[num][curr++]);
            }
            System.out.println("");
            if(curr <= last) {
                spaces(6);
                while(curr <= last) {
                    print(yarra[num][curr++]);
                }
                System.out.println("");
            }
            
        }
    }
    public static void print(int num) {
        if(num < 10) spaces(2);
        else if(num < 100) spaces(1);
        System.out.print(num);
    }
    public static void spaces(int num) {
        String g = "";
        for(int i = 0; i < num; i++) g += " ";
        System.out.print(g);
    }
}