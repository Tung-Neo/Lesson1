package Day2;

public class ThreeFiveSevenSum {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sum = 0;
        int num = lowerbound;
        while (num <= upperbound){
            if (num % 3 == 0 || num % 5 == 0 || num % 7 ==0){
                sum += num;
                if (num % 15 ==0 || num % 21 ==0 || num % 35 == 0 || num % 105 == 0){
                    sum = sum - num;
                }
            }
            ++num;
        }
        System.out.println("The product from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
