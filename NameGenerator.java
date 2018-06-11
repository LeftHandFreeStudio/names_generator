import java.util.ArrayList;
import java.lang.Integer;



public class NameGenerator{
	public static void main(String[] args){
		System.out.println(generateName());
		if(args.length > 0  && args[0] != ""){
		System.out.println(generatePassword(Integer.parseInt(args[0])));
		}else{
		System.out.println(generatePassword(8));
		}
	}

	public static String generateName(){
		RandomNamesFuser fuser = new RandomNamesFuser();
		return fuser.fuseNameElementsRandomly();
	}

	public static String generatePassword(int charNumber){
		PasswordGenerator passGen = new PasswordGenerator();
		return passGen.generate(charNumber);
	}
}	