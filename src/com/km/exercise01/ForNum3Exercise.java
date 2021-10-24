package com.km.exercise01;

import java.util.Scanner;

public class ForNum3Exercise {

	public static void main(String[] args) {

		method1();



	}
	//		3번 문제 !

	//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	//		문자의 개수와 함께 출력하세요.
	//		ex.
	//		문자열 : application
	//		문자열에 있는 문자 : a, p, l, i, c, t, o, n
	//		중복되지 않는 문자 개수 : 8
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		String result = "문자열에 있는 문자 : " + str.charAt(0) + " ";
		int count = str.length();
		
		for(int i = 1 ; i <= str.length()-1; i++) {
			for(int j = 0; j <= i-1; j++) {
				if(str.charAt(i) == str.charAt(j)) {
					count--;
					break;
				}else if (str.charAt(i) != str.charAt(j) && j == i-1) { // 시바 이 식 이해하는데 1시간 걸렸다. 나는 j == i-1 을 안넣어서 계속 들어가서 aaaaaappppp이런식으로 나왔는데
																		// j == i-1 이 마지막에 한번 넣어준다는 뜻인거 같다. 그래서 다 돌고 문제 없으면 마지막에 한번 넣어주고 끝낸다는 뜻!!!!!!!!!
					result += str.charAt(i) + " ";
				}
			}
			
		}
		System.out.println(result);
		System.out.println("중복되지 않은 글자수 : " + count );
	}
}