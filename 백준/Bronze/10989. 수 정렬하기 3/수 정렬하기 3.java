import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] cnt = new int[10001];
		
		for(int i=0; i<n; i++) {
			cnt[Integer.parseInt(br.readLine())]++; //카운팅 배열 1씩 증가
		}
		
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i]>0) {
				do {
					sb.append(i).append("\n");
					cnt[i]--;
				}while(cnt[i]>0);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}// end main()
}