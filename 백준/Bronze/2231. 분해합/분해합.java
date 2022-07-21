import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int min = 1000001;
		
		for(int i=0; i<n; i++) {
			int num = i;
			int sum = num;
			do {
				sum += num % 10;
				num = num / 10;
			}while(num>0);
			if(sum==n) {
				min = min < i ? min : i;
			}
		}
		
		min = min == 1000001 ? 0 : min;
		bw.write(String.valueOf(min));
		bw.flush();
		br.close();
	}// end main()
}