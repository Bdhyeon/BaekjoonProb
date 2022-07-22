import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		int[] cnt = new int[n];
		for(int i=0; i<arr.length; i++) {
			cnt[i]++;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
					cnt[j]++;
				}else if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					cnt[i]++;
				}
			}
			sb.append(cnt[i]).append(' ');
		}
		sb.deleteCharAt(sb.length()-1);
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
	}// end main()
}