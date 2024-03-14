import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]  firstArray = getArray( scanner);
        int[]  secondArray = getArray( scanner);
        addTwoArray(firstArray, secondArray);

    }

    public static int[] getArray( Scanner scanner){
        System.out.println("Xin mời nhập kích thước của mảng, giới hạn kích thước là 10");
        int arrLength = Integer.parseInt(scanner.nextLine());
        int arr[] = new int[arrLength];

        for (byte i = 0; i < arr.length; i++) {
            System.out.printf("Xin mời nhập so thứ %d \n ", i);
            int valueArr = Integer.parseInt(scanner.nextLine());
            arr[i] = valueArr;
        }

        return arr;
    }


    public static void addTwoArray(int[] firstArray,int[] secondArray  ){
        System.out.println("Result of two array");

        int lengthOfFirstArray = firstArray.length;
        int lengthOfSecondArray = secondArray.length;
        short currentIndex = 0;

        System.out.println("length 1 " + lengthOfFirstArray);
        System.out.println("length 2 " + lengthOfSecondArray);
        int[] result = new int[lengthOfFirstArray + lengthOfSecondArray];


        for (int i = 0; i < lengthOfFirstArray; i++) {
            result[i] = firstArray[i];
            currentIndex ++;

        }
        for (int i = 0; i < lengthOfSecondArray ; i++) {
            result[currentIndex] = secondArray[i];
            currentIndex ++;
        }

        for (int number : result){
            System.out.printf("%d ", number);
        }

        chuyenMangThanhChuoi(firstArray, secondArray ,result);


    }

    public static void chuyenMangThanhChuoi(int[] firstArray,
                                            int[] secondArray,
                                            int[] result){
        String arr1 = Arrays.toString(firstArray);
        System.out.printf("Mảng thứ nhất %s \n", arr1);
        String arr2 = Arrays.toString(secondArray);
        System.out.printf("Mảng thứ hai %s \n", arr2);
        String result1 = Arrays.toString(result);
        System.out.printf("Ket quả%s \n ", result1);


    }
}
