package com.ge.ex;

import java.util.HashMap;

import com.ge.datastructure.SubjectKey;

public class MainHashMap {
	public static void main_hashmap(String[] args) {
		// hashmap�� ���� ���� X
		HashMap<String, Double> dict = new HashMap<>();
		
//		dict.put("Java", 60.0);
//		dict.put("�ڷᱸ��", 20.0);
		dict.put(SubjectKey.JAVA, 60.0);
		dict.put(SubjectKey.DATA_STRUCTURE, 25.0);
		
		
		System.out.println("Java : "+dict.get(SubjectKey.JAVA));
		System.out.println("�ڷᱸ�� :"+dict.get(SubjectKey.DATA_STRUCTURE));
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
