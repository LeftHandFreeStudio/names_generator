import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;

public class PasswordGenerator{
	private Random r;
	public PasswordGenerator(){
		r = new Random();
	}

	public String generate(int charNumber){
	ArrayList<Integer> password = new ArrayList();
	password.add(r.nextInt(10) + 48);
	password.add(r.nextInt(16) + 65);
	password.add(r.nextInt(26) + 97);
	
	for(int i = 3; i < charNumber; i++){
		int decider = r.nextInt(3);
		if(decider == 0){
		password.add(r.nextInt(10) + 48);
		}else if(decider ==1){
		password.add(r.nextInt(16) + 65);
		}else{
		password.add(r.nextInt(26) + 97);
		}
	}
	Collections.shuffle(password);
	char[] passwordChars = new char[charNumber];
	for(int i = 0;	 i < charNumber; i++){
		int temp = password.get(i);
		passwordChars[i] = (char) temp;
	}
	
	return new String(passwordChars);
	}

}