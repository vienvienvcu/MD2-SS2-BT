import java.util.Scanner;

public class Acreage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai ");
        int hight = scanner.nextInt();
        System.out.println("nhap chieu rong");
        int width = scanner.nextInt();
        int C = (hight + width)*2;
        int S = hight * width;
        System.out.println("chu vi hinh chu nhat: " + C);
        System.out.println("dien tich hinh chu nhat: " + S);
    }
}
