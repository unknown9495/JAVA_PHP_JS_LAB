import java.util.Scanner;

class volume{

    double volume(double s){
        return  s*s*s;
    }

    double volume(double l , double b , double h){
        return l*b*h;
    }

    double volume(double r , double h){
        return Math.PI *r*r*h;
    }
}





public class FunctionOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        volume v = new volume();
        System.out.println("Enter side length of cube");
        double s = sc.nextInt();
        System.out.println("Enter the length , breadh , height ");
        double l = sc.nextInt();
        double b = sc.nextInt();
        double h = sc.nextInt();
        System.out.println("Enter the rad and height of cylinder");
        double r = sc.nextInt();
        double h2 = sc.nextInt();

        System.out.println("Volume of Cube:"+v.volume(s));
        System.out.println("Volume of Cube:"+v.volume(l,b,h));
        System.out.println("Volume of Cube:"+v.volume(r , h2));




        
    }
}
