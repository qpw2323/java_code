package com.ge.datastructure;

public class CircularQueue {
	private int[] value;
	
	private int idx_front;
	private int idx_rear;
	
	public CircularQueue(int size){
		value = new int[size];
		idx_front = 0; // ������
		idx_rear = 0; // �Һ���
	}
	
	private int getNextIndex(int idx){
		return (idx+1) % value.length;
	}
	
	public void putData(int v){
		value[idx_front++] = v;

		// circularQueue �ε��� ���ϴ� �ٽ�
		idx_front = getNextIndex(idx_front); 
		
		if(idx_rear == idx_front)
			idx_rear = getNextIndex(idx_rear);
	}
	
	public int getData(){
		int result = value[idx_rear];
		
		// rear�� front�� ���� ���� ��쿡�� �ε��� ������Ų��.
		if(idx_front != idx_rear)
			idx_rear = getNextIndex(idx_rear);

		return result;
	}
	
	
	
}
