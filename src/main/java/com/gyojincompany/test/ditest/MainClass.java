package com.gyojincompany.test.ditest;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score score = new Score();
		
		score.setEng(80);
		score.setKor(90);
		score.setMath(70);
		
		Address address = new Address();
		
		address.setAddress("인천광역시");
		address.setPhone("01012345678");
		address.setEmail("abc@abc.com");
		
		Student student = new Student();
		
		student.setName("홍길동");
		student.setAge(23);
		student.setGradeNum(3);
		student.setScore(score);
		student.setAddress(address);
		
		//Student student2 = new Student(address);
		
		
		
	}

}
