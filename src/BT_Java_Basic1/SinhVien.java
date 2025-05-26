package BT_Java_Basic1;

public class SinhVien {
    String name = "Tran Thi Vy"; // biến instance
    int age = 25; // biến instance
    static String address = "Thai Binh"; // bien static

    public static void thongTin(){
        SinhVien sv = new SinhVien();
        System.out.println("Thogn tin cua sinh vien: " + sv.name + " co tuoi " + sv.age + " que quan " + address);
    }

    public static void main(String[] args) {
        thongTin();
    }

}
