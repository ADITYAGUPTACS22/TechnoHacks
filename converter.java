
// it converts a binary number to decimal number

import java.util.*;
public class converter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a binary number to find a decimal number :");
        long n=sc.nextLong();
        long ans=0L;
        long mul=1L;
        while(n!=0) {
            long rem= n%10;
            if(rem==1) {
                ans=ans+mul ;
            }
            mul*=2;
            n/=10;
        }
        System.out.print("decimal number is : ");
        System.out.println(ans);
    }
}
