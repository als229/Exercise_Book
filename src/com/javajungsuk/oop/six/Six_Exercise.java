package com.javajungsuk.oop.six;


//public class Six_Exercise {
//
//	public static void main(String[] args) {
//		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
//		
//		String str = s.infor();
//		System.out.println(str);
//	}
//}
	
	//6-1
//	public static void exercise1(){
//		
//		String name;
//		int ban;
//		int no;
//		int kor;
//		int eng;
//		int math;
//		
//	}

//6-2 
//class  Student{
//
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//
//	}
//
//	public String infor() {
//
//		return name + ", " +  ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + (kor + eng + math) + ", " + (int)((kor + eng + math)/3f*10 +0.5) /10f;
//	}
//
//}

//6-3
//public class Six_Exercise {
//	 public static void main(String[] args) {
//		Student s = new Student();
//		s.name = "홍길동";
//		s.ban = 1 ;
//		s.no = 1;
//		s.kor = 100;
//		s.eng = 60;
//		s.math = 76;
//		
//		System.out.println("이름 : " + s.name);
//		System.out.println("총점 : " + s.getTotal());
//		System.out.println("평균 : " + s.getAverage());
//	}
//		
//	 public static class Student{
//		 
//		 String name;
//		 int ban;
//		 int no;
//		 int kor;
//		 int eng;
//		 int math;
//		 
//		 Student(){}
//		 
//		 public int getTotal() {
//			 return kor + eng + math;
//		 }
//		 
//		 public float getAverage(){
//			 
//			 return (int)((kor + eng + math)/3f *10 +0.5) /10f;
//		 }
//		 
//	 }
//	
//	
//	
//

//4번 답
//public class Six_Exercise {
//	 static double getDistance(int x, int y, int x1, int y1) {
//		 return Math.sqrt((x - x1)*(x - x1) + (y - y1)*(y - y1));
//	 }
//	public static void main(String[] args) {
//		System.out.println(getDistance(1, 1, 2, 2));
//		
//	}
//}


//6-6
//class MyPoint{
//	int x;
//	int y;
//
//	MyPoint(int x , int y){
//		this.x = x;
//		this.y = y;
//	}
//	public double getDistance(int x1, int y1) {
//
//		return Math.sqrt((x - x1)*(x - x1) + (y - y1)*(y - y1));
//	}
//}
//
//public class Six_Exercise {
//	public static void main(String[] args) {
//		MyPoint p = new MyPoint(1, 1);
//		
//		System.out.println(p.getDistance(2, 2));
//
//	}
//}

//6-18
//public class Six_Exercise {
//	
//	public static boolean isNumber(String str) {
//		if (str == null || str == "") {
//			return false;
//		}
//		
//		for(int i = 0; i <= str.length()-1; i++) {
//			char ch = str.charAt(i) ;
//		
//			if(ch < '0' || '9' < ch) {
//				return false;
//			} 
//		}
//		return true;
//	}
//	
//	public static void main(String[] args) {
//		String str = "123";
//		System.out.println(str + "는 숫자입니까?" + isNumber(str));
//		
//		str = "1234o";
//		System.out.println(str + "는 숫자입니까? " + isNumber(str));
//		
//	}
//}


//6-17
public class Six_Exercise {
	public static void main(String[] args) {
		
		
	}
}




