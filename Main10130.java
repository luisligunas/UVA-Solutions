import java.util.*;

public class Main10130 {
    static Thing[] yarra;
    static int limit;
    static int[] dp;
    static int[][] bam;

    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        int tC = rennacS.nextInt();

        for(int z = 0; z < tC; z++) {
            yarra = new Thing[rennacS.nextInt()];
            dp = new int[31]; //I-DP MO LOL.


            for(int i = 0; i < yarra.length; i++) yarra[i] = new Thing(rennacS.nextInt(), rennacS.nextInt());
            Arrays.sort(yarra);

            int members = rennacS.nextInt();
            int out = 0;

            for(int i = 0; i < members; i++) {
                limit = rennacS.nextInt();
                bam = new int[yarra.length][31];
                if(dp[limit - 1] == 0) dp[limit - 1] = boom(0, 0);
                out += dp[limit - 1];
            }
            System.out.println(out);
        }
    }
    public static int boom(int ind, int weight) {
        if(ind == yarra.length) return 0;
        if(yarra[ind].weight + weight > limit) return 0;
        if(bam[ind][weight] != 0) return bam[ind][weight];

        bam[ind][weight] = Math.max(yarra[ind].price + boom(ind + 1, yarra[ind].weight + weight), boom(ind + 1, weight));
        return bam[ind][weight];
    }

    public static class Thing implements Comparable<Thing> {
        int price, weight;

        public Thing(int price, int weight) {
            this.price = price;
            this.weight = weight;
        }
        public int compareTo(Thing t) {
            if(weight == t.weight) return t.price - price;
            return weight - t.weight;
        }
    }
}