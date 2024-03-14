import java.util.Scanner;

public class TimSoLonNhatTrongMang2Chieu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình tìm phần tử lớn nhất trong mảng 2 chieu");

        System.out.println("Mời nhập số dòng");
        byte row = scanner.nextByte();

        System.out.println("Mời nhập số cột dòng");
        byte column = scanner.nextByte();

        byte[][] arrayMatrix = new byte[row][column];



        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < column; j++) {
                System.out.printf("Vui long nhap phan tu tại hang %d, cot %d \n", row + 1, column + 1 );
                arrayMatrix[i][j] = scanner.nextByte();
            }
        }


        //tim so lon nhat
        byte maxValue = 0;
        byte item;
        for (byte i = 0; i < row; i++) {
            for (byte j = 0; j < column; j++) {
                item = arrayMatrix[i][j];
                if(maxValue <= item){
                    maxValue = item;
                }

            }
        }
        System.out.printf("Số lớn nhất là %d ", maxValue);





    }
}
