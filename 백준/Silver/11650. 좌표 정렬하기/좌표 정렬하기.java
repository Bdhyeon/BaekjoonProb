import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[][] spot = new int[n][2];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			spot[i][0] = Integer.parseInt(st.nextToken());
			spot[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(spot, (s1, s2) ->{
			if(s1[0] == s2[0]) {
				return s1[1]-s2[1];
			}else {
				return s1[0]-s2[0];
			}
		});
		
		for(int[] data : spot) {
			bw.write(String.valueOf(data[0])+" "+String.valueOf(data[1]) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}// end main()
}