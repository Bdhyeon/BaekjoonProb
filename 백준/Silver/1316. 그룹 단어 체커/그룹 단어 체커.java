import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=0; i<n; i++) {
			if(isGroupWord(br.readLine()))
				cnt++;
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
	}// end main()

	public static boolean isGroupWord(String str) {
		int[] arr = new int[26];
		int cnt = 1;

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 97]++;
			if(i != str.length() - 1) {
				cnt = str.charAt(i) != str.charAt(i + 1) ? cnt + 1 : cnt;
			}
		}

		for (int x : arr) {
			x = x == 0 ? 0 : 1;
			cnt -= x;
		}

		return cnt == 0;
	}//end isGroupWord()
}