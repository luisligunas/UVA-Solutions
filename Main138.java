//import java.io.*;
//
//public class Main {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//    
//    public static void main(String[] args) throws IOException {
//        long[] yarra = new long[100000000];
//        //x6 - 1
//        //x6 - 6
//        //x6 - 35
//        //x6 - 204
//        
//        for(int i = 1; i < yarra.length; i++) yarra[i] = yarra[i-1] + new Long(i);
//        int count = 0;
//        for(int i = 1; i < yarra.length; i++) {
//            for(int j = i + 1; j < yarra.length; j++) {
//                if(yarra[i - 1] == yarra[j] - yarra[i]) {
//                    pw.println(i + " " + j);
//                    System.out.println("BOOM: " + i + " " + j);
//                    count++;
//                    if(count == 10) break;
//                }
//                else if(yarra[j] - yarra[i] > yarra[i-1]) break;
//            }
//            if(count == 10) break;
//        }
//        
//        
//        pw.close();
//    }
//}

import java.io.*;

public class Main138 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        long[] house = new long[11];
        long[] end = new long[11];
        String[] spaces = new String[10];
        
        house[0] = 1;
        house[1] = 6;
        
        end[1] = 8;
        end[2] = 49;
        
        spaces[1] = " ";
        
        for(int i = 2; i < house.length; i++) house[i] = house[i-1]*new Long(6) - house[i-2];
        for(int i = 3; i < end.length; i++) end[i] = house[i] + house[i-1] + end[i-1];
        for(int i = 2; i < spaces.length; i++) spaces[i] = spaces[i-1] + " ";
        
        for(int i = 1; i <= 10; i++) {
            pw.print(spaces[10 - Long.toString(house[i]).length()] + house[i]);
            pw.println(spaces[10 - Long.toString(end[i]).length()] + end[i]);
        }
        
        pw.close();
    }
}