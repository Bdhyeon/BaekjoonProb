import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			char[] arr = br.readLine().toCharArray();
			
			int score = 0;
			int sum = 0;
			
			for(char ox : arr) {
				score = ox == 'O' ? score + 1 : 0;
				sum += score;
			}
			
			bw.write(String.valueOf(sum + "\n"));
		}

		bw.flush();
		br.close();
		bw.close();
	}
}