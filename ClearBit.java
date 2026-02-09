public class ClearBit {
    
    public static void main(String[] args) {

        int n = 5;        // 0101 in binary
        int pos = 2;      // checking 2nd bit (third from right)

        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
}
}

