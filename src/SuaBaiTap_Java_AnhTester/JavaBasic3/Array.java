package SuaBaiTap_Java_AnhTester.JavaBasic3;

public class Array {
    // So chan la so chia het cho 2
    public static void main(String[] args) {
        int mangSoNguyen[] = new int[26];
        int index = 0;
        for(int i = 0; i <= 50; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("So chan tu 0 den 50: " + i);
                mangSoNguyen[index] = i; // gan gia tri so chan vao vi tri mang tuan tu
                index++; // tang bien chi muc len 1 don vi
            }

        }
        // Duyet mang
        for (int value : mangSoNguyen)
        {
            System.out.println(value);
        }
    }
}
