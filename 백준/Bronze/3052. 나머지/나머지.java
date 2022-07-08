import java.io.*;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<10; i++) {
        	int num = Integer.parseInt(br.readLine());
        	set.add(num % 42);
        }
        
        bw.write(String.valueOf(set.size()));
        
        bw.flush();
        br.close();
        bw.close();
    }
}