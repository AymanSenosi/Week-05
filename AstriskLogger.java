package week_05_assignment;


//	3. Create two classes that implement the Logger interface



//	a.  AsteriskLogger


public class AstriskLogger implements Logger {
	
	/*	4. Implement the AsteriskLogger methods:
	 *	Note:  The AsteriskLogger will use the asterisk or "*".
	 */
	
	/*	a. The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side 
	 *	of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).
	 */
	
	@Override
	public void log(String log) {
		
		System.out.println("***" + log + "***");
		
	}
	
	
	/*	b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, 
	 *	with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, 
	 *	the following should be printed:
	 *
	 *		****************
	 *	   ***Error: Hello***
	 * 		****************
	 */

	@Override
	public void error(String error) {
		
		String astrisk = "*";
		System.out.println("****" + astrisk.repeat(error.length()) + "****");
		System.out.println(" ***" + error + "***");
		System.out.println("****" + astrisk.repeat(error.length()) + "****");
		
	}
}
