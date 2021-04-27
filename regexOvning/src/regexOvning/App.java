package regexOvning;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	
	static String text = Text_reader.getData("text.txt");

	public static void main(String[] args) {

//		System.out.println("1. Hela alfabetet");
//		tellLines("abcdefghijklmnopqrstuvwxyz");
//		System.out.println("\n2. Olas");
//		tellLines("Olas");
//		System.out.println("\n3. 345");
//		tellLines("345");
//		System.out.println("\n4. inte hör till [A-Za-z0-9]");
//		countLines("[^A-Za-z0-9]");
//		System.out.println("\n5. epost-adresser");
//		tellLines("[a-zA-Z0-9_.-/%]+@[a-zA-Z0-9.]+");
//		System.out.println("\n6. telefonnummer");
//		tellLines("[0-9 -/]{8}");
//		System.out.println("\n7. fyra likadana bokstäver");
//		tellLines("([a-zA-Z])\\1{3}");
//		System.out.println("\n8. registeringsnummer");
//		tellLines("[A-Za-z0-9]+[_/]{1,1}[0-9]+");
//		System.out.println("\n9. bara text eller siffror eller mellanslag i");
//		tellLines("^[A-Za-z]+$|^[0-9]+$|^[\\s]+$");
//		System.out.println("\n10. if-satser");
//		tellLines("if\\s*\\(.+\\).+\\;\\s*else.+\\;");
//		System.out.println("\n10. forloopar");
//		tellLines("^for\\s*\\(.*\\;.+\\;.*\\)\\{.*\\}");
		


	}
	
	private static List<MatchWord> findMatchword(String toCheck, String pattern) {
		List<MatchWord> words = new ArrayList<>();
		Pattern p = Pattern.compile(pattern);
		Matcher matcher = p.matcher(toCheck);
		
		while(matcher.find()) {
			if(matcher.group().length()!=0) {
				words.add(new MatchWord(matcher.group(), matcher.start(), matcher.end()));
			}
		}

		return words;
	}
	
	private static void tellLines(String pattern) {
		List<MatchWord> words = findMatchword(text,pattern);
		if(words.size()!=0) {
			words.stream().forEach(System.out::println);
		}else {
			System.out.println("not found.");
		}
		
	}
	
	private static void countLines(String pattern) {
		List<MatchWord> words = findMatchword(text,pattern);
		if(words.size()!=0) {
			System.out.println(words.size());
		}else {
			System.out.println("not found.");
		}
		
	}

}
