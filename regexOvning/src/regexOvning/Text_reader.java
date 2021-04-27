package regexOvning;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Text_reader {

	/**
	 * return null if file not found
	 * @param path
	 * @return data
	 */
	public static String getData(String path) {

		String record = "";
		try (Scanner scanner = new Scanner(new File(path), "UTF-8");) {
			while (scanner.hasNextLine()) {
				record+=scanner.nextLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		return record;
	}
}
