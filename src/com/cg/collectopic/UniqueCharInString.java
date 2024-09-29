package com.cg.collectopic;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharInString {
public static void main(String args[]) {
	Set<Character> set=new HashSet<>();
	String s="Football";
	s=s.toLowerCase();
	for(char c:s.toCharArray()) {
		set.add(c);
	}
	System.out.println(set);
}
}
