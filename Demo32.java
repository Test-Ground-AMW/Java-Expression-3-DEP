public class Demo32 {
    public static void main(String[] args) {
        /*
         * E1 op= E2 => E1 = (T)(E1 op E2)  ; T - Datatype(E1)
         * 
         * int x = 5;
         * x += 10;  => x = (int)(x + 10)
         */

         int x = 5;
         x+=10.7;       // (int)(x + 10.7)
         System.out.println(x);

         int y = 3;
         y<<=11;        // (int)(y << 1)
         System.out.println(y);

         int a = 5;
         int b = 2;
         int c = 3;

         c += ++a + (b *= 2 + a) + ++c - (a++ > b ? (c -= 2 + b) + a : (a += c++ + b)+ 2 ); 
         System.out.printf("a = %s, b = %s, c = %s\n",a,b,c);

         byte b1 = 5;
         byte b2 = 0;
         b2 = (byte) (b2 + b1 + 2);  // casting should be done by explicitly
         b2 += b1 + 2;               // implicit casting
    }
}
