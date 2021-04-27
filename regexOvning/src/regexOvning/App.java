package regexOvning;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	
	static List<String> TextinLine = Text_reader.getData("text.txt");

	public static void main(String[] args) {
		
		System.out.println("1. Hela alfabetet");
		tellLines("[A-Za-z0-9]+");
		System.out.println("\n2. Olas");
		tellLines("Olas");
		System.out.println("\n3. 345");
		tellLines("345");
		System.out.println("\n4. inte hör till [A-Za-z0-9]");
		tellLines("[A-Za-z0-9]{0}");
		System.out.println("\n5. epost-adresser");
		System.out.println("\n6. telefonnummer");
		System.out.println("\n7. fyra likadana bokstäver");
		System.out.println("\n8. registeringsnummer");
		System.out.println("\n9. Hela alfabetet");
		System.out.println("\n10. Hela alfabetet");
		
		


	}
	
	private static boolean rexgexCheck(String toCheck, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(toCheck);
		return matcher.find();
	}
	
	private static void tellLines(String pattern) {
		List<Integer> LineNumbers = new ArrayList<>(); 
		
		for (int i = 0; i < TextinLine.size(); i++) {
			String toCheck = TextinLine.get(i);
			if(rexgexCheck(toCheck, pattern)) {
				LineNumbers.add(i);
			}
		}
		System.out.println(LineNumbers);
	}

}
