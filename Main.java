package com.ge.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		MakeAverage mAvg = new MakeAverage(); // 우리가 만든 클래스를 인스턴스화시킴
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String currentTxt = sc.nextLine();
			
			if(currentTxt.compareTo("q!")==0)
				break;
			else{
				try{
					int currentVal = Integer.parseInt(currentTxt);
					mAvg.addValue(currentVal);
					System.out.println("현재평균은 "+mAvg.getAverage()+"입니다.");
				}catch(NumberFormatException e){
					System.out.println("잘목 입력 하였습니다.");
				}
			}
		} // end while
		
		System.out.println("\ntemp의 평균은 "+mAvg.getAverage()+"입니다.");
		
		
		
	}
	
	public static void main_older(String[] args) {
		String[] temp = new String[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<temp.length;i++){
			temp[i] = sc.nextLine();
		}
		
		for(String t : temp){
			System.out.println(t);
		}
		
	}
}
