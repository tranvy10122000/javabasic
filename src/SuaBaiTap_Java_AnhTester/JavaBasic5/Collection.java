package SuaBaiTap_Java_AnhTester.JavaBasic5;

import SuaBaiTap_Java_AnhTester.JavaBasic3.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();

       // kiem tra so chan, add vao ArrayList
        for(int i = 0; i <= 50; i++)
        {
            if(i % 2 == 0)
            {
                list.add(i);
            }
        }
        // Duyet gia tri trong ArrayList
        for(int i : list)
        {
            System.out.printf(i + " ");
        }
        System.out.println("\n --------------Thong tin nhan vien-------------");

        ArrayList<String> employeeInfo = new ArrayList<>();
        employeeInfo.add("A test");
        employeeInfo.add("B test test");
        employeeInfo.add("C test test");

        for(String j: employeeInfo)
        {
            System.out.println(j + " ");
        }

        System.out.println("************** Cach khai bao Array List ********************");
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("tesst","Vy tesst"));
        ArrayList<String> list3 = list2;
        System.out.println(list3);
    }
}
