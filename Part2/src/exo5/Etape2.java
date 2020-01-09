package exo5;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

class MonthsInYear{
	// a partir d'une année affiche la longueur des mois
	public static String display(int annee) {
		Year year = Year.of(annee);
		System.out.println("En "+year);
		for(Month month : Month.values()) {
			YearMonth ym = YearMonth.of(annee, month);
			
			System.out.printf("Au mois de %s il y a %d jours \n", month.getDisplayName(TextStyle.FULL, Locale.FRENCH),ym.lengthOfMonth());
			
		}
		
		return "";
	}
}

public class Etape2 {

	public static void main(String[] args) {
		MonthsInYear.display(2020);

	}

}
