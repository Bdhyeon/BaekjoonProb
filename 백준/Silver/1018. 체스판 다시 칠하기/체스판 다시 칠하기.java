import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[][] board = new boolean[n][m];
		for(int i=0; i<n; i++) {
			char[] carr = br.readLine().toCharArray();			
			for(int j=0; j<m; j++) 
				board[i][j] = carr[j] == 'B' ? true : false;
		}
		
		int cnt = 0;
		int min = 99999;
		boolean x;
		for(int i=0; i<n-7; i++) {
			for(int j=0; j<m-7; j++) {
				x = board[i][j];
				for(int a=i; a<i+8; a++) {
					for(int b=j; b<j+8; b++) {
						if(board[a][b]!=x)
							cnt++;
						x = b == j + 7 ? x : !x;
					}
				}
				min = min < Math.min(cnt, 64-cnt) ? min : Math.min(cnt, 64-cnt);
				cnt = 0;
			}
		}
		
		bw.write(String.valueOf(min));
		bw.flush();
		br.close();
	}// end main()
}