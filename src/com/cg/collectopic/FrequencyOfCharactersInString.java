package com.cg.collectopic;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharactersInString {
   public static void main(String args[]) {
	   String sentence ="This is so good for health";
	   sentence=sentence.replaceAll("\\s+", "");
	   sentence=sentence.toLowerCase();
	   Map<Character,Integer> map=new HashMap<>();
	   for(char ch:sentence.toCharArray()) {
		   if(map.get(ch)==null) {
			   map.put(ch, 1);
		   }
		   else {
			   map.put(ch, map.get(ch)+1);
		   }
	   }
	   for(Map.Entry<Character,Integer> entry:map.entrySet()) {
		   System.out.println("letter  "+entry.getKey()+" Frequence:"+entry.getValue());
		 
	   }
   }
}
