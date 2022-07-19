import java.io.*;

public class Main {
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static StringBuilder sb = new StringBuilder();
	public static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		hanoi(n, 1, 2, 3);
		
		sb.insert(0, cnt + "\n");
		bw.write(sb.toString());
		bw.flush();
		br.close();
	}// end main()

	public static void hanoi(int n, int start, int mid, int end) {
		if (n == 1) {
			cnt++;
			sb.append(start + " " + end + "\n");
		} else {
			hanoi(n - 1, start, end, mid);
			cnt++;
			sb.append(start + " " + end + "\n");
			hanoi(n - 1, mid, start, end);
		}

	}// end hanoi()
}