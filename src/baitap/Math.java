import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so nguyen duong");
        float a = scanner.nextFloat();
        float b = a*a;
        float c = a*a*a;
        System.out.println("binh phuong cua mot so : " + b);
        System.out.println("lap phuong cua mot so :" + c);
    }
}
