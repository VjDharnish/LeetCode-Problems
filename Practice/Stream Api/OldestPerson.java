import java.util.ArrayList;
import java.util.Comparator;

import dto.Person;
public class OldestPerson {
	// FInd Oldest Person from List of Persons
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons =new ArrayList<>();
		persons.add(new Person("Dharun",21));
		persons.add(new Person("Aadhirai",22));
		persons.add(new Person("Kamalesh",21));
		persons.add(new Person("Gokul",25));
		persons.add(new Person("Mathi",29));
		String name = (persons.stream().reduce((a,b)->a.getAge()>b.getAge()? a:b)).orElse(null).getName();
		System.out.println(name);
		//Another wayy
		String older = persons.stream().max(Comparator.comparingInt(Person::getAge)).get().getName();
		System.out.println(older);
		//Another wayy
		String older2 = persons.stream().max(Comparator.comparingInt(Person::getAge)).map(Person::getName).orElse("");
		System.out.println(older2);

	}

}
