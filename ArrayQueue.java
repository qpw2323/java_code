package com.ge.datastructure;

import java.util.ArrayList;
/**
 * ArrayList를 이용하여 큐 구현하기
 * 
 * @author go
 *
 */
public class ArrayQueue {

	ArrayList<Integer> value = new ArrayList<>();
	
	public ArrayQueue(){
		
	}

	public void addValue(int v){
		value.add(v);
	}
	
	public int getFirstQueue() throws IndexOutOfBoundsException{
		int result = value.get(0); // 가장 앞에 있는 것을 가져오게 함
		value.remove(0);
		
		return result;
	}
}
