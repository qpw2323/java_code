package com.ge.datastructure;

import java.util.ArrayList;
/**
 * ArrayList�� �̿��Ͽ� ť �����ϱ�
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
		int result = value.get(0); // ���� �տ� �ִ� ���� �������� ��
		value.remove(0);
		
		return result;
	}
}
