import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] cnt = new int[10000];
		int n = 0;
		
		for(int i=1; i<=10000; i++) {
			n = i;
			int sum = n;
			while(n>0) {
				sum += n%10;
				n = n/10;
			}
			
			if(sum<=10000) {
				cnt[sum-1] ++;
			}
		}
		
		for(int i=0; i<10000; i++) {
			if(cnt[i]==0) {
				bw.write((i+1)+"\n");
			}
		}
		
		bw.flush();
		
	}//end main
}//end class