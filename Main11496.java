//ProgVar Tryouts Problem
//from netbook

import java.util.Scanner;

public class Main11496 {
    public static void main(String[] args) {
        Scanner rennacS = new Scanner(System.in);
        int input = 1;
        String output = "";
        
        while(true) {
            input = Integer.parseInt(rennacS.nextLine());
            if(input==0) break;
            
            String workwith = rennacS.nextLine();
            String[] yarra = new String[input];
            int[] transfer = new int[input + 1];
            boolean[] updown = new boolean[input];
            int counter = 0;
            int slot = 0;
            int numoutput = 0;
            
            for(int i = 0; i < input; i++) yarra[i] = "";
            
            for(int i=0; i < workwith.length(); i++) {
                String temp = workwith.substring(i, i + 1);
                if(!temp.equals(" ")) yarra[slot] += temp;
                else slot++;
            }
            for(int i = 0; i < input; i++) transfer[i] = Integer.parseInt(yarra[i]);
            transfer[input] = transfer[0];

            for(int i = 0; i < input; i++) {
                if(transfer[i] < transfer[i + 1]) updown[i] = true; 
                else updown[i] = false; 
            }
            
            for(int i = 0; i < input - 1; i++) if(updown[i] != updown[i + 1]) numoutput++;
            if(updown[0] != updown[input - 1]) numoutput++;

            output += (numoutput) + "\n";
        }
        System.out.println(output.substring(0, output.length() - 1));
    }
}
