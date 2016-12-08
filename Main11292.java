import java.util.*;

public class Main11292 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        while(true) {
            int heads = rennacS.nextInt();
            int knights = rennacS.nextInt();
            if(heads == 0 && knights == 0) break;

            if(heads > knights) System.out.println("Loowater is doomed!");
            else {
                int[] dragon = new int[heads];
                int[] heights = new int[knights];
                for(int i = 0; i < heads; i++) dragon[i] = rennacS.nextInt();
                for(int i = 0; i < knights; i++) heights[i] = rennacS.nextInt();
                Arrays.sort(dragon);
                Arrays.sort(heights);

                if(dragon[heads - 1] > heights[knights - 1]) System.out.println("Loowater is doomed!");
                else {
                    long out = 0;
                    int indOfKnight = 0;
                    boolean error = false;

                    for(int i = 0; i < heads; i++) {
                        while(true) {
                            if(knights - indOfKnight < heads - i) {
                                error = true;
                                break;
                            }
                            if(heights[indOfKnight] >= dragon[i]) {
                                out += heights[indOfKnight];
                                indOfKnight++;
                                break;
                            }
                            else indOfKnight++;
                        }
                        if(error) break;
                    }
                    if(error) System.out.println("Loowater is doomed!");
                    else System.out.println(out);
                }
            }
        }
    }
}
