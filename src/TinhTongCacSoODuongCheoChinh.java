import java.util.Scanner;

public class TinhTongCacSoODuongCheoChinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuong trinh tính tong các so ở dường chéo chính va phu");
        System.out.println("Nhập vào số hàng");
        byte row = scanner.nextByte();
        System.out.println("Nhập vào số cột");
        byte column = scanner.nextByte();
        if(row != column){
            System.out.println("s");
        }
        byte[][] matrixArray =  new byte[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Nhập giá tri hang %d va cột %d \n ", i , j );
                matrixArray[i][j] = scanner.nextByte();
            }
        }
        //hien thi gia tri cua ma tran
        System.out.println("Các giá tri của ma trận");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%d  ", matrixArray[i][j] );
            }
            System.out.println();
        }

        //gia tri duong cheo chính
        byte sum1 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if( i == j ){
                    sum1 += matrixArray[i][j];
                }

            }
        }
        //gia tri duong cheo phụ
        byte sum2 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if( i + j == row - 1 ){
                    sum2 += matrixArray[i][j];
                }

            }
        }
        System.out.println("Tổng duong chéo chính " + sum1);
        System.out.println("Tổng duong chéo phu " + sum2);

    }
}
