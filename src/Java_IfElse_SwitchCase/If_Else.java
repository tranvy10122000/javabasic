package Java_IfElse_SwitchCase;

public class If_Else {
    public static void main(String[] args) {
        double dtb = 7.5;
        if(dtb >= 8){
            System.out.println("Gioi");
        }
        else if (dtb < 8 && dtb >= 6.5){
            System.out.println("Kha");
        }
        else if (dtb < 5 && dtb > 3.5){
            System.out.println("Yeu");
        }
        else {
            System.out.println("O lai lop");
        }

    }

}

/*
Ly Thuyet
So sanh bang trong chuoi dung ham equals()
So sanh chua trong chuoi dung ham contains()
* */
