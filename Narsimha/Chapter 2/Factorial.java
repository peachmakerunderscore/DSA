class Solution {
    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }

        else {
            return (number * factorial(number - 1));
        }
    }

    public static void main(String[] args) {
        int number = 1;
        int res = factorial(number);
        System.out.println(res);
    }
} 