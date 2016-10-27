// NAME: ComplexExcerciser1
// ID: V00806981
// AUTHOR: Allan Liu
// DATE: January 21, 2014
import java.util.Scanner;
import java.io.*;
public class ComplexExcerciser1 {
	//Creates an object called com1 and sets the real number to 2 and the imaginary number to 4. Next it prints it out using the toString and sets the real to 4 and imaginary to -5.
	public static void main(String[] args) throws FileNotFoundException {
		Complex1 com1 = new Complex1();
		com1.setReal(2);
		com1.setImaginary(4);
		System.out.println("First complex number:" + com1.toString());
		com1.setReal(4);
		com1.setImaginary(-5);
		System.out.println("Second complex number:" + com1.toString());
		
	//Takes the text file and reads each integer. The initial integer is the amount it will read, whereas the following int that it reads will be entered in the real variable and the 
	//second int will be entered into the imaginary variable.
	//It will then print out the com2 object using the toString method.
		Scanner file = new Scanner(new File("Complexdata.txt"));
		int size = file.nextInt();
		System.out.println("From File:");
		for(int i=0; i<size; i++){
			int real = file.nextInt();
			int imaginary = file.nextInt();
			Complex1 com2 = new Complex1(real, imaginary);
			System.out.println(com2.toString());
		}
	}
}
