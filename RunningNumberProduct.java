package Day2;

public class RunningNumberProduct {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 10;
        int product = 1;
        int num = lowerbound;

        while (num <= upperbound){
            product = product * num;
            num++;
        }
        System.out.println("The product from " + lowerbound + " to " + upperbound + " is " + product);
    }
}
