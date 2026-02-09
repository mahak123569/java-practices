import java.util.*;

public class updateBits  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();   // 1 for set, 0 for clear

        int n = 5;                 // 0101 in binary
        int pos = 1;               // checking 2nd bit from right

        int bitMask = 1 << pos;

        if (oper == 1) {
            // set bit
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear bit
            int newBitMask = ~bitMask;
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        sc.close(); // ✅ fixes yellow warning
    }
}
