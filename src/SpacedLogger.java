
public class SpacedLogger implements Logger {
	
// I used a different method of spacing on this code rather than iterating with a for loop.
	
	@Override
	public void Log(String Log) {
		System.out.println(Log.toString().replace("", " ").trim());
		
	}

	@Override
	public void Error(String Error) {
		System.out.println("ERROR".replace("", " ").trim() + ":" + " " + Error.toString().replace("", " ").trim());
		
	}

}
