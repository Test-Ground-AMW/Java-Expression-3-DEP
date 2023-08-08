public class Demo24 {
    public static void main(String[] args) {
        int result1 = 5 & 2;
        /*
         * 0000_0101
         * 0000_0010
         * 0000_0000 => 0
         */
        byte result2 = (byte) (-2 & 0xFF);
        /*
         * 1111_1110
         * 1111_1111
         * 1111_1110 => -2
         */
        byte result3 = 0X2 | 0XA;
        /*
         * 0000_0010
         * 0000_1010
         * 0000_1010 => 10
         */
        byte result4 = 011 ^ 5;
        /*
         * 0000_1001
         * 0000_0101
         * 0000_1100 => 12
         */

        System.out.println(result1);
        // System.out.printf("%08d \n", (Integer.toBinaryString(result1)));
        System.out.println(result2);
        // System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(result2)));
        System.out.println(result3);
        // System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(result3)));
        System.out.println(result4);
        // System.out.printf("%08d \n", Integer.valueOf(Integer.toBinaryString(result4)));

        /*special */

        byte x = 3;
        byte y = 4;
        // byte z = x + y;        can't be done

        final byte x1 = 3;
        final byte y1 = 4;
        byte z1 = x1 + y1;            // compiler allow narrow conversion (x1,y1 compile-time constant)

        int abc = 10;
        long l = 15;
        // long result = abc + l;

        int a = 10;
        float b = 20.0f;
        // float result2 = a+b;       // convert result into float type

        float c = 10f;
        double d = 25;
        // double result3 = c + d;    // convert result into double type

        // double result4 = abc + l + b + x;   // according to the priority list all expression convert into double type


    }
}
