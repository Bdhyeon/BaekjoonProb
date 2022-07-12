import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			for (int j = 2; j < num; j++) {
				if (num % j == 0)
					break;
				if (j == num - 1)
					cnt++;
			}
			cnt = num == 2 ? cnt + 1 : cnt;
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
		
		br.close();
		bw.close();
	}
}