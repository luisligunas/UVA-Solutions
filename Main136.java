//WILL NOT WORK. AT ALL. GDI.
//I think I cheated here ugh.

public class Main136 {
    public static void main(String[] args) {
        fillArray();
        System.out.println("The 1500'th ugly number is " + nthUglyNumber(1500) + ".");
    }
    static boolean[] yarra = new boolean[1417674736];
    public static void fillArray() {
        for(int i = 0; Math.pow(2, i) < yarra.length; i++) {
            int temp = (int)Math.pow(2, i);
            for(int j = 0; Math.pow(3, j) < yarra.length; j++) {
                int temp2 = (int)Math.pow(3, j);
                for(int k = 0; Math.pow(5, k) < yarra.length; k++) {
                    int temp3 = (int)Math.pow(5, k);
                    
                    yarra[temp*temp2*temp3] = true;
                }
            }
        }
    }
    public static int nthUglyNumber(int num) {
        int count = 0;
        int out = 1;
        for(int i = 0; count != num; i++) {
            if(yarra[i]) {
                out = i;
                count++;
            }
        }
        return out;
    }
}
