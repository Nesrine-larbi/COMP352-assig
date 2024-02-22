import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class OddonacciCalculator {


    // Method to calculate Oddonacci numbers using Linear approach
    public static int linearOddonacci(int n) {
        // Base case: first three Oddonacci numbers are 1
        if (n <= 3)
            return 1;
        else
            return linearOddonacci(n - 1) + linearOddonacci(n - 2) + linearOddonacci(n - 3); // Recursive call
    }
    //*************************************************************************


    // Method to calculate Oddonacci number by making multiple recursive calls
    public static int multipleOddonacci(int n) {
        if (n <= 3)
            return 1; // Base case: first three Oddonacci numbers are 1
        else {
            // Recursive calls to calculate the previous three Oddonacci numbers
            int a = multipleOddonacci(n - 1);
            int b = multipleOddonacci(n - 2);
            int c = multipleOddonacci(n - 3);
            //  summing the previous three numbers
            return a + b + c;
        }

    }
}