import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import dto.Person;

public class SortByAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons =new ArrayList<>();
		persons.add(new Person("Dharun",21));
		persons.add(new Person("Aadhirai",22));
		persons.add(new Person("Kamalesh",21));
		persons.add(new Person("Gokul",25));
		persons.add(new Person("Mathi",29));
		List<String> shortedByAge =persons.parallelStream().sorted(Comparator.comparingInt(Person::getAge)).map(Person::getName).toList();
		System.out.println(shortedByAge);
	}

}
