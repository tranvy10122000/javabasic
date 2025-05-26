package BT_Java_Basic2;

public class Calculator {
    public static int tinhTong(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public static double tinhTich(double a, double b)
    {
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Tong 2 so nguyen la: " + tinhTong(3,10));
        System.out.println("Tich 2 so thuc la: " + tinhTich(3.9,10.9));
    }
}


