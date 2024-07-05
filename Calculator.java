public class Calculator{ 
    public static int sum(int[] numbers){
        int sum = 0;
        for (int i=0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }
    //Task2
    public static double average(int[] numbers){
        return sum(numbers)/numbers.length;
        //can be used for
        
    }
    //Task3
    public static double sum(double[] numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
    //Task4
    public static double average(double[] numbers){
        double ans = sum(numbers) / numbers.length;
        return ans;
    }
    //Task5
    public static double sum(int[] lish1, double[] lish2){
        double ans = sum(lish1) + sum(lish2);
        return ans;
    }
    //Task6
    public static double sum(double[] lish1, int[] lish2){
        double ans = sum(lish1) + sum(lish2);
        return ans;
    }
}



// class for cal1, cal2