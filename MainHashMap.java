package com.ge.ex;

import java.util.HashMap;

import com.ge.datastructure.SubjectKey;

public class MainHashMap {
	public static void main_hashmap(String[] args) {
		// hashmap은 순서 유지 X
		HashMap<String, Double> dict = new HashMap<>();
		
//		dict.put("Java", 60.0);
//		dict.put("자료구조", 20.0);
		dict.put(SubjectKey.JAVA, 60.0);
		dict.put(SubjectKey.DATA_STRUCTURE, 25.0);
		
		
		System.out.println("Java : "+dict.get(SubjectKey.JAVA));
		System.out.println("자료구조 :"+dict.get(SubjectKey.DATA_STRUCTURE));
		System.out.println("======");
		for(String key : dict.keySet()){
			System.out.println(key);
		}
		System.out.println("------");
		for(String key : dict.keySet()){
			System.out.println(key + " : " + dict.get(key));
		}
	}
}
