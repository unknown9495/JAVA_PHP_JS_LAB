import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str1 , str2;
        System.out.println("Enter a string");
        str1  =  sc.nextLine();
        str2 = str1.replaceAll("[aeiouAEIOU]", "_");
        System.out.println("All vowels removed successfuly the new String is :"+str2);
    }
}
