package exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ConcurrentModificationException;

public class FileReaderSAmple {
	public static void main(String[] args) throws IOException {
		File f = new File("/Users/gurupj/Desktop/Text.txt");
		FileReader fr = new FileReader(f);
		int t = 0;

		while ((t = fr.read()) != -1) {
			// System.out.println((char) (t) + " " + t);
			System.out.println((char) (t));
		}

	}
}
