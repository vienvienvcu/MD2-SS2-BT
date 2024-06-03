import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so tt");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap name");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap phone");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap email");
        String email = scanner.nextLine();
        System.out.println("                   DANH SACH INH VIEN              ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("| stt  | ha vo ten   | tuoi | so dien thoai   | email              |");
        System.out.println("|" + number + "|" + name + "|" + age + "|" + phone + "|" + email + "|");

    }
}
