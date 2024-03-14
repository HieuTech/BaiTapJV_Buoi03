import java.util.Scanner;

public class TimPhanTuLonThu2TrongMang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình tìm phần tử lớn thú 2 trong mảng");

        System.out.println("Mời nhập kích thước của mang");

        byte arrLength = scanner.nextByte();
        byte[] arrNumber = new byte[arrLength];
        //nhập vào các giá trị trong mảng
        for (int i = 0; i < arrLength; i++) {
            System.out.printf("Input number %d ", i + 1);
            byte inputValue = scanner.nextByte();
            arrNumber[i] = inputValue;
        }

        byte maxValue = 0;
        //tìm số lớn nhất trong mảng
        for (int i = 0; i < arrLength; i++) {
            maxValue = arrNumber[0];
            if(maxValue < arrNumber[i]){
                maxValue = arrNumber[i];
            }

        }

        byte maxValue2 = 0;
        for (int i = 0; i < arrLength; i++) {

            if(maxValue < arrNumber[i] ){
                maxValue = arrNumber[i];

                if(maxValue2 >= maxValue){
                    break;
                }

            }


        }


        String printArr = arrNumber.toString();
        //duyệt mảng và in so lớn nhất
            System.out.printf("Mảng cua bạn \n %s \n có số lớn thứ 2 là: %d ",printArr
            , maxValue2);

        System.out.printf("so lớn nhất %d "
                , maxValue);


    }
}
