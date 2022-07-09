import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		int sum = 0;
		
		for(char x : arr) {
			sum += Character.getNumericValue(x);
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
	}// end main
}// end class