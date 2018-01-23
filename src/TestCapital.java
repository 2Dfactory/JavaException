import com.test.exception.NombreHabitantException;
import com.test.testException.Capital;
import com.test.testException.Ville;

public class TestCapital {

	public static void main(String[] args) {

		try {
			Ville cap1 = new Capital("Marseille", 0, "France", true);
			System.out.println(cap1.decrisToi());
		} catch (NombreHabitantException e) {
			e.printStackTrace();
		}

	}

}
