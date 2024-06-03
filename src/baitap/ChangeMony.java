import java.util.Scanner;

public class ChangeMony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
//        nhap gia tri usd
        System.out.println("nhap vao usd");
        int usd = scanner.nextInt();
        int vnd = rate * usd;
        System.out.println(" so tien viet nam dong: " + vnd );
    }
}