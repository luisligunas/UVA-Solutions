import java.util.Scanner;
import java.util.Arrays;

public class Main167 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        int boards = rennacS.nextInt();

        for(int z = 0; z < boards; z++) {
            int[][] inp = new int[8][8];
            int[][] yarra = new int[8][8];
            int max = 0;

            for(int i = 0; i < 8; i++) {
                for(int j = 0; j < 8; j++) inp[i][j] = rennacS.nextInt();
            }

            for(int i = 0; i < 8; i++) {
                yarra[i][0] = 1;
                for(int j = 0; j < 8; j++) {
                    if(i != j) {
                        yarra[j][1] = 1;
                        for(int k = 0; k < 8; k++) {
                            if(k != i && k != j) {
                                yarra[k][2] = 1;
                                for(int l = 0; l < 8; l++) {
                                    if(l != i && l != j && l != k) {
                                        yarra[l][3] = 1;
                                        for(int m = 0; m < 8; m++) {
                                            if(m != i && m != j && m != k && m != l) {
                                                yarra[m][4] = 1;
                                                for(int n = 0; n < 8; n++) {
                                                    if(n != i && n != j && n != k && n != l && n != m) {
                                                        yarra[n][5] = 1;
                                                        for(int o = 0; o < 8; o++) {
                                                            if(o != i && o != j && o != k && o != l && o != m && o != n) {
                                                                yarra[o][6] = 1;
                                                                for(int p = 0; p < 8; p++) {
                                                                    if(p != i && p != j && p != k && p != l && p != m && p != n && p != o) {
                                                                        yarra[p][7] = 1;
                                                                        if(!queensAttacking(yarra)) {
                                                                            int temp = 0;
                                                                            temp += inp[i][0] + inp[j][1] + inp[k][2] + inp[l][3] + inp[m][4] + inp[n][5] + inp[o][6] + inp[p][7];
                                                                            if(temp > max) max = temp;
                                                                        }
                                                                        yarra[p][7] = 0;
                                                                    }
                                                                }
                                                                yarra[o][6] = 0;
                                                            }
                                                        }
                                                        yarra[n][5] = 0;
                                                    }
                                                }
                                                yarra[m][4] = 0;
                                            }
                                        }
                                        yarra[l][3] = 0;
                                    }
                                }
                                yarra[k][2] = 0;
                            }
                        }
                        yarra[j][1] = 0;
                    }
                }
                yarra[i][0] = 0;
            }
            if(max > 99) System.out.println("  " + max);
            else if(max > 9) System.out.println("   " + max);
            else System.out.println("    " + max);
        }
    }
    
    public static boolean queensAttacking(int[][] yarra) {
        int[][] coords = new int[8][2];

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(yarra[i][j] == 1) {
                    coords[i][0] = i;
                    coords[i][1] = j;
                    break;
                }
            }
        }
        int[] frequency = new int[8];
        int[] frequency2 = new int[8];

        for(int i = 0; i < 8; i++) {
            frequency[coords[i][0]]++;
            frequency2[coords[i][1]]++;
            for(int j = i + 1; j < 8; j++) {
                if(Math.abs(coords[i][0] - coords[j][0]) == Math.abs(coords[i][1] - coords[j][1])) return true;
            }
        }
        Arrays.sort(frequency);
        if(frequency[0] != 1) return true;
        Arrays.sort(frequency2);
        if(frequency2[0] != 1) return true;

        return false;
    }
}