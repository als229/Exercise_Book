package com.km.exercise01;

import java.util.Scanner;

public class FunnyCalc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 0;
		boolean bl = true;
		int num1 = 0;
		int num2 = 0;
		int count = 0;
		int answer = 0;
		int input = 0;
		int tCount = 0;
		int fCount = 0;

		System.out.println("~~~~~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~~~~");
		System.out.println("[ 즐겁게 문제를 푸시다가 지겨우면 0을 누르세요 ~]");
		System.out.println("# 엔터를 누르면 시작합니다.");
		System.out.println("=======================================");
		sc.next();

		System.out.println("# 난이도를 입력하세요! [상, 중, 하]");
		System.out.print(">>");
		String level = sc.next();
		
		while(bl) {
			count++;
		if(level.equals("상")) {
			System.out.println("상급 난이도입니다. 1 ~ 1000 범위로 출제됩니다.");
			max = 1000;
			bl = !bl;

		}else if(level.equals("중")) {
			System.out.println("중급 난이도입니다. 1 ~ 100 범위로 출제됩니다.");
			max = 100;
			bl = !bl;

		}else if(level.equals("하")) {
			System.out.println("하급 난이도입니다. 1 ~ 20 범위로 출제됩니다.");
			max = 20;
			bl = !bl;

		}

		int rNum = (int)(Math.random()*3)+1;
		num1 = (int)(Math.random()*max)+1;
		num2 = (int)(Math.random()*max)+1;
		
		switch(rNum) {

		case 1: System.out.printf("Q%d) %d x %d = ?",count,num1,num2);
		System.out.print(">>");
		input = sc.nextInt();
		answer = num1 * num2;
		break;

		case 2:	System.out.printf("Q%d) %d + %d = ?",count,num1,num2);
		System.out.print(">>");
		input = sc.nextInt();
		answer = num1 + num2;
		break;	

		case 3:	System.out.printf("Q%d) %d - %d = ?",count,num1,num2);
		System.out.print(">>");
		input = sc.nextInt();
		answer = num1 - num2;
		break;	

		}
		
		if(answer == 0) {
			break;
			
		}else if(answer != input){
			System.out.println("# 오답입니다 !");
			fCount++;
			continue;
		}else if(answer == input) {
			System.out.println("# 정답입니다 !");
			tCount++;
			continue;
		}


		}
		System.out.println("================================");
		System.out.printf("# 정답 횟수 : %d회, 오답 횟수 : %d회", tCount, fCount);
	}

}
