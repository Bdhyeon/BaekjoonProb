import java.io.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		long avg = 0;
		int mid = 0;
		int[] mod = new int[2];

		// 배열에 값 삽입 + 산술평균
		double sum = 0;
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			sum += num;
			arr[i] = num;
		}
		avg = sum < 0 ? Math.round((sum * -1) / n) * -1 : Math.round(sum/n);

		// 정렬
		Arrays.sort(arr);

		// 중앙값
		mid = arr[(n / 2)];

		// 최빈값
		int cnt = 0;
		boolean chk = false;
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {
				cnt++;
				if (mod[0] < cnt) {
					mod[0] = cnt;
					mod[1] = arr[i];
					chk = false;
				} else if (mod[0] == cnt && chk == false) {
					mod[1] = arr[i];
					chk = true;
				}
			} else {
				cnt = 0;
			}
		}
		mod[1] = mod[0] == 0 ? n == 1 ? arr[0] : arr[1] : mod[1];

		sb.append(avg).append("\n");
		sb.append(mid).append("\n");
		sb.append(mod[1]).append("\n");
		sb.append(arr[n - 1] - arr[0]);

		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}// end main()
}