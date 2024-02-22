//Full name :Nesrine Larbi
//Oddonacci calculator (linear and multiple recursion)
//Our goal is to develop effective Oddonacci number calculators utilizing various
// recursive techniques. Comparing their speeds and using tail recursion are the objectives.
//*************************************************************************
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
        public class Main {

        public static void main(String[] args)  {

            try {
                // Create Jtwo separate text files for output
                PrintWriter linearOutput = new PrintWriter(new FileWriter("LinearOutput.txt"));
                PrintWriter multipleOutput = new PrintWriter(new FileWriter("MultipleOutput.txt"));

                // Calculate and output Oddonacci values for both versions
                for (int i = 5; i <= 50; i += 5) {
                    // Measure execution time for Linear recursive approach
                    long linearStartTime = System.nanoTime();
                    //method call
                    int linearResult =  OddonacciCalculator.linearOddonacci(i);;
                    long linearEndTime = System.nanoTime();
                    long linearElapsedTime = linearEndTime - linearStartTime;

                    // Output result and execution time to LinearOutput.txt
                    linearOutput.println("Oddonacci(" + i + "): " + linearResult + " (Elapsed Time: " + linearElapsedTime + " ns)");

                    // Measure execution time for Multiple recursive approach
                    long multipleStartTime = System.nanoTime();
                    int multipleResult =OddonacciCalculator. multipleOddonacci(i);
                    long multipleEndTime = System.nanoTime();
                    long multipleElapsedTime = multipleEndTime - multipleStartTime;

                    // Output result and execution time to MultipleOutput.txt
                    multipleOutput.println("Oddonacci(" + i + "): " + multipleResult + " (Elapsed Time: " + multipleElapsedTime + " ns)");
                }

                // Close the output files
                linearOutput.close();
                multipleOutput.close();

                // Inform the user that the operation is completed
                System.out.println("Oddonacci calculations and timing measurements completed.");
            } catch (IOException e) {
                // Handle any potential IO exception
                e.printStackTrace();
            }
        }
    }



