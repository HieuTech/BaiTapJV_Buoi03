import java.util.Scanner;

public class TimSoNhoNhatTrongMang2Chieu {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuong trinh tìm giá trị nho nhat trong mang 2 chieu");
        System.out.println("Nhập vào số haàng");
        byte row = scanner.nextByte();
        System.out.println("Nhập vào số cột");
        byte column = scanner.nextByte();

        byte matrixArray[][] = new byte[row][column];

        //nhập gia trị vô mảng;loi
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < column; j++) {
                System.out.printf("Nhập giá trị hàng %d và cột %d \n", i, j);
                matrixArray[i][j] = scanner.nextByte();
            }

        }
        //tim số nho nhat trong mảng
        byte minValue = Byte.MAX_VALUE;
        byte item;
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < column; j++) {
                item = matrixArray[i][j];
                if(item <= minValue){
                    minValue = item;
                }
            }
        }
        System.out.printf("Gia tri nho nhat trong mang %d" , minValue);



    }
}
