package exo3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Etape1 {

	public static void main(String[] args) {
		List<String> prenoms = Arrays.asList("Ludovic","Laurent","Fabrice","Mathieu","Olivier","Benjamin","Betty","Loïc","Nicolas","Simon");

		
		prenoms.stream()
			.map(String::toUpperCase)
			.filter(p -> p.length() <7)
			.forEach(p -> System.out.println(" - "+p));
		
		
		List<String> resultats = prenoms.stream()
				.map(p -> p.toLowerCase())
				.filter(p -> p.startsWith("l"))
				.collect(Collectors.toList());
		
		resultats.stream().forEach(System.out::println);
	}

}
