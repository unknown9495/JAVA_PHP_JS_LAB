import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp1 , temp2 , num1 , num2 , hcf , lcm , temp;
        System.out.println("Enter first number");
        num1 = sc.nextInt();
        System.out.println("Enter second number");
        num2 = sc.nextInt();
        temp1 = num1;
        temp2 = num2;
        while(temp2!=0){
            temp = temp2;
            temp2 = temp1%2;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1*num2)/hcf;
        System.out.println("HCF of input no:"+hcf);
        System.out.println("LCM of input no:"+lcm);

    
        
   
    }
    
}
