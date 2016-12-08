import java.util.*;

public class Main12250 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        
        for(int z = 1; true; z++) {
            String g = rennacS.nextLine();
            if(g.equals("#")) break;
            
            System.out.print("Case " + z + ": ");
            switch (g) {
                case "HELLO":
                    System.out.println("ENGLISH");
                    break;
                case "HOLA":
                    System.out.println("SPANISH");
                    break;
                case "HALLO":
                    System.out.println("GERMAN");
                    break;
                case "BONJOUR":
                    System.out.println("FRENCH");
                    break;
                case "CIAO":
                    System.out.println("ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("RUSSIAN");
                    break;
                default:
                    System.out.println("UNKNOWN");
                    break;
            }
        }
    }
}
