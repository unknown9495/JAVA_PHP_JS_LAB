import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of a Triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a+b>c) && (b+c>a) && (c+a)>b){
            System.out.println("Triangle type :"+ CheckTriangle(a, b, c));
            double s  = (a+b+c)/2;
            double area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
            System.out.println("Area is "+area);

        }
        else{
            System.out.println("Not a Triangle");
        }


    }

    static String CheckTriangle(int a , int b , int c){
        if(a==b && b==c && a==c){
            return "Equilateral Triangle";
        }
        else if(a==b || b==c ||c==a){
            return "isosceles triangle";
        }
        else{
            return "scalene triangle";
        }
    }
}
