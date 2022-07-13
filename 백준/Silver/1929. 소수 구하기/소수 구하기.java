import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		for(int i = m; i <= n; i++) {
			boolean chk = i == 1 ? false : true;
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					chk = false;
					break;
				}
			}
			if(chk) bw.write(String.valueOf(i)+"\n");
		}

		bw.flush();
		br.close();
		bw.close();
	}// end main()
}