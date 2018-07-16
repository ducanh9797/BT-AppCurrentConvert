import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double R;
        double D;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mệnh giá VND hiện tại: ");
        R = scanner.nextDouble();

        System.out.println("Nhập vào mệnh giá $: ");
        D = scanner.nextDouble();

        double Money = D * R;
        double Rate = D / R;
        System.out.print("Số tiền: " + Money);
        System.out.print("Tỉ giá: " + Rate);
    }
}
