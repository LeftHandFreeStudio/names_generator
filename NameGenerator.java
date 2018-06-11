import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class NameGenerator{
	public static void main(String[] args) throws IOException{
		System.out.println(generateName());
	}

	public static String generateName() throws IOException{
		String filePathFronts = "res/fronts.txt";
		String filePathMid = "res/middles.txt";
		String filePathEnd = "res/ends.txt";
		String name = "";
		BufferedReader file= new BufferedReader(new FileReader(filePathFronts));
		BufferedReader file1 = new BufferedReader(new FileReader(filePathMid));
		BufferedReader file2 = new BufferedReader(new FileReader(filePathEnd));
		String s;
		List<String> lines = new ArrayList<String>();
		while((s = file.readLine()) != null){
			lines.add(s);
		}
		List<String> lines1 = new ArrayList<String>();
		while((s = file1.readLine()) != null){
			lines1.add(s);
		}
		List<String> lines2 = new ArrayList<String>();
		while((s = file2.readLine()) != null){
			lines2.add(s);
		}

		Random r = new Random();
		int fr = r.nextInt(lines.size());
		int mid = r.nextInt(lines1.size());
		int end = r.nextInt(lines2.size());
		
		name = name + lines.get(fr) + lines1.get(mid) + lines2.get(end);

		return name;
	}
}