package uebung12.examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileReaderWriter {

	public static void main(String[] args) {
		copyFile("inputFile.txt", "outputFile.txt");
	}
	
	private static void copyFile(String inputFilePath, String outputFilePath) {
		File inputFile = new File(inputFilePath);
		File outputFile = new File(outputFilePath);

		try (
				// note resources in round brackets, not curly!
				BufferedReader in = new BufferedReader(new FileReader(inputFile));
				BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));) {

			String line = null;
			while ((line = in.readLine()) != null) {
				out.write(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
