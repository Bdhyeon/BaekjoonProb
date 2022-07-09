import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] word = br.readLine().toUpperCase().toCharArray();
        int[] cnt = new int[26];
        
        for(int i=0; i<word.length; i++) {
        	cnt[word[i]-65]++;
        }
        
        int max = 0;
        for(int i=0; i<26; i++) {
        	max = max < cnt[i] ? cnt[i] : max;
        }
        
        int chk = 0;
        char res = ' ';
        for(int i=0; i<26; i++) {
        	if(max==cnt[i]) {
        		chk++;
        		res = (char)(i + 65);
        	}
        }
        
        bw.write(chk == 1 ? res : '?');
        bw.flush();
    }
}