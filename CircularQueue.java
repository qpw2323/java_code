package com.ge.datastructure;

public class CircularQueue {
	private int[] value;
	
	private int idx_front;
	private int idx_rear;
	
	public CircularQueue(int size){
		value = new int[size];
		idx_front = 0; // 생산자
		idx_rear = 0; // 소비자
	}
	
	private int getNextIndex(int idx){
		return (idx+1) % value.length;
	}
	
	public void putData(int v){
		value[idx_front++] = v;

		// circularQueue 인덱스 구하는 핵심
		idx_front = getNextIndex(idx_front); 
		
		if(idx_rear == idx_front)
			idx_rear = getNextIndex(idx_rear);
	}
	
	public int getData(){
		int result = value[idx_rear];
		
		// rear와 front가 같지 않을 경우에만 인덱스 증가시킨다.
		if(idx_front != idx_rear)
			idx_rear = getNextIndex(idx_rear);

		return result;
	}
	
	
	
}
