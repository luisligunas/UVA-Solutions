import java.util.Scanner;

public class Main11349 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int testCases = rennacS.nextInt();
        for(int i = 1; i <= testCases; i++) {
            rennacS.next();
            rennacS.next();
            int dim = rennacS.nextInt();
            boolean symmetric = true;
            
            System.out.print("Test #" + i + ": ");
            
            long[][] yarra = new long[dim/2][dim];
            for(int j = 0; j < dim/2; j++) {
                for(int k = 0; k < dim; k++) {
                    yarra[j][k] = rennacS.nextLong();
                    if(symmetric) {
                        if(yarra[j][k] < 0) symmetric = false;
                    }
                }
            }
            if(dim % 2 == 1) {
                long[] temp = new long[dim];
                for(int j = 0; j < dim; j++) temp[j] = rennacS.nextLong();
                for(int j = 0; j < dim/2; j++) {
                    if(symmetric) {
                        if(temp[j] != temp[dim - j - 1]) symmetric = false;
                        else if(temp[j] < 0) symmetric = false;
                        else if(temp[dim - j -1] < 0) symmetric = false;
                    }
                }
                if(symmetric) {
                    if(temp[(dim-1)/2] < 0) symmetric = false;
                }
            }
            for(int j = 0; j < dim/2; j++) {
                for(int k = 0; k < dim; k++) {
                    long temp = rennacS.nextLong();
                    if(symmetric) {
                        if(temp != yarra[(dim/2) - j - 1][dim - k - 1]) symmetric = false;
                        if(temp < 0) symmetric = false;
                    }
                }
            }
            if(symmetric) System.out.println("Symmetric.");
            else System.out.println("Non-symmetric.");
        }
    }
}