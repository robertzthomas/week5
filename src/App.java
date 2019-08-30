
public class App {

	public static void main(String[] args) {
		Logger aterisk = new AteriskLogger();
		aterisk.Log("hola");
		aterisk.Error("too much sauce");
		Logger spaced = new SpacedLogger();
		spaced.Log("conichiwa");
		spaced.Error("not enough sauce");
		} 

}
