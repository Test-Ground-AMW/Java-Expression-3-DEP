public class Demo29 {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        boolean result1 = false & x++ > y++;
        System.out.printf("result1 = %s, x = %s, y = %s \n", result1, x, y);
        System.out.println();

        int a = 3;
        int b = 2;

        boolean result2 = false || a++ > 2 | b++ < 2;
        System.out.printf("result2 = %s, a = %s, b = %s \n", result2, a, b);
        System.out.println();

        a = 3;
        b = 2;
        int c = 4;

        boolean result3 = a++ != 3 && b++ < c++ | c++ == 5;
        System.out.printf("result3 = %s, a = %s, b = %s, c = %s \n", result3, a, b, c);
    }
}
