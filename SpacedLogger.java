package week_05_assignment;

//	3. Create two classes that implement the Logger interface
 

//	b.  SpacedLogger


public class SpacedLogger implements Logger{

	/*	5. Implement the SpacedLogger methods:
	 *	Note:  The SpacedLogger should add a space or " " between each character of 
	 *	the String argument passed into its methods.
	 */
	
	//	a. If the log method received “Hello” as an argument, it should print H e l l o
	
	@Override
	public void log(String log) {
		
		String wordSeperator = "";
		for (int i = 0; i < log.length(); i++) {
			wordSeperator += log.charAt(i) + " ";
		}
		System.out.println(wordSeperator);
	}

	 //	b. The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)

	@Override
	public void error(String error) {
		
		String wordSeperator = "";
		for (int i = 0; i < error.length(); i++) {
			wordSeperator += error.charAt(i) + " ";
		}
		System.out.println("ERROR:" + " " + wordSeperator);
		
	}
	
	


}
