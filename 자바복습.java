package java_study;

import java.util.Scanner;

public class 자바복습 {

	public static void main(String[] args) {
		// 문자는 String, 숫자는 int
//	int age = 27;
//	String address = "대전 유성구 구암동 609-2";
//	String mbti = "ENFP";
//	String name = "김동역";
//	String hobby = "골프";
//	// name ~ mbti : 변수명(이름)
//	// 대문자 x -> 소문자 o (개발자들 약속)
//	System.out.println("나이 : " + age);
//	System.out.println("주소 : " + address);
//	System.out.println("MBTI : " + mbti);
//	System.out.println("이름 : " + name);
//	System.out.println("취미 : " + hobby);
//	
//	// 입력받기
	Scanner scan = new Scanner(System.in);
//	// 입력하신 후, Ctrl + Shift + O 를 눌러주세요
//	
//	System.out.print("이름을 입력해주세요 => ");
//	String n = scan.next();
//	System.out.println("입력하신 이름은 : " +n+ "입니다.");
//	
//	System.out.print("MBTI를 입력해주세요 => ");
//	String m = scan.next();
//	System.out.println("MBTI는 " +m+ "입니다.");
//	
//	System.out.print("나이를 입력해주세요 => ");
//	int a = scan.nextInt();
//	System.out.println("나이는" +a+ "입니다.");
		
	System.out.print("키를 입력해주세요 => ");
	int k = scan.nextInt();
	System.out.println("키는" + k + "입니다.");
	
	System.out.print("취미를 입력해주세요 => ");
	String d = scan.next();
	System.out.println("취미는" + d + "입니다.");
	
	scan.close();

	}

}
