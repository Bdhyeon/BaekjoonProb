import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
        String num = String.valueOf(x);
        int[] cnt = new int[10];
        
        for(int i=0; i<num.length(); i++) {
        	cnt[Character.getNumericValue(num.charAt(i))] += 1;
        }
        
        for(int i : cnt) {
        	bw.write(i + "\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}