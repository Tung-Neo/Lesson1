package Day2;

public class RunningNumberMod7Sum {
    public static void main(String[] args) {
        int lowerbound = 0;
        int upperbound = 1000;
        int sum = 0;
        int num = lowerbound;

        while (num <= upperbound){
            sum = sum + num;
            num += 7;
        }
        System.out.println("Sum = " + sum);
    }
}
