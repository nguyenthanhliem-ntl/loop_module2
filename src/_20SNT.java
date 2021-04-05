
import java.util.Scanner;

public class _20SNT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhâp ");
        int a = s.nextInt();
        printNPrimes(20);
    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        else if(n<=3)
            return true;
        else{
           for(int i = 2; i<=Math.sqrt(n);i++){
               if (n % i == 0) return false;

           }
           return true;
        }

    } public  static void printNPrimes(int n){
        int count = 0;
        int i = 2;
        while (count <n){
            if (isPrime(i)) {
                System.out.println(i);
                count++;}
            i++;
}}}
