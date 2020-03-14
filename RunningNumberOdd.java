package Day2;

public class RunningNumberOdd {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;
        int num = lowerbound;

        while (num <= upperbound){
            sum = sum + num;
            num += 2;
        }
        System.out.println("Sum = " + sum);
    }
}
