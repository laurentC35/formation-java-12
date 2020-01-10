package exo2.calendrier;

import java.time.LocalDate;
import java.time.Period;

public class AppMain {

	public static void main(String[] args) {
		if(args.length == 3) {

			final int dayOfMonth = Integer.valueOf(args[0]);
			final int month = Integer.valueOf(args[1]);
			final int year = Integer.valueOf(args[2]);
			
			LocalDate birthday = LocalDate.of(year, month, dayOfMonth);
			LocalDate today = LocalDate.now();
			Period period = Period.between(birthday, today);
			System.out.println("age = "+period.getYears()+" ans !");
		} else {
			System.err.println("USAGE :java --module exo2.calendrier.AppMain <jour> <mois> <annee>");
		}

	}

}
