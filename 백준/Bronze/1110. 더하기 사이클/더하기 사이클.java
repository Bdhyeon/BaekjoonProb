import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int ori = n;
        int cnt = 0;
        
        do{
            cnt++;
            if(n < 10)
                n = (n * 10) + n;
            else{
                int a = n / 10;
                int b = n % 10;
                int c = a + b;
                
                n = c < 10 ? (b * 10) + c : (b * 10) + (c % 10);
            }
        }while(n != ori);
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        br.close();
        bw.close();
    }
}