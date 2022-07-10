import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write(String.valueOf(howMany(br.readLine())));
		bw.flush();
	}// end main()

	public static int howMany(String str) {
		String[] cro = { "dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z=" };

		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		for(int i=0; i<cro.length; i++) {
			if(str.contains(cro[i]))
				str = str.replace(cro[i], "/");
		}
		
		return str.length();
	}//end howMany()
}