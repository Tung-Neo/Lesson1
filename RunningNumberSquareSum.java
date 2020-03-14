package Day2;

public class RunningNumberSquareSum {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        int num = lowerbound;

        while (num <= upperbound){
            sum = sum + num * num;
            num++;
        }
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
