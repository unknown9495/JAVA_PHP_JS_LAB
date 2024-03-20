import java.util.Scanner;


class MinBalExpection extends Exception {
    MinBalExpection(String s){
        super(s);
    }
    
}

class Amount{
    double balance = 100;
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited Rs:"+amount);
    }
    void withdraw(double amount)throws MinBalExpection{
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawed rs "+amount);
        }
        else{
            throw new MinBalExpection("insufficient balance");
        }
    }
}




class Bank{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Amount a = new Amount();
        System.out.println("Enter amount to deposit :");
        int d = s.nextInt();
        System.out.println("Enetr amount to withdraw");
        int w = s.nextInt();
        a.deposit(d);
        System.out.println("Balance = "+a.balance);
        try{
            a.withdraw(w);
        }
        catch(MinBalExpection e){
            System.out.println("Error"+e);
        }
        System.out.println("Final balance = "+a.balance);
        
    }
}
