import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i , j , temp , n=10;
        int arr[] = new int [10];
        System.out.println("Enter 10 Elements");;
        for(i = 0 ; i<10 ; i++){
            arr[i] = sc.nextInt();
        }
        for(i = 0 ; i<10 ; i++){
            for (j = i+1 ; j<10 ; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The Smallest Element = "+arr[0]);
        System.out.println("The largest Element = "+arr[n-1]);
        System.out.println("The largest Element = "+arr[n-2]);


    
        
    }
    
}
