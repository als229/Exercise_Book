package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);

	public void mainmenu() {
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("성별 : ");
		char gender = sc.next().charAt(0);

		Member mem = new Member(name , age , gender);
		lc.insertMember(mem);

		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();

			if(menuNum == 1) {
				System.out.println(lc.myinfo().toString());
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
		Book[] bList = lc.selectAll();
		for(int i =0; i < bList.length; i++) {
			System.out.println(i + "번째 도서 : " + bList[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.next();
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i =0; i < searchList.length; i++) {
			if(searchList[i] != null) {
				System.out.println("[Book " + searchList[i].toString() + "]");
			}
		}
		
	}
	public void rentBook() {
		selectAll();
		
		System.out.println("대여할 도서 번호 선택 : ");
		int bookNo = sc.nextInt();
		int result = lc.rentBook(bookNo);
		
		switch(result) {
		case 0 : System.out.println("성공적으로 대여 되었습니다."); break;
		case 1 : System.out.println("나이 제한으로 대여 불가능입니다."); break;
		case 2 : System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요"); break;
		
		
		}
		
	}
	
}
