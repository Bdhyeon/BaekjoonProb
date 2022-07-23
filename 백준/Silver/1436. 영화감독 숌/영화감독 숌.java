import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0; i<10000000; i++) {
			cnt = String.valueOf(i).contains("666") ? cnt + 1 : cnt;
			if(cnt==n) {
				bw.write(String.valueOf(i));
				break;
			}
		}
		
		bw.flush();
		br.close();
	}// end main()
}