import java.io.*;
import java.util.*;

public class Main112 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int LEAF = Integer.MIN_VALUE;
    
    public static void main(String[] args) throws IOException {
        String str;
        StringBuilder text = new StringBuilder();
        
        while((str = br.readLine()) != null) {
            text.setLength(0);
            boolean start = true;
            int count = 0;
            
            while(true) {
                for(int i = 0; i < str.length(); i++) {
                    if(str.charAt(i) == ' ') continue;
                    if(str.charAt(i) == '(') {
                        if(start) start = false;
                        count++;
                    }
                    else if(str.charAt(i) == ')') count--;
                    text.append(str.charAt(i));
                }
                if(count == 0 && !start) break;
                str = br.readLine();
            }
            
            int pointer = text.indexOf("(");
            if(text.length() - pointer == 2) {
                pw.println("no");
                continue;
            }
			int find = Integer.parseInt(text.substring(0, pointer));
            Node tree = null, curr = null;
            
            while(pointer < text.length()) {
                if(text.charAt(pointer) == '(') {
                    if(text.charAt(pointer + 1) != ')') {
                        StringBuilder temp = new StringBuilder();
                        pointer++;
                        while(text.charAt(pointer) != '(' && text.charAt(pointer) != ')') {
                            temp.append(text.charAt(pointer++));
                        }
                        int val = Integer.parseInt(temp.toString());
                        
                        if(curr == null) {
                            tree = new Node(val, null);
                            curr = tree;
                        }
                        else if(curr.left == null) {
                            curr.left = new Node(val, curr);
                            curr = curr.left;
                        }
                        else {
                            curr.right = new Node(val, curr);
                            curr = curr.right;
                        }
                    }
                    else {
                        if(curr.left == null) curr.left = new Node(LEAF, curr);
                        else if(curr.right == null) curr.right = new Node(LEAF, curr);
                        else curr = curr.parent;
                        pointer += 2;
                    }
                }
                else {
                    curr = curr.parent;
                    pointer++;
                }
            }
            Stack<Node> st = new Stack<Node>();
            st.push(tree);
            
            boolean found = false;
            while(!st.isEmpty()) {
                Node n = st.pop();
                
                if(isLeaf(n)) {
                    if(!isLeaf(n.parent.left) || !isLeaf(n.parent.right)) continue;
                    if(n.parent.total == find) {
                        found = true;
                        break;
                    }
                    continue;
                }
                if(n == tree) n.total = n.value;
                else n.total = n.parent.total + n.value;
                st.push(n.right);
                st.push(n.left);
            }
            if(found) pw.println("yes");
            else pw.println("no");
        }
        
        pw.close();
    }
    public static boolean isLeaf(Node n) {
        return n.value == LEAF;
    }
    public static class Node {
        Node left, right, parent;
        int value, total;
        
        public Node(int value, Node parent) {
            this.total = 0;
            this.value = value;
            this.parent = parent;
            
        }
    }
}
