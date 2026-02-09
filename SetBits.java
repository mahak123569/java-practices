public class SetBits {
  
    public static void main(String[] args) {

        int n = 5;        // 0101 in binary
        int pos = 1;      // checking 2nd bit (third from right)

        int bitMask = 1 << pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
}
}