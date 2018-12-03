/**Three recursive problems.
 * Add your code to the three functions given below.
 * Do not change any part of the function headers (name, parameters, or return type).
 * Do not change any part of main.
 */

/**
 * @author joey pham
 * @date 24 September 2018
 * @desciption has 3 functions: binary to decimal, reverse fibonacci, and add all the numbers within a string of numbers
 */
public class Lab4 {	public static void main( String[] args ) {		if( addDigits( 428 ) == 14 ) {			System.out.println( "addDigits1 is correct!" );		}		if( revFibonacci( 0, 1, 1, 5 ) == 5 ) {			System.out.println( "revFib1 is correct!" );		}			if( binToDec( "1101100" ) == 108 ) {			System.out.println( "binToDec1 is correct!" );		}
		if( addDigits( 321 ) == 6 ) {			System.out.println( "addDigits2 is correct!" );		}		if( revFibonacci( 0, 1, 1, 10 ) == 55 ) {			System.out.println( "revFib2 is correct!" );		}			if( binToDec( "1011101" ) == 93 ) {			System.out.println( "binToDec2 is correct!" );		}	}
		/**Finds the sum of the digits of num	 * @param num value to find the sum of	 * @return the sum of the digits	 */	public static int addDigits( int num ) {
		if ( num != 0 ) { // if the parameter is not 0
			// if the digit is 123, will first return the 3. then passes in the num without the last digit
			// would pass in 12, then adds 2. lastly passes in 1 and adds it. 
			// if num is 1 digit long, it won't pass num / 10 after that because int ( 1digitnum / 10 ) == 0
			return ( ( num % 10 ) + ( addDigits( num / 10 ) ) );
		} else { // return 0 if it parameter is 0
			return 0;
		}	}
		/**Finds the nth Fibonacci value	 * @param f1 n-2 Fibonacci value	 * @param f2 n-1 Fibonacci value	 * @param c  counter	 * @param n  the number c should count up to	 * @return  the nth Fibonacci value  	 */	public static int revFibonacci( int f1, int f2, int c, int n ) { // 0 1 1 5
		if ( c != n ) { // basically a loop saying if its not at the end yet
			c = c + 1; // increment counter
			return revFibonacci( f2, ( f1 + f2 ), c, n ); // add the previous number to the sum of the previous 2
		} else { // after looping appropriate times
			return f2;  // returns the previous number
		}	}
		/**Converts a binary string to decimal	 * @param bin the binary string	 * @return the decimal value 	 */	public static int binToDec( String bin ) {
		if ( bin.length() > 1 ) { // if number is longer than 1 digit
			if ( bin.charAt( 0 ) == '1' ) { // if the left most digit in the number is 1, add to the dec value
				int num = 2;
				// my exponent function
				for (int i = 0; i < bin.length() - 2; i++) { // only loops if 2^2 or higher b/c 2^1 == 2
					num = num * 2;
				}
				return num + binToDec( bin.substring( 1 ) ); // returns first value and keeps going through the rest of the string
			} else { // if left most digit is 0
				return binToDec( bin.substring( 1 ) ); // return the number without the 0 in front
			}
		} else { // if the number is 1 digit long
			return ( Integer.parseInt( bin ) ); // return the digit, which is either 1 or 0
		}	}}