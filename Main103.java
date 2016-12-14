import java.io.*;
import java.util.*;

public class Main103 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int[][] yarra;
    static int max, dimensions, boxes;
    static String best;
    static ArrayList<Node> nodes;
    
    public static void main(String[] args) throws IOException {
        String s;
        String[] split;
        nodes = new ArrayList<Node>();
        
        while((s = br.readLine()) != null) {
            max = -1;
            best = null;
            split = s.split(" ");
            boxes = Integer.parseInt(split[0]);
            dimensions = Integer.parseInt(split[1]);
            
            yarra = new int[boxes][dimensions];
            
            for(int i = 0; i < boxes; i++) {
                split = br.readLine().split(" ");
                for(int j = 0; j < dimensions; j++) {
                    yarra[i][j] = Integer.parseInt(split[j]);
                }
                Arrays.sort(yarra[i]);
            }
            nodes.clear();
            for(int i = 0; i < boxes; i++) {
                nodes.add(new Node());
            }
            
            for(int i = 0; i < boxes; i++) {
                for(int j = 0; j < boxes; j++) {
                    if(i == j) continue;
                    
                    boolean rekt = false;
                    for(int k = 0; k < dimensions; k++) {
                        if(yarra[i][k] < yarra[j][k]) continue;
                        rekt = true;
                        break;
                    }
                    if(!rekt) nodes.get(i).add(j);
                }
            }
            
            for(int i = 0; i < boxes; i++) {
                visited = new int[boxes];
                thing(i, (char)(i + 'A') + "");
            }
            
            pw.println(best.length());
            for(int i = 0; i < best.length(); i++) {
                int num = best.charAt(i) - 'A';
                if(i != 0) pw.print(" ");
                pw.print(num + 1);
            }
            pw.println();
        }
        pw.close();
    }
    static int[] visited;
    public static void thing(int start, String string) {
        if(visited[start] >= string.length()) return;
        
        visited[start] = string.length();
        if(string.length() > max) {
            max = string.length();
            best = string;
        }
        ArrayList<Integer> edges = nodes.get(start).edge;
        
        for(int i = 0 ; i < edges.size(); i++) {
            thing(edges.get(i), string + (char)(edges.get(i) + 'A'));
        }
    }
    public static class Node {
        ArrayList<Integer> edge = new ArrayList<Integer>();
        public void add(int n) {
            edge.add(n);
        }
    }
}