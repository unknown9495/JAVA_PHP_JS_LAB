public class CountNoOfObjects {
    static int count = 0;

    public CountNoOfObjects() {
        count++;

    }
    public static void main(String[] args) {

        

        CountNoOfObjects o1 = new CountNoOfObjects();
        CountNoOfObjects o2 = new CountNoOfObjects();
        CountNoOfObjects o3 = new CountNoOfObjects();
        System.out.println("Total no of Objects Created = " + count);

    }

}
