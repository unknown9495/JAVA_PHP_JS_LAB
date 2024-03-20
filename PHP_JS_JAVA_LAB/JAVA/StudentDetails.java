import java.util.Scanner;
class student{
    int r;
    String name , address;
    void read(Scanner sc){
        System.out.println("Enter student details");;
        System.out.println("Enter roll no:");
        r = sc.nextInt();
        System.out.println("Enter Name:");
        name = sc.next();
        System.out.println("Enter Address:");
        address = sc.next();
    
    }
    void display(){
        System.out.println("Roll No:"+r+"\n Namr:"+name+"\n"+"Address :"+address);
    }
}

class Mark extends student{
    double m1 , m2 , m3 , m4 , m5;
    
    void read(Scanner sc){
        super.read(sc);
        System.out.println("Enter marks:");
        m1 = sc.nextDouble();
        m2 = sc.nextDouble();
        m3 = sc.nextDouble();
        m4 = sc.nextDouble();
        m5 = sc.nextDouble();
        // sc.nextLine();
    }

    void calc(){
        double t = m1+m2+m3+m4+m5;
        double avg = t/5;
        System.out.println("Total marks:"+t);
        System.out.println("Average marks:"+avg);

    }

}




public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Mark m = new Mark();
        m.read(sc);
        m.display();
        m.calc();
        sc.close();
    }
    
}
