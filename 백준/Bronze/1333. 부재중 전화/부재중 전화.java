import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=s.nextInt()+5;
        int d=s.nextInt();
        int num=0;
        int time=d;
        for(int i=0;i<n;i++){
            num+=l;
            for(;;){
                if(time<num-5) time+=d;
                else break;
            }
            if(num-5<=time&&time<num) break;
        }
        System.out.print(time);
    }
}