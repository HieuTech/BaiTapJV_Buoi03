import java.util.Scanner;

public class LuyenTap1 {
    public static void main(String[] args) {

//        int size = 10;
//        float numberArr[] = new float[size];
//        Scanner scanner = new Scanner(System.in);
//        float result;
//        for (byte i = 0; i < numberArr.length; i++) {
//            System.out.println("Xin mời nhập vao 1 số");
//            float value = Float.parseFloat(scanner.nextLine());
//            numberArr[i] = value;
//            if(value % 2 == 0){
//                System.out.printf("%f la so chia het cho 2  \n", value);
//
//            }
////            System.out.printf("Gia tri %f có vị trí index: %d", numberArr[i], i);
//
//        }
//        String[] arrString;
//
//        String arrString1[] = new String[10];
//        arrString1[2] = "hahaha";
//
//        char arrChar[] = {'a', 'b', 'c', 'd'};
//
//        char arrChar1[] = new char[] {'s','d','s'};
//
//        for (char item : arrChar1){
//            System.out.println("item " + item);
//        }

        int[][] arrInt = new int[5][4];
        arrInt[2][1]= 5;
        float[][] arrFloat = {{3f, 2f},{4f, 5f, 6f}};
        for( float[] arr : arrFloat){
            for( float number: arr){
                System.out.println("number" + number);
            }
        }





    }
}


