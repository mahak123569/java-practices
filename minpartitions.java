import java.util.Scanner;

public class minpartitions {
    public static int minPartitions(String n) {
        int maxDigit = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(minPartitions(n));
        sc.close();
    }
}
