import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ReverseVowel {
//	static{
//		List<Character> vowels =  new ArrayList<>();
//		vowels.add('a');
//		vowels.add('e');
//		vowels.add('u');
//		vowels.add('i');
//		vowels.add('o');
//	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		List<Character> vowels =  new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('u');
		vowels.add('i');
		vowels.add('o');
		
		int i = 0;
		int j = s.length() -1;
		while (i < j){
			if (vowels.contains(s.charAt(i)) && vowels.contains(s.charAt(j))){
				char temp = s.charAt(i);
				sb.setCharAt(i, s.charAt(j));
				sb.setCharAt(j, temp);
				i++;
				j--;
			} 
			if (! vowels.contains(s.charAt(i))){
				i++;
			}
			if (! vowels.contains(s.charAt(j))){
				j--;
			}
		}
		
		System.out.println(sb.toString());
	}
	
}
