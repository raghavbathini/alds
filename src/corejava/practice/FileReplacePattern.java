package corejava.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReplacePattern {

	public static void main(String[] args) {
		String old_content = "";
		File input_file = new File("D:\\pralds\\src\\corejava\\practice\\input.txt");
		File output_file = new File("D:\\pralds\\src\\corejava\\practice\\output.txt");
		try {
			BufferedReader file_reader = new BufferedReader(new FileReader(input_file));
			String line = file_reader.readLine();
			while(line!=null) {
				old_content = old_content+line+System.lineSeparator();
				line = file_reader.readLine();
			}
			String new_content = old_content.replaceAll("framework", "test framework");
			FileWriter file_writer = new FileWriter(output_file);
			file_writer.write(new_content);
			file_reader.close();
			file_writer.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
