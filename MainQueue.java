package com.ge.ex;


import java.util.Stack;

import com.ge.datastructure.ArrayQueue;

public class MainQueue {

	public static void main_queue(String[] args) {
		// stack�� ���� ���߿� ���� ���� ���� ���� (LIFO)
		// �ϳ��� ž ������ ���ñ����ΰ���
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(40);

		// �ڹ��� �ֻ��� �ڷ��� Object
		Object object = new Object(); 
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		// �ڹٿ��� ť�� �߻�Ŭ�����̹Ƿ� ���� ������ �ʿ�
		
		System.out.println("--------------");
		ArrayQueue aQueue = new ArrayQueue();
		aQueue.addValue(10);
		aQueue.addValue(20);
		aQueue.addValue(40);
		
		System.out.println(aQueue.getFirstQueue());
		System.out.println(aQueue.getFirstQueue());
		System.out.println(aQueue.getFirstQueue());
		try{
			System.out.println(aQueue.getFirstQueue());
		}catch(IndexOutOfBoundsException e){
			System.out.println("�����Ͱ� �� �����ϴ�.");
		}
		
		/*
		Queue<Integer> que = new Queue<Integer>() {
			
			@Override
			public <T> T[] toArray(T[] arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean retainAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean remove(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean containsAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean contains(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean addAll(Collection<? extends Integer> arg0) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Integer remove() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer poll() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Integer peek() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean offer(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Integer element() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean add(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}
		}; */
	}
}
