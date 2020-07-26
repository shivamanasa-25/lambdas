package Main;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Filter{
	public ArrayList<String> filterListStartingWithLengthThreeAndStartingWithA(String[] s, Predicate<String> predicate) {
		
		ArrayList<String> FL=new ArrayList<String>();
		for(String str:s)
		{
			if(predicate.test(str))
			{
				FL.add(str);
			}
		}
		return FL;
	}

}