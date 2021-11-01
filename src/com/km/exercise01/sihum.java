package com.km.exercise01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sihum {

	public void plus() {
		int[] num = new int[2];
		for(int i =0; i < num.length; i++) {
			num[i] = inputNumber(i);
		}
		System.out.println("두수의합" + (num[0] + num[1]));
	}

	public int inputNumber(int i) {
		Scanner sc =new Scanner(System.in);
		int inputNumber;
		while(true) {
			try {
				System.out.print((i + 1) + "번째 정수를 입력해라");
				inputNumber = sc.nextInt();
				break;
			}catch(InputMismatchException e) {
				System.out.println("잘못입력했다");
				sc.nextLine();
			}
		}
		return inputNumber;
	}
}
