import java.util.Scanner;

public class MergeArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first Array");;
        int size1 = sc.nextInt();
        int []arr1 = new int[size1];
        System.out.println("Enter the Elements of aray1");
        for(int i = 0 ;i<size1 ; i++){
            arr1[i] = sc.nextInt();
            
        }
        System.out.println("Enter the size of Second array");
        int size2 = sc.nextInt();
        int []arr2 = new int[size2];
        System.out.println("Enter array2 Elements");
        for(int i = 0; i<size2 ; i++){
            arr2[i] = sc.nextInt();

        }
        sc.close();
        int arr3[] = new int[size1 +size2];

        for(int i = 0 ; i<size1 ; i++){
            arr3[i] = arr1[i];
        }

        for(int i = 0 ; i<size2 ; i++ ){
            arr3[size1 + i] = arr2[i];
        }

        System.out.println("The Merged Array is ");

        for(int i = 0 ; i<size1+size2 ; i++){
            System.out.println(arr3[i]+"\t");
        }
        System.out.println();

        
    }
}