public class t3 {
    public static void main(String[] args) {
        String names[] ={"Tawin","Ant","Tong","Mam","Kium","Sanya"};
        int money[] = {100,500,250,550,120,430};
        System.out.println("The Richest is "+ richest(names, money) );
    }
    public static String richest (String[] nameIn , int[] moneyIn) {
        int maxValue = 0;
        int maxkey = 0;
        for (int  i = 0 ; i < moneyIn.length ; i++) {
            if (moneyIn[i] > maxValue) {
                maxValue = moneyIn[i];
                maxkey = i;
            }
        }
        return nameIn[maxkey];
    }
}
