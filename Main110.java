import java.io.*;

public class Main110 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringBuilder[] outputs = new StringBuilder[8];
    static StringBuilder build;
    static int num, factorial, counter;
    
    public static void main(String[] args) throws IOException {
        int tC = Integer.parseInt(br.readLine().split("\\s+")[0]);
        br.readLine();
        
        for(int z = 0; z < tC; z++) {
            if(z != 0) {
                br.readLine();
                pw.println();
            }
            num = Integer.parseInt(br.readLine().split("\\s+")[0]);
            
            printAnswer(num);
        }
        
        pw.close();
    }
    public static void printAnswer(int num) {
        if(outputs[num - 1] == null) {
            factorial = 1;
            for(int i = 2; i <= num; i++) factorial *= i;
            counter = 0;
            recurse("");
            build.append("\nend.");
            outputs[num - 1] = build;
        }
        
        pw.println(outputs[num - 1]);
    }
    public static void recurse(String seq) {
        if(seq.isEmpty()) {
            build = new StringBuilder("program sort(input,output);\nvar\n");
            StringBuilder letters = new StringBuilder();
            for(int i = 0; i < num; i++) {
                if(i != 0) letters.append(",");
                letters.append((char)('a' + i));
            }
            build.append(letters).append(" : integer;\nbegin\n  readln(").append(letters).append(");");
            
            recurse("a");
            return;
        }
        build.append("\n");
        
        if(seq.length() == num) {
            for(int i = 0; i < seq.length(); i++) build.append("  ");
            counter++;
            build.append("writeln(");
            
            for(int i = 0; i < seq.length(); i++) {
                if(i != 0) build.append(",");
                build.append(seq.charAt(i));
            }
            build.append(")");
            if(counter < factorial) build.append("\n");
            return;
        }
        
        char newChar = (char)('a' + seq.length());
        for(int i = 0; i <= seq.length(); i++) {
            for(int j = 0; j < seq.length(); j++) build.append("  ");
            if(i < seq.length()) {
                if(i > 0) build.append("else ");
                build.append("if ").append(seq.charAt(seq.length() - i - 1)).append(" < ").append(newChar).append(" then");
            }
            else build.append("else");
            
            StringBuilder temp = new StringBuilder(seq);
            temp.insert(temp.length() - i, newChar);
            
            recurse(temp.toString());
        }
    }
}
