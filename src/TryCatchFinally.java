
public class TryCatchFinally {

	public static void main(String[] args) {
		
		try {
			System.out.println(" => " + (1/0));
		}
		catch(ClassCastException cce) {
			cce.printStackTrace();
		}
		finally {
			System.out.println("Action faite systématiquement !");
		}
		
	}

}
