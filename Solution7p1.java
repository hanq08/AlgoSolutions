package test.AlgoSolutions;

import java.util.HashMap;
import java.util.Map;

public class Solution7p1 {
	
	static int parseInt(String str){
		Map<Character, Integer> map = new HashMap<>();
		for (int i=0; i<10; i++){
			map.put((char)(48+i), i);
		}
		int neg = 1, first = 0;
		if (str.charAt(0) == '-'){
			neg = -1;
			first = 1;
		}
		int res = 0;
		for (int i=str.length()-1; i>=first; i--){
			int pos = str.length() - i - 1;
			res += map.get(str.charAt(i))*Math.pow(10, pos);
		}
		return res*neg;
	}
	
	public static void main(String[] args){
		
		System.out.println(parseInt("-123403"));
		
	}
}
