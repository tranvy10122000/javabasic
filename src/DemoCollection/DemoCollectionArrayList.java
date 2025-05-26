package DemoCollection;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionArrayList {
    public static void main(String[] args) {
        // khai bao
        // duoc phep lưu giá trị trùng lặp
        List<String> menu = new ArrayList<>();
        menu.add("Project");
        menu.add("Dashboard");
        menu.add("Customer");
        menu.add("Tasks");
        menu.add("Project");

        //Duyet du lieu kieu ArrayList
        for(int i = 0; i < menu.size(); i++)
        {
            System.out.println(menu.get(i));
        }
        System.out.println("-----------------------");
        int j = 0;
        for(String value : menu)
        {
            System.out.println(menu.get(j));
            j++;
        }
        // Cap nhat du lieu
        menu.add(3, "Tassk23");
        // get gia tri theo chi muc
        System.out.println(menu.get(4));

        System.out.println("***************");
        List<String> menu2 = new ArrayList<>();
        menu2.addAll(menu);  // them nguyen bo data trong menu vao menu2
        for(int i = 0; i < menu2.size(); i++)
        {
            System.out.println(menu2.get(i));
        }
    }
}
