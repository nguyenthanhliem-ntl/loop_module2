import java.util.Scanner;

public class tien_lai {
    public static void main(String[] args) {
        Scanner tien = new Scanner(System.in);

        System.out.println("tien gui: ");
        double tienGui = tien.nextDouble();

        System.out.println("so thang gui: ");
        byte mouth = tien.nextByte();

        System.out.println("nhap lai: ");
        float plai = tien.nextFloat();



        if(tienGui<=0) {
            System.out.println("tien gui khong the <0");
        }else {
            double lai = tienGui*(plai/100/12)*12;
            System.out.println(lai);
        }
    }
}
