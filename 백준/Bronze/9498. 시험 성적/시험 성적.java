import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        char ch = ' ';
        
        switch(score/10){
            case 10:
            case 9: ch = 'A'; break;
            case 8: ch = 'B'; break;
            case 7: ch = 'C'; break;
            case 6: ch = 'D'; break;
            default: ch = 'F';
        }
        
        System.out.print(ch);
        
    }
}