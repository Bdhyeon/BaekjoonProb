import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		
		int start = 1;
		int end = 1;
		int cnt = 1;
		
		while(x!=1) {
			start = end + 1;
			end = start + cnt;
			cnt++;
			if(x >= start && x <= end)
				break;
		}
		
		int za = cnt % 2 == 0 ? cnt - (end - x) : cnt - (x - start);
		int mo = cnt % 2 == 0 ? cnt - (x - start) : cnt - (end - x);
		bw.write(za + "/" + mo);
		bw.flush();
	}// end main()
}