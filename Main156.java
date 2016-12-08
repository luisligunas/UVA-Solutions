import java.util.*;

public class Main156 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        TreeMap<String, String> unmatched = new TreeMap<String, String>();
        TreeMap<String, Boolean> matched = new TreeMap<String, Boolean>();
        
        while(rennacS.hasNext()) {
            String word = rennacS.next();
            if(word.equals("#")) break;
            
            char[] yarra = word.toLowerCase().toCharArray();
            Arrays.sort(yarra);
            String sort = Arrays.toString(yarra);
            
            if(matched.containsKey(sort)) continue;
            if(unmatched.containsKey(sort)) {
                matched.put(sort, false);
                unmatched.remove(sort);
            }
            else unmatched.put(sort, word);
        }
        ArrayList<String> words = new ArrayList<String>();
        for (Map.Entry entry : unmatched.entrySet()) {
            words.add(entry.getValue().toString());
        }
        Collections.sort(words);
        for(int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}