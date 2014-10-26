import javax.swing.JOptionPane;

/** This simple program will demonstrate what the average 
 *  of 3 test scores will be.
 */

public class TestScoreAverage
{
  public static void main(String[] args)
  {
    // Declare variables.
    double testOne, testTwo, testThree, averageScore;
    String textInput;
    
    
    // Display initial message.
    JOptionPane.showMessageDialog(null, "The following questions will " +
                                  "average the scores of your past 3 tests.");
                                 

    // Display input dialog asking for the first test scores and convert result to double.
    textInput = JOptionPane.showInputDialog("Please enter the score for your first test.");
    testOne = Double.parseDouble(textInput);
    
    // Display input dialog asking for the second test score and convert result to double.
    textInput = JOptionPane.showInputDialog("Please enter the score for your second test.");
    testTwo = Double.parseDouble(textInput);
    
    // Display input dialog asking for the third test score and convert result to double.
    textInput = JOptionPane.showInputDialog("Please enter the score for your third test.");
    testThree = Double.parseDouble(textInput);
    
    // Calculate averages.
    averageScore = (testOne + testTwo + testThree) / 3;
    
    // Display results
    JOptionPane.showMessageDialog(null, "The average score for your last three tests is " +
                                  averageScore + "%.");
    
    System.out.println(testOne);
    // Safely exit the program.
    System.exit(0);
  }
}
