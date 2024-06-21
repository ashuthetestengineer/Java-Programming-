package dynamicReading;
//A Java Program to read Primitive data values from user and print on console
import java.util.Scanner;


public class ReadPrimitiveData {
	public static void main (String [] args) {
		System.out.println("Main Start");
		Scanner readValue = new Scanner(System.in);
		//Read Byte data value
		System.out.println("Enter a Byte Data Value");
		System.out.println("Byte Data Value = " + readValue.nextByte());
		//Read Short data value
		System.out.println("Enter a Short Data Value");
		
		System.out.println("Short Data  Value = "+readValue.nextShort());
		//Read Integer data value
		System.out.println("Enter a Integer Data Value");
		System.out.println("Integer Data  Value = "+readValue.nextInt());
		
		//Read Long data value
		System.out.println("Enter a Long Data Value");
		System.out.println("Long Data  Value = "+readValue.nextLong());
		
		//Read Float data value
		System.out.println("Enter a Float Data Value");
		System.out.println("Float Data Value = "+readValue.nextFloat());
		

		//Read Double data value
		System.out.println("Enter a Double Data Value");
		System.out.println("Double Data  Value = "+readValue.nextDouble());
		//Read Boolean data value
		System.out.println("Enter a Boolean Data Value");
		boolean data = readValue.nextBoolean();
		System.out.println("Boolean Data Value = " + data );
		//Read Char Data 
		System.out.println("Enter a Char Data Value");
		char c = readValue.next().charAt(0);
		System.out.println("Char Data Value = "+c);
		readValue.close();
		System.out.println("Main Ends");
	}
	
	

}
