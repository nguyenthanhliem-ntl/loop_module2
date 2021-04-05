import java.util.Scanner;

public class snt_be_hon_100 {
    public static void main(String[] args) {
        Scanner aw = new Scanner(System.in);

        boolean check = true;
        System.out.println("nhap");
        float aq = aw.nextFloat();
        for(int i =1; i<aq;i++) {
            for(int j=2;j<Math.sqrt(aq);j++) {
                if (j % i == 0) {
                    check = false;
                    break;
                }
                if (check)
                    System.out.println(j );

            }
        }
        }

    }

