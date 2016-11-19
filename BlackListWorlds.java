import java.util.*;
class BlackListWorlds{
		static Set blackedList=new HashSet();
		static{
			blackedList.add("badw1");
			blackedList.add("badw2");
			blackedList.add("badw3");
			blackedList.add("badw4");
		}
	public static void main(String[] agrs){
		String statement="jamil noyda is great man badw4";
		if(hasBlackWorld(statement)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
	public static boolean hasBlackWorld(String s){
		String[] worlds=s.split(" ");
		for(String word:worlds ){
			if(blackedList.contains(word)){
				return true;
			}
			
			
		
		}
		return false;
	}
}