import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int num = 0;
        
        if(x>0){
            num = y > 0 ? 1 : 4;
        }else{
            num = y > 0 ? 2 : 3;
        }
        
        System.out.print(num);
    }
}