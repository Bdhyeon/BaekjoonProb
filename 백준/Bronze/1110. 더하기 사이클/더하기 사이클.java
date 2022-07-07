import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int temp = n;
        int cnt = 0;
        
        do{
           cnt++;
            int sum = temp/10 + temp%10;
            temp = (temp%10)*10 + sum%10;
        }while(n != temp);
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        br.close();
        bw.close();
    }
}