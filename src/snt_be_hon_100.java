import java.util.Scanner;

public class snt_be_hon_100 {
    public static void main(String[] args) {
        Scanner aw = new Scanner(System.in);
        _100isprime();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }

    public static void _100isprime() {
        for (int i = 1; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

