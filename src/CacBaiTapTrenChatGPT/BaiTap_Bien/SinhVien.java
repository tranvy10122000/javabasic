package CacBaiTapTrenChatGPT.BaiTap_Bien;

public class SinhVien {
    String name ;
    int age ;
    static String schoolName = "Thu loi" ;
    public SinhVien(String name, int age){
        this.age = age;
        this.name = name;

    }



    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Vy", 20);
        System.out.println("Thong tin SV1 la "+ sv1.name + " co tuoi la " + sv1.age + " hoc truong " + schoolName);

        SinhVien sv2 = new SinhVien("Vy Tran", 23);
        System.out.println("Thong tin SV1 la "+ sv2.name + " co tuoi la " + sv2.age + " hoc truong " + schoolName);

        schoolName = "Back Khoa";
        SinhVien sv3 = new SinhVien("Vyvy", 26);
        System.out.println("Thong tin SV2 la " + sv2.name + " co tuoi la " + sv2.age + " hoc truong " + schoolName);

    }
}
