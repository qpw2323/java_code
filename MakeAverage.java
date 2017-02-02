package com.ge.datastructure;

import java.util.ArrayList;


/**
 * ���� ���� ���� �Է� �޾� ����� ���ִ� Ŭ�����̴�. <br/>
 * <b>ArrayList</b>�� ��� ������ ���Ѵ��� �� �Է��� �����ϴ�.
 * 
 * @author Go-Eun Seo
 * @version 1.0
 *
 */
public class MakeAverage {
/* ���ڸ� �޾Ƽ� ����� ���ش�.*/
	
	/**
	 * ���� �����ϴ� ����
	 */
	private ArrayList<Integer> val = new ArrayList<>();
	
	// ������
	public MakeAverage(){
		
	}
	
	// �޼���
	/**
	 * ���� �߰��ϴ� �޼ҵ�
	 * @param v - int���� ������
	 */
	public void addValue(int v){
		val.add(v);
	}
	/**
	 * ���� �Էµ� ������ ��ȯ�Ѵ�.
	 * @return
	 */
	public int getSize(){
		return val.size();
	}
	
	/**
	 * �Էµ� ���� �ʱ�ȭ�Ѵ�.
	 */
	public void reset(){
		val.clear();
	}
	
	/**
	 * �Էµ� ������ ����� ��ȯ�Ѵ�.
	 * @return - ��հ�
	 */
	public double getAverage(){
		double result = 0;
		
		for(int v : val){
			result += v;
		}
		result /= val.size();
		
		return result;
	}
	
}
