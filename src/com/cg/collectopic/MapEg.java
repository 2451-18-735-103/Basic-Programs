package com.cg.collectopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEg {
 public static void main(String args[]) {
	 Map<Integer,String>  map=new HashMap<>();
	 //add
	 map.put(1, "Manasa");
	 map.put(6, "Lokesh");
	 map.put(3,"LokMan");
	 map.put(4, "keshavi");
	 //get
	System.out.println( map.get(3));
	//update
	map.put(3, "ManLok");
	
	boolean b=map.containsKey(3);
	System.out.println(b);
	boolean c=map.containsValue("Manasa");
	System.out.println(c);
	//displaying map
	
	for(Map.Entry<Integer,String> entry:map.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	//remove
	map.remove(4);
	//displaying only keys(********************************************)
	Set<Integer> s= map.keySet();
	for(Integer l:s) {
		System.out.println(l);
	}
	 
	//sort the map using tree map (here only keys get sorted for sorting values we go for comparator and comparable)
	TreeMap<Integer,String> k=new TreeMap<>(map);
	for(Map.Entry<Integer,String> entry:k.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	//sort using list sort the values
	System.out.println("sort by values");
	List<Map.Entry<Integer, String>> list=new ArrayList<>(map.entrySet());
	Collections.sort(list,Map.Entry.comparingByValue());
	//Collections.sort(list, Collections.reverseOrder(Map.Entry.comparingByValue()));
	for(Map.Entry<Integer,String> entry:list) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	//sort the values
	System.out.println("sort by keys");
	List<Map.Entry<Integer, String>> list2=new ArrayList<>(map.entrySet());
	Collections.sort(list2,Map.Entry.comparingByKey());
	for(Map.Entry<Integer,String> entry:list2) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
 }
}
