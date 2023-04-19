public class Main {
    public static void main(String[] args) {
        RecursiveCountdown(10);
        System.out.println(SumOfNumbers(4));
        System.out.println(factorial(10));
        int arr[] = {1,2,3};
        System.out.println(sumArray(arr, arr.length));
    }

    public static int SumOfNumbers(int n) {
        //base case
        if (n == 1) {
            return 1;
        }
        return n + SumOfNumbers(n - 1);
    }

    public static int factorial(int n) {
        //base case
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void RecursiveCountdown(int n) {
        //base case
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.print(n + " ");
            RecursiveCountdown(n - 1);
        }
    }

    public  static int sumArray(int[] arrayIn, int n) {
        if (n == 0) {
            return 0;
        }
        return arrayIn[n-1] + sumArray(arrayIn, n-1);
    }
}