////import java.util.*;
////
////public class UMain10226 {
////    public static void main(String[] args) {
////        Scanner rennacS = new Scanner(System.in);
////        
////        int tC = rennacS.nextInt();
////        rennacS.nextLine();
////        rennacS.nextLine();
////        
////        for(int z = 0; z < tC; z++) {
////            if(z != 0) System.out.println();
////            TreeMap<String, Integer> m = new TreeMap<String, Integer>();
////            ArrayList<Tree> trees = new ArrayList<Tree>();
////            double total = 0;
////            
////            while(rennacS.hasNextLine()) {
////                String inp = rennacS.nextLine();
////                if(inp.isEmpty()) break;
////                
////                total++;
////                if(m.containsKey(inp)) trees.get(m.get(inp)).num++;
////                else {
////                    m.put(inp, trees.size());
////                    trees.add(new Tree(inp));
////                }
////            }
////            Collections.sort(trees);
////            for(int i = 0; i < trees.size(); i++) {
////                Tree tree = trees.get(i);
////                System.out.printf(tree.name + " %.4f\n", (tree.num*100/total));
////            }
////        }
////    }
////    public static class Tree implements Comparable<Tree> {
////        String name;
////        int num;
////        
////        public Tree(String name) {
////            this.name = name;
////            num = 1;
////        }
////
////        @Override
////        public int compareTo(Tree o) {
////            return name.toLowerCase().compareTo(o.name.toLowerCase());
////        }
////    }
////}
//import java.util.*;
//
//public class UMain10226 {
//    public static void main(String[] args) {
//        Scanner rennacS = new Scanner(System.in);
//        
//        int tC = rennacS.nextInt();
//        rennacS.nextLine();
//        rennacS.nextLine();
//        
//        for(int z = 0; z < tC; z++) {
//            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
//            ArrayList<Tree> names = new ArrayList<Tree>();
//            int total = 0;
//            
//            while(rennacS.hasNextLine()) {
//                String g = rennacS.nextLine();
//                if(g.isEmpty()) break;
//                
//                total++;
//                if(map.containsKey(g)) map.put(g, map.get(g) + 1);
//                else {
//                    names.add(new Tree(g));
//                    map.put(g, 1);
//                }
//            }
//            Collections.sort(names);
//            if(z != 0) System.out.println("");
//            
//            for(int i = 0; i < names.size(); i++) System.out.printf(names.get(i).name + " %.4f\n",(map.get(names.get(i).name)*100.0/total));
//        }
//    }
//    public static class Tree implements Comparable<Tree> {
//        String name;
//        
//        public Tree(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public int compareTo(Tree t) {
//            return name.toLowerCase().compareTo(t.name.toLowerCase());
//        }
//    }
//}

import java.util.*;

public class Main10226 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        int tC = rennacS.nextInt();
        if(rennacS.hasNextLine()) rennacS.nextLine();
        if(rennacS.hasNextLine()) rennacS.nextLine();
        
        for(int z = 0; z < tC; z++) {
            if(z != 0) System.out.println("");
            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            int total = 0;
            
            while(rennacS.hasNextLine()) {
                String g = rennacS.nextLine();
                if(g.isEmpty()) break;
                
                if(map.containsKey(g)) map.put(g, map.get(g) + 1);
                else map.put(g, 1);
                total++;
            }

            for(Map.Entry en : map.entrySet()) {
                System.out.printf("%s %.4f\n", en.getKey(), ((int)en.getValue())*100.0/total);
            }
            
        }
    }
}