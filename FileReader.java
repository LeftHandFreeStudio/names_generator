import java.util.stream.Stream;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.io.IOException;

public class FileReader{
	public ArrayList<String> readFile(String path){

		ArrayList<String> lines = new ArrayList<String>();
		try (Stream<String> stream = Files.lines(Paths.get(path))) {
			Consumer<String> i = word -> lines.add(word);
			stream.forEach(i);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return lines;
	}
}