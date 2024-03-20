import java.util.Scanner;

public class Multithreading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Limit:");
        int lim = sc.nextInt();
        Thread o = new Thread(()->{
            for(int i = 1 ; i<=lim ; i = i+2){
                System.out.println("Odd"+i);
            }
        });
        Thread e = new Thread(()->{
            for(int i = 2 ; i<=lim ; i = i+2){
                System.out.println("even"+i);
            }
        });
        o.start();
        e.start();
    }
    
}
