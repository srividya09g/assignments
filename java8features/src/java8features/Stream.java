package java8features;

import java.util.Arrays;
import java.util.List;
import io.javaclass.common.Person;

public class Stream {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("vidya","sri",60),
				new Person("kanth","sri",42),
				new Person("vindhya","rao",51),
				new Person("anu","sri",45),
				new Person("mouni","basu",45)
				);
		people.stream()
		.filter(p -> p.getLastname().startsWith("s"))
		.forEach(p -> System.out.println(p.getFirstname()));
				
	}

}
