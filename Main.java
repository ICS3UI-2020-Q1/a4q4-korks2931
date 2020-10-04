import java.util.Scanner;
/**
 *This program will print out a word to the screen depending on the number it is on. 
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
   // ask the user for a positive integer 
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    // create a variable to store integer
    int integer = input.nextInt();
    // create a variable to keep track of what number we are on 
    int count = 1;
    // the accumulator
    int total = 0;
    // declare a variable to store remainderOne
    int remainderOne = (count % 3);
    
    //declare a variable to store remainderTwo
    int remainderTwo = (count % 5);
    do { 
      System.out.println(count);
      count = count + 1;
    }while(count <= integer);
      while (remainderOne == 0){
    System.out.println("Fizz");

      }while(remainderTwo == 0){
      
    System.out.println("Buzz");
      }
    
    
       
  
    

  }
}



      
      


     

  
 


