package SuaBaiTap_Java_AnhTester.JavaBasic2;

public class Calculator {
    public static int sumInteger (int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    public static double nhanDouble(double a, double b)
    {
        double nhanDouble = a*b;
        return nhanDouble;
    }

    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Tong 2 so nguyen la: " + sumInteger(9,8));
        System.out.println("----------------------");
        System.out.println("Tich 2 so nguyen la: " + nhanDouble(9.8, 7.9));
    }
}
