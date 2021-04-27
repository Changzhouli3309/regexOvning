package regexOvning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text_reader {

	/**
	 * return null if file not found
	 * @param path
	 * @return data
	 */
	public static List<String> getData(String path) {

		List<String> records = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(path), "UTF-8");) {
			while (scanner.hasNextLine()) {
				records.add(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		return records;
	}
}
