public class tailRecursiveOddonacci {





        // Method to calculate Oddonacci numbers using Tail Recursive approach
        public static int tailRecursiveOddonacci(int n, int a, int b, int c) {
            // Base cases: for n = 0, 1, 2, return the corresponding predefined Oddonacci numbers
            if (n == 0)
                return a; // First Oddonacci number
            else if (n == 1)
                return b; // Second Oddonacci number
            else if (n == 2)
                return c; // Third Oddonacci number
            else
                // Recursive call to calculate Oddonacci number for n > 2
                return tailRecursiveOddonacci(n - 1, b, c, a + b + c);
        }
    }


