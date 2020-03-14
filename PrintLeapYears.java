package Day2;

public class PrintLeapYears {
    public static void main(String[] args) {
        int lowerbound = 1999;
        int upperbound =2010;
        int count = 0;
        int num = lowerbound;
        while (num <= upperbound){
            if(num % 4 == 0){
                count++;
            }
            num++;
        }
        System.out.println("The leap years from " + lowerbound + " to " + upperbound + " is " + count);
    }
}
