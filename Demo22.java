public class Demo22 {
    public static void main(String[] args) {
        double x = 10 % 7.0;    // remainder can be used with floats
        System.out.println(x);  // prints 3.0
        
        int y = -10 % 7;        // -3
        System.out.println(y);

        int y1 = 10 % -7;       // 3
        System.out.println(y1);
    }
}
