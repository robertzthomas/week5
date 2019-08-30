
public class AteriskLogger implements Logger {

	@Override
	public void Log(String Log) {
		System.out.println("***" + Log.toString() + "***");
		
	}

	@Override
	public void Error(String Error) {
		System.out.println("**********");
		System.out.println("ERROR" + ":" + " " + Error.toString());
		System.out.println("**********");
		
	}

}
