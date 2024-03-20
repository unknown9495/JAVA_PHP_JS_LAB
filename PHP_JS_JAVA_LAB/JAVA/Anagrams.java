import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        String str1 , str2;
        int len1 , len  ,len2  , flag  =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String :");
        str1 = sc.nextLine();
        System.out.println("Enter second String:");
        str2 = sc.nextLine();
        len1 = str1.length();
        len2 = str2.length();
        if(len1 == len2){
            len = len1;
            for(int i = 0 ; i<len ; i++){
                flag = 0;
                for(int j = 0 ; j<len ; j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        flag =1;
                        break;
                    }
                }
                if(flag == 0){
                    break;
                }
            }
            if(flag == 0){
                System.out.println("Not anagram");
            }
            else{
                System.out.println("anagram");
            }


        }
        else{
            System.out.println("Both strings much have same no of Characters");

        }
    }
}
