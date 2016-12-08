//technically, I can just print the expected output. But that isn't the point of programming, is it?

import java.util.Arrays;

public class Main291 {
    public static void main(String[] args) {
        boolean[][] adjmatrix = new boolean[5][5];
        adjmatrix[0][1] = true;
        adjmatrix[1][0] = true;
        adjmatrix[0][2] = true;
        adjmatrix[2][0] = true;
        adjmatrix[0][4] = true;
        adjmatrix[4][0] = true;
        adjmatrix[1][2] = true;
        adjmatrix[2][1] = true;
        adjmatrix[1][4] = true;
        adjmatrix[4][1] = true;
        adjmatrix[2][3] = true;
        adjmatrix[3][2] = true;
        adjmatrix[2][4] = true;
        adjmatrix[4][2] = true;
        adjmatrix[3][4] = true;
        adjmatrix[4][3] = true;

        for(int i = 0; i == 0; i++) { //stupid loop but I'm kinda just doing it for uniformity
            for(int j = 0; j < 5; j++) {
                if(adjmatrix[i][j]) {
                    for(int k = 0; k < 5; k++) {
                        if(adjmatrix[j][k] && k != i) {
                            for(int l = 0; l < 5; l++) {
                                if(adjmatrix[k][l] && l != j) {
                                    for(int m = 0; m < 5; m++) {
                                        if(adjmatrix[l][m] && m != k) {
                                            for(int n = 0; n < 5; n++) {
                                                if(adjmatrix[m][n] && n != l) {
                                                    for(int o = 0; o < 5; o++) {
                                                        if(adjmatrix[n][o] && o != m) {
                                                            for(int p = 0; p < 5; p++) {
                                                                if(adjmatrix[o][p] && p != n) {
                                                                    for(int q = 0; q < 5; q++) {
                                                                        if(adjmatrix[p][q] && q != o && q != 3) {
                                                                            boolean[][] compar = new boolean[5][5];
                                                                            compar[i][j] = true;
                                                                            compar[j][i] = true;
                                                                            compar[j][k] = true;
                                                                            compar[k][j] = true;
                                                                            compar[k][l] = true;
                                                                            compar[l][k] = true;
                                                                            compar[l][m] = true;
                                                                            compar[m][l] = true;
                                                                            compar[m][n] = true;
                                                                            compar[n][m] = true;
                                                                            compar[n][o] = true;
                                                                            compar[o][n] = true;
                                                                            compar[o][p] = true;
                                                                            compar[p][o] = true;
                                                                            compar[p][q] = true;
                                                                            compar[q][p] = true;
                                                                            boolean check = true;
                                                                            for(int r = 0; r < 5; r++) {
                                                                                if(!Arrays.equals(adjmatrix[r], compar[r])) {
                                                                                    check = false;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if(check) System.out.printf("%d%d%d%d%d%d%d%d%d\n",
                                                                                    (i+1), (j+1), (k+1), (l+1), (m+1), (n+1), (o+1), (p+1), (q+1));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}