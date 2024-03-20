class CommandArithematic{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("SUM:"+(a+b));
        System.out.println("DIFFERENCE:"+(a-b));
        System.out.println("PRODUCT:"+(a*b));
        System.out.println("QUOTIENT:"+(a/b));
        System.out.println("REMAINDER:"+(a%b));


    }
}