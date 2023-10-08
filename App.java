package week_05_assignment;

//	6. Create a class named App that has a main method.

public class App {

	public static void main(String[] args) {


	 //	a. In this class instantiate an instance of each of your logger classes that implement the Logger interface.
	
		Logger astriskLogger = new AstriskLogger();
		
		Logger spacedLogger = new SpacedLogger();
		
	 //	b. Test both methods on both instances, passing in Strings of your choice.
		
		astriskLogger.log("Bad");
		astriskLogger.error("Very Bad");
		
		spacedLogger.log("Bad");
		spacedLogger.error("Very Bad");
	}

}
