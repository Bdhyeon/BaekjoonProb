import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        
        int h = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        
        if(m>=45){
            m = m - 45;
        }else{
            h = h == 0 ? 23 : h - 1;
            m = m + 15;
        }
        
        System.out.printf("%d %d", h, m);
    }
}