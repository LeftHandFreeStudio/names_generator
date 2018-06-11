import java.util.ArrayList;
import java.util.Random;

public class RandomNamesFuser{
	private Random r;
	private ArrayList<String> fronts;
	private ArrayList<String> mids;
	private ArrayList<String> ends;

	public RandomNamesFuser(){
		r = new Random();
		loadRescources();
	}

	public String fuseNameElementsRandomly(){
		int fr = r.nextInt(fronts.size());
		int mid = r.nextInt(mids.size());
		int end = r.nextInt(ends.size());
		
		return "" + fronts.get(fr) + mids.get(mid) + ends.get(end);
	}

	public void loadRescources(){
		String filePathFronts = "res/fronts.txt";
		String filePathMid = "res/middles.txt";
		String filePathEnd = "res/ends.txt";
		FileReader reader = new FileReader();
		
		fronts = reader.readFile(filePathFronts);
		mids = reader.readFile(filePathMid);
		ends = reader.readFile(filePathEnd);
	
	}
	
}