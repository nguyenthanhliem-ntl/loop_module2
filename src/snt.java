import java.util.Scanner;

public class snt {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("Nhap so: ");
        int a1 = a.nextInt();

        if(a1<2 ){
            System.out.println("is not a prime");
        }else{
            boolean check = true;
            int i = 2 ;
            while (i <= Math.sqrt(a1)) {
                if (a1 % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(a1 + " is a prime");
            else
                System.out.println(a1 + " is not a prime");
        }
        }
    }

