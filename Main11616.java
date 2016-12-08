import java.io.*;

public class Main11616 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void main(String[] args) throws IOException {
        String num;
        
        while((num = br.readLine()) != null && !num.isEmpty()) {
            if(num.charAt(0) >= '0' && num.charAt(0) <= '9') {
                for(int i = 0; i < num.length(); i++) {
                    pw.print(romanToArabic(num.charAt(i), num.length() - i - 1));
                }
                pw.println();
            }
            else pw.println(arabicToRoman(num));
        }
        pw.close();
    }
    public static int arabicToRoman(String num) {
        int out = 0;
        for(int i = 0; i < num.length(); i++) {
            switch (num.charAt(i)) {
                case 'I':
                    if(i == num.length() - 1) out++;
                    else if(num.charAt(i + 1) == 'V') {
                        out += 4;
                        i++;
                    }
                    else if(num.charAt(i + 1) == 'X') {
                        out += 9;
                        i++;
                    }
                    else out++;
                    break;
                case 'V':
                    out += 5;
                    break;
                case 'X':
                    if(i == num.length() - 1) out += 10;
                    else if(num.charAt(i + 1) == 'L') {
                        out += 40;
                        i++;
                    }
                    else if(num.charAt(i + 1) == 'C') {
                        out += 90;
                        i++;
                    }
                    else out += 10;
                    break;
                case 'L':
                    out += 50;
                    break;
                case 'C':
                    if(i == num.length() - 1) out += 100;
                    else if(num.charAt(i + 1) == 'D') {
                        out += 400;
                        i++;
                    }
                    else if(num.charAt(i + 1) == 'M') {
                        out += 900;
                        i++;
                    }
                    else out += 100;
                    break;
                case 'D':
                    out += 500;
                    break;
                default:
                    out += 1000;
                    break;
            }
        }
        return out;
    }
    public static String romanToArabic(char digit, int zeros) {
        digit -= '0';
        if(digit == 0) return "";
        
        switch (zeros) {
            case 0:
                switch (digit) {
                    case 1:
                        return "I";
                    case 2:
                        return "II";
                    case 3:
                        return "III";
                    case 4:
                        return "IV";
                    case 5:
                        return "V";
                    case 6:
                        return "VI";
                    case 7:
                        return "VII";
                    case 8:
                        return "VIII";
                    default:
                        break;
                }
                return "IX";
            case 1:
                switch (digit) {
                    case 1:
                        return "X";
                    case 2:
                        return "XX";
                    case 3:
                        return "XXX";
                    case 4:
                        return "XL";
                    case 5:
                        return "L";
                    case 6:
                        return "LX";
                    case 7:
                        return "LXX";
                    case 8:
                        return "LXXX";
                    default:
                        break;
                }
                return "XC";
            case 2:
                switch (digit) {
                    case 1:
                        return "C";
                    case 2:
                        return "CC";
                    case 3:
                        return "CCC";
                    case 4:
                        return "CD";
                    case 5:
                        return "D";
                    case 6:
                        return "DC";
                    case 7:
                        return "DCC";
                    case 8:
                        return "DCCC";
                    default:
                        break;
                }
                return "CM";
            default:
                if(digit == 1) return "M";
                else if(digit == 2) return "MM";
                return "MMM";
        }
    }
}