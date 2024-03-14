import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Đếm s lần xuất hiện ký tu trong chuỗi");
        System.out.println("Input The String ");
        String InitialString = scanner.nextLine();
        char[] initString = InitialString.toCharArray();



        System.out.println("Fill charactar that you want to find out");
        String character1 = scanner.nextLine();
        char[] arrChar = character1.toCharArray();

        byte repeatChar = 0;

        for (byte i = 0; i < InitialString.length(); i++) {

            if(arrChar[0] == initString[i] ){
                repeatChar ++;
            }
        }
        System.out.printf("Trong chuỗi %s, ký tự %s lặp lại %d lần,",
                InitialString, arrChar[0], repeatChar);



    }
}
