import java.util.*;
public class probelm7 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ReverseInteger(n));
        sc.close();
    }
    public static int ReverseInteger(int n){
        int rev=0;
        while(n!=0){
            int ld=n%10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE && ld>7)){
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE && ld<-8)){
                return 0;
            }
            rev=rev*10+ld;
            n/=10;
        }
        return rev;
    }
}
