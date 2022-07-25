import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String number = br.readLine();
		int[] arr = new int[number.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = number.charAt(i) - 48;
		}
		
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--) {
			bw.write(String.valueOf(arr[i]));
		}
		
		bw.flush();
		br.close();
		bw.close();
	}// end main()
}