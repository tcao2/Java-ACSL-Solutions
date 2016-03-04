/*
 * Solutions for the questions
 */
package myPackage;

public class ACSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test_arr = squareUp(0);
		print_arr(test_arr);
	} // end of main
	
	/*
	 * String Manipulation
	 */
	// stringTimes
	private static String stringTimes(String str, int n){
		String output = "";		// Initialize the output String that is empty
		for (int i=0 ;i<n; i++){
			output = output + str;
		}
		return output;
	} // end stringTimes
	
	// frontTimes
	private static String frontTimes(String str, int n){
		String output = "";
		String temp = "";
		if (str.length() <= 3){
			for (int i = 0; i < n; i++){
				output = output + str;
			}
		}
		else {
			temp = str.substring(0,3);
			for (int i = 0; i < n; i++){
				output = output + temp;
			}
		}
		return output;
	} // end frontTimes
	
	private static int countXX(String str){
		int total = 0;
		for (int i = 0; i < str.length() - 1; i++){
			if (str.substring(i,i+2).equals("xx")){
				total++;
			}
		}
		return total;
	} // end countXX
	
	private static boolean doubleX(String str){
		if (str.length() <= 1){
			return false;
		}
		int firstX = str.indexOf('x');
		if (firstX == str.length() - 1) return false; // if the first x is the last char
		else {
			if (str.charAt(firstX + 1) == 'x') return true;
			return false;
		}
	} // end doubleX
	
	private static String stringBits(String str){
		String outString = "";
		for (int i = 0; i < str.length(); i+=2){
			outString = outString + str.charAt(i);
		}
		return outString;
	}// end stringBits
	
	private static String stringSplosion(String str){
		String outString = "";
		for (int i = 0; i <= str.length(); i++){
			outString = outString + str.substring(0,i);
		}
		return outString;
	} // end stringSplosion
	
	private static String stringYak(String str){
		String outString = "";
		for (int i = 0; i < str.length(); i++){
			if (i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 'k'){
				i+=2;
			}
			else outString += str.charAt(i);
		}
		return outString;
	} // End stringYak
	
	/*
	 * Logic
	 */
	private static void fizzBuzz(){
		for (int i = 1; i <= 100; i++){
			if (i%3 == 0 && i %5 == 0) System.out.println("FizzBuzz");
			else if (i%3 == 0) System.out.println("Fizz");
			else if (i%5 == 0) System.out.println("Buzz");
			else System.out.println(i);
		}
	} // End fizzBuzz
	
	// joeyGame
		private static boolean joeyGame(int time, boolean hwDone, boolean momAway ){
			if (time < 22 && (time < 12 | time > 13) && hwDone == true && momAway == false){
				return true;
			}
			else if (momAway == true && (time < 16 | time > 18) && (hwDone == true | hwDone == false)){
				return true;
			}
			else {
				return false;
			}
			//return false; // Please remove this line before starting
		} // End joeyGame
		
		// closeFar starts
		private static boolean closeFar(int a, int b, int c){
			// You code goes here
			int diff_1 = Math.abs(b - a);
			int diff_2 = Math.abs(c - a);
			int diff_3 = Math.abs(c - b);
			if (diff_1 <= 1 && diff_2 >= 2 && diff_3 >=2) return true;
			else if (diff_1 >=2 && diff_2 <=1 && diff_3 >=2) return true;
			return false; // Please remove this line before starting
		} // closeFar ends
		
		// countYZ
		private static int countYZ(String str){
			int count = 0;
			for (int i = 0; i < str.length();i++){
				if ((Character.toLowerCase(str.charAt(i)) == 'y' | Character.toLowerCase(str.charAt(i)) == 'z') && i == (str.length() - 1)){
					count++;
				}
				if (Character.toLowerCase(str.charAt(i)) == 'y' | Character.toLowerCase(str.charAt(i)) == 'z' && i < str.length() - 1 && !Character.isLetter(str.charAt(i+1))){
					count++;
				}
			}
			return count;
		}
		
		// canBalance
		private static boolean canBalance(int[] nums){
			int sum_1 = 0; // init sum of the first half
			int sum_2 = 0; // init sum of the second half
			int j = 0;
			int k = 0;
			for (int i = 0; i < nums.length;i++){
				for (j = 0; j <= i; j++){ // first half
					sum_1+= nums[j];
				}
				for (k = i+1; k < nums.length;k++){
					sum_2+=nums[k];
				}
				if (sum_1 == sum_2) {
					return true;
				}
				else {
					sum_1 = sum_2 = 0;
				}
			}
			return false;
		} // End canBalance
		
		// Series up start
		private static int[] seriesUp(int n){
			int[] outArr = new int[n*(n+1)/2];
			int limit = 1; // The limit of the current pattern
			int i = 0;
			while(i < outArr.length){
				for (int j = 1; j <=limit;j++){
					outArr[i] = j;
					i++;
				}
				if (limit <n) limit++;
			}
			return outArr;
		} // seriesUp ends
		
		// fix34 starts
		private static int[] fix34(int[] nums){
			int curr_index = 0;	// store the current index of the value next to the current 3 that is NOT 4
			int j = 0;
			int temp = 0;
			for (int i = 0; i < nums.length -1;i++){ // Loop through the array till the end
				if (nums[i] == 3 && nums[i+1] != 4){ // if found a 3 and the next elem is NOT a 4
					curr_index = i+1;	// the index of the value that needs to be swapped
					for (j = 0; j < nums.length;j++){
						if (nums[j] == 4 && nums[j-1] != 3) break;	// return the index of the first free 4 (not after a 3)
					}
					temp = nums[curr_index];
					nums[curr_index] = nums[j];
					nums[j] = temp;
				}
			}
			return nums;
		}// fix34 ends
		
		// fix45 starts
		private static int[] fix45 (int[] nums){
			int j = 0;
			int temp = 0;
			for (int i = 0; i < nums.length - 1; i++){
				if (nums[i] == 4 && nums[i+1] != 5){ // If found a 4 and the next elem is NOT a 5
					for (j = 0; j < nums.length;j++){
						if (nums[j] == 5 && j == 0) break;
						else if (nums[j] == 5 && nums[j-1] != 4) break;
					}
					// Swap the values
					swap_nums(nums[i+1],nums[j]); // swap the values
					temp = nums[i+1];
					nums[i+1] = nums[j];
					nums[j] = temp;
				}
			}
			return nums;
			
		} // fix45 ends
		
		// linearIn starts
		private static boolean linearIn(int[] outer, int[] inner){
			int count = 0;
			for (int i = 0; i < inner.length; i++){
				for (int j = 0; j < outer.length; j++){
					if (inner[i] == outer[j]){
						count++;
						break;
					}
				}
			}
			if (count == inner.length) return true;
			return false;
		} //linearIn ends
		
		// SquareUp starts
		private static int[] squareUp(int n){
			
			if (n == 0){
				return null;
			}
			int[] out_arr = new int[n*n]; // the output array
			// Fill the array with all zeros at the beginning
			for (int i = 0; i < out_arr.length;i++){
				out_arr[i] = 0;
			}
			
			int max_val = n; // the max value the series are going up to
			int current_val = 1; // the current value that will be stored into the array
			int j = 0;
			int start_index = out_arr.length - 1; // we will fill the array from right to left
			for (int i = out_arr.length - 1; i >= n-1; i-=n){
				j = i; // start filling out the array so we set j = i
				while(current_val <= max_val){ // fill the array from left to right, increasing order
					out_arr[j] = current_val;
					j--; // left --> right, so the index will decreases every time
					current_val++; // the current value will increase
				}
				max_val--;
				current_val = 1;
			}
			return out_arr;
			
		} // squareUp ends
		
		// swap value starts
		private static void swap_nums(int a, int b){
			int temp; // store a temp value
			temp = a; // store a into temp
			a = b;	// store b into a
			b = temp; // now store temp (which was a) back into b
		} // swap values ends
		
		private static void print_arr(int[] arr){
			if (arr != null){
				for (int i = 0; i < arr.length;i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println("");
			}
			
			else System.out.println("The array is empty!");
			
			
		}

} // end of class
