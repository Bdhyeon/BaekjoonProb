import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
}