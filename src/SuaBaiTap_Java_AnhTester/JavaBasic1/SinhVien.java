package SuaBaiTap_Java_AnhTester.JavaBasic1;

public class SinhVien {
    String studentName = "Vy"; // bien toan cuc
    static String university = "Thuy Loi";  // bien static

    public static void main(String[] args) {
        double mathScore = 9.0; // bien cuc bo
        double english = 9;

        SinhVien sv = new SinhVien();
        System.out.println("Ho ten nhan vien: " + sv.studentName);

    }
}
