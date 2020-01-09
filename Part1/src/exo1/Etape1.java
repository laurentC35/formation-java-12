package exo1;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Etape1 {
	
	protected static Runnable runnable = () -> {System.out.println("Exo1.Etape1");};
	
	public static void main(String[] args) {
	
		String[] students = {"Ludovic","Laurent","Fabrice","Mathieu","Olivier","Benjamin","Betty","Lo�c","Nicolas","Simon"};
		
		/**
		 * But de la classe : cr�e un poll de thread,
		 * On peut le remplir de runnable, on les execute par paquet
		 * une fois shutdown, on ne peut plus rien faire
		 */
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.submit(runnable);
		service.shutdown();
		
		System.out.println("Non Tri�e");
		Arrays.asList(students).forEach(System.out::println);
		
		Arrays.sort(students, (student1,student2) -> student1.compareTo(student2));

		System.out.println("Tri�e");
		Arrays.asList(students).forEach(System.out::println);
	}

}
