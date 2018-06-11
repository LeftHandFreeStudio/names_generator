import java.util.ArrayList;
import java.lang.Integer;



public class NameGenerator{
	public static void main(String[] args){
		//generate name
		System.out.println(generateName());

		//generate password but first check if args are passed
		// possible further addition of checking if int bigger than n passed
		if(args.length > 0  && args[0] != ""){
		int charLength = Integer.parseInt(args[0]);
		System.out.println(generatePassword(charLength));
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