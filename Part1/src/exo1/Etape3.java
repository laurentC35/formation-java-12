package exo1;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Formatter{
	String format(String format, Object... objects);
}

public class Etape3 {
	
	public static void forEach(List<String> strings, Formatter formatter) {
		for(String string : strings) {
			System.out.println(formatter.format(" - %s -", string));
		}
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","2","3");
		forEach(list, String::format); // String::format respect l'interface Formatter
		forEach(list, (format, strings) -> String.format(format, strings));
		

	}

}
