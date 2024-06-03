import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao diem mon toan");
        float math = scanner.nextFloat();
        System.out.println("nhap vao diem mon van");
        float literature = scanner.nextFloat();
        System.out.println("nhap vao diem mon anh");
        float english = scanner.nextFloat();
//        khai bao bien diem trung binh
        float average = (math + literature + english)/3;

        System.out.println("diem trung binh la: "+ average);
    }
}
