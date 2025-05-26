package DemoCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        // khong luu duoc cac gia tri trung lap
        Set<String> menu = new HashSet<>();
        menu.add("Test");
        menu.add("Customer");
        menu.add("Object");
        System.out.println("Cac phan tu " + menu);
        // duyet gia tri trong set
        // show set through interator
        Iterator<String> itr = menu.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + ",");
        }
        System.out.println("----------------");


    }
}
