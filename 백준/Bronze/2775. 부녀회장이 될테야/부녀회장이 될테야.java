import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = 0;

		int[][] arr = new int[15][14];
		for (int i = 0; i < 15; i++) {
			arr[i][0] = 1;
		}

		for (int i = 0; i < 14; i++) {
			cnt++;
			arr[0][i] = cnt;
		}

		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 14; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
			}
		}

		int t = Integer.parseInt(br.readLine());
		int k = 0;
		int n = 0;
		for (int i = 0; i < t; i++) {
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			bw.write(arr[k][n - 1]+"\n");
		}

		bw.flush();
	}// end main()
}