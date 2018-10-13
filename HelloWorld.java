// Mireya Hernandez Cruz (Program) First Java Project
import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("This is my very first project"
				+ " I hope i will complete it in time");
					/* Boolean - boolean - True or False
					   integer - int - 1, -10, 20000, 123_456_789
					   Double - double - 1.0, -10.0005, 3.141
					   Float - float -  0.758 */
		System.out.print("True or false will I pass this course?");
			boolean yes = true;
			System.out.println("This is" +  yes);
			String x = "With an A ";
			System.out.println(x+ " or atleast I'll attept to pass with an A");
			int a = 95;
			System.out.print(a+ "or a");
			double b = 89.5;
			System.out.println(b);
			
		/* Variable: is a location in memory.
		 * Scope:The scope refers to the section of code where a variable can be accessed
		 */
		
			
			
		/*The only difference between a normal variable and a final variable is that we can re-assign
		  value to a normal variable but we cannot change the value of a final variable once assigned.
		  Hence final variables must be used only for the values that we want to remain constant
		  throughout the execution of program.	*/ 
			
			// a final variable
			final int MyConstant = 5;
			// try changing  
			//MyConstant = 50;
			System.out.println("Value of the constant is "+ MyConstant);
			// It will not change
			
			// dataType variableName = (dataType)variableToConvert;
			double num = 2.2;
			System.out.println(num);
			int num2 = (int)num;
			System.out.println(num2);
			
			/* String Methods
			 * replace() replace all occurances of matching characters in a string
			 * indexof() you can retrive the index value of a character in a string
			 * charAt returns the character of a sting*/
		String str= "Using String replace to replace character" ;
		String newString =str.replace("r", "R");
		System.out.println(newString);
		
		String phoneNum = "123-456-7890";
		int idx1 = phoneNum.indexOf('-');
		System.out.println("index of first dash: "+idx1);
		//3
		int idx2 = phoneNum.indexOf('-' , 2);
		System.out.println("second dash idx: "+idx2); //3
		
		String sst="Mireya";
		System.out.println(sst.charAt(0)); //M
		System.out.println(sst.charAt(5)); //a
		
		//Escape sequences \t: insert a tab, \n insert a new line, \b insert back space
		System.out.println("Inesert new tab \t here then insert new line start \n here  after insert a back space in the text \b at this point");
		
		double length = 5.0;
	    double width = 2.5;
	    System.out.println(calculateArea(length, width));
	  }
	    // Method with arguement and returm value
	  public static double calculateArea(double side1, double side2) {
	    double area;
	    area = side1 * side2;
	    return area;
	    
	  }
		/* Below showSum(12, 45); is a CALL, showSum is a method name, (int num1, int num2) is are PARAMETERS,
		 * public static void showSum(int num1, int num2) is a HEADER, The variable you pass is called an ARGUMENT num1 and num2.
		 */
	  {
		  System.out.println("This is the sum of 12 and 45 is:");
		  showSum(12, 45);
	  }
	  public static void showSum(int num1, int num2)
	  {
		  int result;
		  result = num1 + num2;
		  System.out.println(result);
	  }
	public class RandomNum{
		Random rndNum = new Random();
		int randomNum = rndNum.nextInt();
		//System.out.println("Random Number: " + random);
	}
	// create random object, only do this once
	Random randomGen = new Random();
	// check next int value, you can do this as many times as you want
	// nextInt will return an int between 0 (inclusive) and the specified value (exclusive) 
	     //System.out.println("Next int value: " + randomGen.nextInt(10000));
	
	// Math Class
	Class Main; {
	 Scanner scan = new Scanner(System.in);
	    System.out.println("Tell me the size of your slice and I will tell"); 
	    System.out.println("you which is larger, the number entered, or PI");
	    double slice = scan.nextDouble();
	    // output the larger value, slice or PI
	    System.out.println(Math.max( slice, 3.141592653589793));
	
	         /*operator precedence : Operators with higher precedence are evaluated before operators 
	    with relatively lower precedence. Operators on the same line have equal precedence. When operators
	    of equal precedence appear in the same expression, a rule must govern which is evaluated first. 
	    All binary operators except for the assignment operators are evaluated from left to right; 
	    		assignment operators are evaluated right to left.*/
	    
	    
	         // if and then Also logical operators
	    {    
	if (testscore >= 90) {
        grade = 'A';
    } else if (testscore >= 80) {
        grade = 'B';
    } else if (testscore >= 70) {
        grade = 'C';
    } else if (testscore >= 60) {
        grade = 'D';
    } else {
        grade = 'F';
    }
	
	{
    System.out.println("Grade = " + grade); 
	
	}
	int value1 = 1;
    int value2 = 2;
    if((value1 == 1) && (value2 == 2))
        System.out.println("value1 is 1 AND value2 is 2");
    if((value1 == 1) || (value2 == 1))
        System.out.println("value1 is 1 OR value2 is 1");
	    }
	    
	    
	// switch statement 
	      getLetter(s); {
	        let letter;
	        // Write your code here
	        if (s.charAt(0).match(a|e|i|o|u/g)) {
	            letter = 'A';
	        } else if ((s.charAt(0).match(/b|c|d|f|g/); {
	            letter = 'B';
	        } else if (s.charAt(0).match(/h|j|k|l|m/)) {
	            letter = 'C';
	        } else {
	            letter = 'D';
	        }

	        return letter;
	        
	        /*Comparing using Equal Method this method determines
	        whether the Number object that invokes the method is equal to the object that is passed as an argument.
	        CompareTo is use to compare Strings
	        */
	        int x= 3;
	        int y= 2;
	        int z= x + y;
	        
	        boolean test = (z == x + y);
	        System.out.println(test);
	        
	        String r = "Ora";
	        String d = "cle";
	        String p = r + d;
	        boolean tests = CompareTo(r + d);
	        System.out.println(tests);
	        
	    }
	}
	
	
}
	

	

