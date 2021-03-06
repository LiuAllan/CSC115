// NAME: COMPLEX2
// PURPOSE:  create and manipulate Complex Number objects
// AUTHOR:  Allan Liu
// DATE: June 2013
// UPDATED:  January 2014
// CREDITS: none - But many others have written complex number classes before me!

public class Complex2 {
	private int real;
	private int imaginary;

	public Complex2 () {
		this.real = 0;
		this.imaginary = 0;
	}

	public Complex2 (int r, int i) {
		this.real = r;
		this.imaginary = i;
	}
	
	public Complex2 (int r) {
		this.real = r;
		this.imaginary = 0;
	}


	public int getReal() {
		return this.real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return this.imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public Complex2 add(Complex2 val) {
		int newReal = this.real + val.real;
		int newImag = this.imaginary + val.imaginary;
		Complex2 number = new Complex2(newReal , newImag);
		return number; 
	}

	public Complex2 subtract(Complex2 val) {
		int newReal = this.real - val.real;
		int newImag = this.imaginary - val.imaginary;
		Complex2 number = new Complex2(newReal , newImag);
		return number; 
	}

	public Complex2 multiply(Complex2 val) {
		int newReal = (this.real) * (val.real) - (this.imaginary) * (val.imaginary);
		int newImag = (this.imaginary) * (val.real) + (this.real) * (val.imaginary);
		Complex2 number = new Complex2(newReal , newImag);
		return number; 
	}

	public Complex2 divide(Complex2 val) {
		int newReal = ((this.real * val.real) + (this.imaginary * val.imaginary)) / ((val.real * val.real) + (val.imaginary * val.imaginary));
		int newImag = ((this.imaginary * val.real) - (this.real * val.imaginary)) / ((val.real * val.real) + (val.imaginary * val.imaginary));
		Complex2 number = new Complex2(newReal , newImag);
		return number; 
	}

	public String toString() {
		String result = "";
		if(this.imaginary <0) {
			result += real + " " + imaginary + "i";
		}
		
		if(this.imaginary >0) {
			result += real + " + " + imaginary + "i";
		}
		
		if(this.imaginary ==0) {
			result += real;
		}
		return result;
	}

	public static void main(String [] args) {

		System.out.println("Complex Number Tester Output:");

		// Test the new constructor for Real (only) numbers
		Complex2 aReal = new Complex2(423);
		System.out.print("Real Constructor Test: Should Output 423 : ");
		System.out.println(aReal.toString());

		// Instantiate some more complex numbers
		Complex2 oneValue = new Complex2(-3,4);
		Complex2 anotherValue = new Complex2(2,-1);

		// Test add:  oneValue + anotherValue
		System.out.print("Add Tester: Should Output -1 + 3i : ");
		System.out.println(oneValue.add(anotherValue));

		// Test subtract:  oneValue - anotherValue
		System.out.print("Subtract Tester: Should Output -5 + 5i : ");
		System.out.println(oneValue.subtract(anotherValue));

		// Test multiply:  oneValue * anotherValue
		System.out.print("Multiply Tester: Should Output -2 + 11i : ");
		System.out.println(oneValue.multiply(anotherValue));

		// Test divide:  oneValue / anotherValue
		System.out.print("Divide Tester: Should Output -2 + 1i : ");
		System.out.println(oneValue.divide(anotherValue));

	}
}
