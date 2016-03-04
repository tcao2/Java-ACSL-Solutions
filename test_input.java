package myPackage;
import java.text.DecimalFormat;
import java.util.Scanner;

public class test_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Hello World");
		System.out.println("Please enter the input...");
		Scanner user_in = new Scanner(System.in);
		String text = user_in.nextLine();
		String[] word_arr = text.split(",");
		System.out.println("The length of the String array is: " + word_arr.length);
		for (int i = 0; i < word_arr.length; i++){
			System.out.print(word_arr[i] + " ");
		}
		System.out.println();
		int[] int_arr = new int[word_arr.length];
		int converted_value = -1;
		for (int i = 0; i < word_arr.length;i++){
			try{
				converted_value = Integer.parseInt(word_arr[i]);
			} catch (NumberFormatException e){
				System.out.println("Unsuccessful conversion!");
			}
			int_arr[i] = converted_value;
			converted_value = -1;
		}
		for (int i = 0; i < int_arr.length; i++){
			System.out.print(int_arr[i] + " ");
		}
		
		DecimalFormat df = new DecimalFormat("#.##");
		double a = 12.3446;
		double b = 12;
		String c = String.format("%.2f", a);
		double d = Double.parseDouble(c);
		System.out.println(d);
		c = String.format("%.3f", b);
		d = Double.parseDouble(c);
		System.out.println(d);
		for (long i = 465868129; i <= 988379794; i++ ){
			System.out.println(i);
		}
		*/
		
		long a = 17;
		double test1 = Math.sqrt(a);
		long test = (long)(Math.sqrt(a));
		long b = test*test;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("test1: " + test1);
		System.out.println("test: " + test);
	}

}
