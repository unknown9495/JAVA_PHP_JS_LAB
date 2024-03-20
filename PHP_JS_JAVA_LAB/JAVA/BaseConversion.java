import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num  , index = 0;
        System.out.println("Enter an Integer:");
        num = sc.nextInt();
        int []binary = new int[40];
        int temp1 = num;
        while(temp1>0){
            binary[index] = temp1%2;
            temp1 = temp1/2;
            index++;
        }
        System.out.println("The Binary of a given Integer is:");
        for(int i = index-1 ; i>=0; i--){
            System.out.println(binary[i]);
        }
        int octal[] = new int[40];
    int temp2 = num;
    index = 0;
    while(temp2>0){
        octal[index] = temp2%8;
        temp2 = temp2/8;
        index++;
    }
    System.out.println("The Octal of a given Integer is:");
        for(int i = index-1 ; i>=0; i--){
            System.out.println(octal[i]);
        }

        int temp3 = num;
        int rem = 0;
        String hex="";
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(temp3>0){
            rem = temp3%16;
            hex = hexChars[rem]+hex;
            temp3 = temp3/16;
        }
        System.out.println("Hexadecimal of given non is "+hex);




    }
    

}
