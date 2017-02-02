package com.ge.datastructure;

import java.util.ArrayList;


/**
 * 여러 개의 값을 입력 받아 평균을 내주는 클래스이다. <br/>
 * <b>ArrayList</b>를 썼기 때문에 무한대의 값 입력이 가능하다.
 * 
 * @author Go-Eun Seo
 * @version 1.0
 *
 */
public class MakeAverage {
/* 숫자를 받아서 평균을 내준다.*/
	
	/**
	 * 값을 저장하는 변수
	 */
	private ArrayList<Integer> val = new ArrayList<>();
	
	// 생성자
	public MakeAverage(){
		
	}
	
	// 메서드
	/**
	 * 값을 추가하는 메소드
	 * @param v - int형의 데이터
	 */
	public void addValue(int v){
		val.add(v);
	}
	/**
	 * 현재 입력된 갯수를 반환한다.
	 * @return
	 */
	public int getSize(){
		return val.size();
	}
	
	/**
	 * 입력된 값을 초기화한다.
	 */
	public void reset(){
		val.clear();
	}
	
	/**
	 * 입력된 값들의 평균을 반환한다.
	 * @return - 평균값
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
