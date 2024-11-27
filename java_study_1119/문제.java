package java_study_1119;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		
		
		//문제 1

		int 용돈 = 10000;
		용돈 -=3000; //간식구매
		용돈 +=5000; //심부름 보상
		System.out.println("최종 용돈의 값은 :"+용돈);
		
		//문제 2
		
		int 점수 =80;
		점수 +=5; //보너스 점수
		점수 *=2; //더블 점수 이벤트
		System.out.println("최종 점수의 값은 :"+점수);
		
		//문제 3
		
		int 나이=20;
		boolean 면허증소지=true;
		boolean 운전가능=(나이>=18)&&면허증소지;
		System.out.println("운전가능 :"+운전가능);
		
		//문제 4
		
		boolean 면허증소지1= true;
		boolean 운전가능1 =!면허증소지1;
		System.out.println("운전가능 :"+운전가능1);
		
		//문제 5
		
		int a=10;
		int b=5;
		int mul=a*b;
				System.out.println("두 정수의 곱 :"+mul);
				
	    //문제 6
				
	    boolean p=true;
	    boolean q=false;
	    boolean result1 = p&&q;
	    System.out.println("p&&q :"+ result1);
	    
	    //문제 7
	    
	    final double PI =3.14;
	    double radius =5.0;
	    double 원의면적 =(PI*radius*radius);
	    System.out.println("원의면적 :"+원의면적);
	    
	    //문제 8
	    
	    double weight=70.5;
	    double height=1.77;
	    double bmi=(weight/height*height);
	    System.out.println("bmi 수치는 :"+bmi);
	    
	    //문제 9
	    
	    int 대기번호 = 1;
	    System.out.println("다음 번호 :"+대기번호++);
	    System.out.println("다음 번호 :"+대기번호++);
	    System.out.println("최종대기번호는:"+대기번호);
	    
	    //문제 10
	    
		int age = 32;
		int year = 2024;
		int result = 0; 
		
		result = year - (age -= 1);
		System.out.println(result);
	    
	    //문제 11
	    
	    Scanner scan = new Scanner(System.in);
        int obak = 500;
        int bak = 100;
        int change;

        System.out.print("거스름돈을 입력하세요 : ");
        int myMoney = scan.nextInt();

        int obakCount = myMoney / obak;
        change = myMoney % obak;
        int bakCount = change / bak;
        change = change % bak;

        System.out.println("500원 동전의 개수 : " + obakCount);
        System.out.println("100원 동전의 개수 : " + bakCount);
        System.out.println("남은 돈 : " + change + "원");

        scan.close();
	    
	}

}
