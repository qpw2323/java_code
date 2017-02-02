package com.ge.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		MakeAverage mAvg = new MakeAverage(); // �츮�� ���� Ŭ������ �ν��Ͻ�ȭ��Ŵ
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String currentTxt = sc.nextLine();
			
			if(currentTxt.compareTo("q!")==0)
				break;
			else{
				try{
					int currentVal = Integer.parseInt(currentTxt);
					mAvg.addValue(currentVal);
					System.out.println("��������� "+mAvg.getAverage()+"�Դϴ�.");
				}catch(NumberFormatException e){
					System.out.println("�߸� �Է� �Ͽ����ϴ�.");
				}
			}
		} // end while
		
		System.out.println("\ntemp�� ����� "+mAvg.getAverage()+"�Դϴ�.");
		
		
		
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
