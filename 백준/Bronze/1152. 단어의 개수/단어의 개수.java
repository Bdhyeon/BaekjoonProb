import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arr = br.readLine().split(" ");
        int length = arr.length;
        
        if(length != 0) {
        	length = arr[0].isBlank() ? length - 1 : length;
        }
        
        bw.write(String.valueOf(length));
        bw.flush();
    }
}