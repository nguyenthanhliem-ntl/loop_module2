import java.util.Scanner;

public class ve_hinh {
    //    public static void main(String[] args) {
//        Scanner eu = new Scanner(System.in);
//        System.out.println("a");
//        int a = eu.nextInt();
//        System.out.println("b");
//        int b =eu.nextInt();
//        for(int i =1;i<=a; i++) {
//            for(int j =1;j<b; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }
//    }
//}


//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }
//    }
//}

//    public static void main(String[] args) {
//       for (int i = 1; i <=5; i++) {
//            for (int j = 5; j >i; j--) {
//                System.out.print("*");
//
//            }
//           System.out.println("*");
//       }
//    }
//}


    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("nhap");
        int a1 = a.nextInt();

            for(int i = 0;i<a1;i++){
                if(i>a1/2) {
                    break;
                }
                for(int j = 0;j<=a1;j++) {
                    if(j>=i  &&  j<=(a1-1-i)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                }
            }System.out.println();
        }
        }
    }
