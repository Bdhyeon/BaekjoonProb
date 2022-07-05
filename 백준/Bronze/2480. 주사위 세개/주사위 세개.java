import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int fst = sc.nextInt();
        int snd = sc.nextInt();
        int trd = sc.nextInt();
        
        int money = 0;
        
        if(fst == snd && snd == trd){
            money = 10000 + fst * 1000;
        }else if(fst == snd || snd == trd){
            money = 1000 + snd * 100;
        }else if(trd == fst){
            money = 1000 + trd * 100;
        }else{
            if(fst > snd && fst > trd)
                money = fst * 100;
            else if(snd > trd)
                money = snd * 100;
            else
                money = trd * 100;
        }
        
        System.out.print(money);
    }
}