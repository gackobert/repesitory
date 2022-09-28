import java.util.ArrayList;
import java.util.Scanner;

public class ErathosthenesPrimeSieve implements PrimeSieve {


    private static boolean[] primezahlen;
    private static ArrayList<Integer> primes;


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        boolean[] max = new boolean[num];

        for (int i = 0; i < max.length; i++) {
            max[i] = true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (max[i] == true) {
                for (int j = (i * i); j < num; j = j + i) {
                    max[j] = false;
                }
            }

        }

       System.out.println("List of prime numbers upto given number are : ");
        for (int i = 2; i < max.length; i++) {
            if (max[i] == true) {
                System.out.println(i);
            }
        }
    }

    @Override
    public boolean isPrime(int p) {
        return primezahlen[p];
    }


    @Override
    public void printPrimes() {
        for (int a : primes) {
            System.out.print(a + ",");
        }
        System.out.println(" ");
    }

}