package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);

	public void mainmenu() {
		while(true) {
			System.out.println("이름 : ");
			String name = sc.next();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("성별 : ");
			char gender = sc.next().charAt(0);

			Member mem = new Member(name , age , gender);

			System.out.println("===== 메뉴 =====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			if(menuNum == 1) {
				lc.myinfo();
			}else if(menuNum == 2) {
				selectAll();
			}else if(menuNum == 3) {
				searchBook();
			}else if(menuNum == 4) {
				rentBook();
			}else if(menuNum == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}

	public void selectAll() {

		for(int i =0; i < length; i++) {
			b
		}
	}
	
	public void searchBook() {
		
	}
	public void rentBook() {
		
	}
	
}
