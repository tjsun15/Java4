import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

///////////////////// Problem 1, Problem 4.

		List<String> employeeNames = new ArrayList<String>();

		employeeNames.add("Serena");
		employeeNames.add("Lebron");
		employeeNames.add("Kobe");
		employeeNames.add("Venus");
		employeeNames.add("Michael");

		Set<Integer> ids = new HashSet<Integer>();

		for (String employeeName : employeeNames) {
			// System.out.println(employeeName);

///////////////////// Problem 2, 4

			ids.add(2);
			ids.add(4);
			ids.add(6);
			ids.add(8);
			ids.add(10);
		}

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

///////////////////////// Problem 5
		int i = 0;

		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i++));

		}
		System.out.println(employeeMap);

///////////////////////// Problem 6

		for (Integer key : employeeMap.keySet()) {

			employeeMap.keySet();

			System.out.println(key + "=" + employeeMap.get(key));

		}

////////////////////////// Problem 7

		StringBuilder idsBuilder = new StringBuilder("");

////////////////////////// Problem 8

// 8. Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.

		for (Integer id : ids) {
			idsBuilder.append(id + " - ");
		}
		System.out.println(idsBuilder);
		// System.out.println(ids);
		// 2-4-6-8-10

////////////////////////////Problem 9

		System.out.println(idsBuilder.toString());

////////////////////////////Problem 10

		StringBuilder namesBuilder = new StringBuilder("");

///////////////////////////Problem 11

		for (String employeeName : employeeNames) {
			namesBuilder.append(employeeName + " ");
		}
		
//////////////////////////Problem 12
		
		System.out.println(namesBuilder.toString());

	}
}
