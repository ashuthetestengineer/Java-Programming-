package dynamicReading;
//A Java Program to read names of continents one word
//at a time from user and print them on console 
import java.util.Scanner;
public class ReadSingleWord {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		//Scanner Class Object and respective reference variable creation
		Scanner continents = new Scanner(System.in);
		//Read Names of Continents
		System.out.println("Enter the Names of Continents in single word One by one: ");
		String cont1 = continents.next();//First Continent
		String cont2 = continents.next();//Second Continent
		String cont3 = continents.next();//Third Continent
		String cont4 = continents.next();//Fourth Continent
		String cont5 = continents.next();//Fifth Continent
		String cont6 = continents.next();//Sixth Continent
		String cont7 = continents.next();//Seven Continent
		
		//Print Names of Continents
		System.out.println("Names of Continents Of the world are: ");
		System.out.println(cont1);
		System.out.println(cont2);
		System.out.println(cont3);
		System.out.println(cont4);
		System.out.println(cont5);
		System.out.println(cont6);
		System.out.println(cont7);
		continents.close();//resource closed
		System.out.println("Main Ends");
		
	}

}
