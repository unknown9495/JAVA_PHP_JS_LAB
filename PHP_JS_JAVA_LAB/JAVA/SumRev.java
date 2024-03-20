import java.util.Scanner;

public class SumRev {

    int temp  = 0 , rev , sum  = 0;

    void sum(int num){
        while(num>0){
        temp = num%10;
        sum = sum+temp;
        num = num/10;
        }  
        System.out.println("The Sum of Digits is:"+sum);

    }


    void reverse(int num){
        while(num>0){
        temp = num%10;
        rev   = rev*10+temp;
        num = num/10;
        }
        System.out.println("The reverse is :"+rev);
    }

    public static void main(String[] args) {
        int num  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        num = sc.nextInt();
        sc.close();
        SumRev obj = new SumRev();
        obj.sum(num);
        obj.reverse(num);


    }

}
