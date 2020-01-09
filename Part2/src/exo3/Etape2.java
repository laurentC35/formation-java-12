package exo3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * compter les occurences des mots sherlock.txt en ôtant au 
 * préalable les mots du flux de stop-words-en.json
 * @author Admin stagiaire
 *
 */
public class Etape2 {

	
	public static void main(String[] args) throws IOException {
		
		//lire le fichier sherlock.txt
		Stream<String> lines = Files.lines(Paths.get("sherlock.txt"));
		//lire le fichier stop-words-en.json
		Stream<String> linesJson = Files.lines(Paths.get("stop-words-en.json"));		
		
		Function<String,String> transform = (line) -> line.substring(1, line.length()-1);
		
		// contruire une liste de mot à soustraire
		List<String> jsonWords = linesJson
									.map(transform)
									.flatMap(line -> Stream.of(line.split(",")))
									.map(transform)
									.collect(Collectors.toList());
		
		// compter les occurences
		Map<String, Long> dict = lines.flatMap(line -> Stream.of(line.split(" ")))
				.map(String::toLowerCase)
				.filter(word -> !jsonWords.contains(word))
				.filter(word -> word.length()>1)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		// afficher le top 20
		dict.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.limit(20)
			.forEach((e) -> System.out.printf("%s -> %d \n",e.getKey(),e.getValue()));
	}
}
