import java.util.Scanner;

public class Calc{
 
  public static void main(String[] args) {
  
    int num1, num2, result;
    char operation;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter the first number (0-99):");
   
    num1 = validateNumber(input);
     
    System.out.println("Please enter the second number (0-99):");
    
    num2 = validateNumber(input);
    
    System.out.println("Please enter the operation (+, -, *, /):");
    
    operation = validateOperation(input);
    
    switch (operation) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        
        if (num2 == 0) {
          System.out.println("Error: Cannot divide by zero.");
          return;
        }
        result = num1 / num2;
        break;
      default:
        
        System.out.println("Error: Invalid operation.");
        return;
    }
    
    System.out.println("The result is: " + result);
  }
  
  public static int validateNumber(Scanner input) {
    
    int number;
    
    while (true) {
      
      if (input.hasNextInt()) {
        
        number = input.nextInt();
        
        if (number >= 0 && number <= 99) {
          
          return number;
        } else {
          
          System.out.println("Error: Please enter a number between 0 and 99.");
        }
      } else {
        
        System.out.println("Error: Please enter a valid number.");
        
        input.next();
      }
    }
  }
  
  public static char validateOperation(Scanner input) {
    
    char operation;
    
    while (true) {
      
      if (input.hasNext()) {
        
        operation = input.next().charAt(0);
        
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
         
          return operation;
        } else {
          
          System.out.println("Error: Please enter a valid operation (+, -, *, /).");
        }
      } else {
        
        System.out.println("Error: Please enter a valid operation (+, -, *, /).");
        
        input.next();
      }
    }
  }
}
