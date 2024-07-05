// input number for check time for your class

import java.util.Scanner;

import javax.swing.GroupLayout.Group;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            Dismenu();
            num=sc.nextInt();
            Groupno(num);
        } while (num != 4);
    }

    private static void Dismenu() {
        System.out.println("***Lab Times***");
        System.out.println("[1] TIME FOR GROUP A");
        System.out.println("[2] TIME FOR GROUP B");
        System.out.println("[3] TIME FOR GROUP C");
        System.out.println("[4] Quit Program");
    }
    private static void Groupno(int numIn) {
        switch (numIn) {
            case 1 : System.out.println("10.00 a.m.");
            break;
            case 2 : System.out.println("1.00 a.m.");
            break;
            case 3 : System.out.println("11.00 a.m.");
            break;
            case 4 : System.out.println("Good Bye");
            break;
            default : System.out.println("No such group");
            break;
        }
    }
}

