import java.util.*;

public class Main673 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);

        int tC = rennacS.nextInt();
        rennacS.nextLine();
        for(int z = 0; z < tC; z++) {
            String g = rennacS.nextLine();

            ArrayList<Boolean> yarra = new ArrayList<Boolean>();

            boolean getRekt = false;
            for(int i = 0; i < g.length(); i++) {
                /*
                for(int j = 0; j < yarra.size(); j++) {
                        System.out.print(yarra.get(j) + " ");
                }
                System.out.println();
                */
                char mander = g.charAt(i);

                if(mander == '(') yarra.add(true);
                else if(mander == '[') yarra.add(false);
                else if(mander == ')') {
                    if(yarra.isEmpty()) {
                        getRekt = true;
                        break;
                    }
                    if(yarra.get(yarra.size() - 1) == false) {
                        getRekt = true;
                        break;
                    }
                    else yarra.remove(yarra.size() - 1);
                }
                else {
                    if(yarra.isEmpty()) {
                        getRekt = true;
                        break;
                    }
                    if(yarra.get(yarra.size() - 1) == true) {
                        getRekt = true;
                        break;
                    }
                    else yarra.remove(yarra.size() - 1);
                }
            }
            if(g.isEmpty()) System.out.println("Yes");
            else if(getRekt || !yarra.isEmpty()) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}