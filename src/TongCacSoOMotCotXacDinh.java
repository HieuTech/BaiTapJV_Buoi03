import java.util.Scanner;

public class TongCacSoOMotCotXacDinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuong trinh tính tong các số  1 cột xác định");
        System.out.println("Nhập vào số hàng");
        byte row = scanner.nextByte();
        System.out.println("Nhập vào số cột");
        byte column = scanner.nextByte();
        byte[][] matrixArray =  new byte[row][column];



        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                System.out.printf("Nhập giá trị hàng %d và cột %d \n",  i ,j );
                matrixArray[i][j] = scanner.nextByte();
            }
        }
        System.out.println("Mảng 2 chiều" );

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf(" %d \n ", matrixArray[i][j] );
            }
        }

        System.out.printf("Hiện tại có %d cột \n  Nhập vào số cột cần tinh tổng,", column );
        byte number = scanner.nextByte();
        if(number > column){
            System.out.println("Giá trị nhập vượt quá số dòng");
        }

        int value = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <  column; j++) {
                if((number - 1) == j){
                    value += matrixArray[i][j];
                }
            }
        }
        System.out.printf("Tổng giá trị ở cột %d là %d ", number, value);



    }
}
