package java_study_1114;

import java.util.Scanner;

public class javaExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 문제 1
	
		int age = 25;
		System.out.println(age);
		
		// 문제 2
		// 3. 상수
		
		// 문제 3
		String h = "Hello, Java!";
		System.out.println(h);
		
		// 문제 4
		
        int a = 10;
        int b = 20; 

        int sum = a + b;
		
		// 문제 5
		double height = 180.5; 
		
		// 문제 6
		System.out.println("이름을 입력하세요 : ");
		String name = scan.next();
		System.out.println("나이를 입력하세요 : ");
		int ages = scan.nextInt();
		System.out.println("안녕하세요, "+name+"님! 당신은 "+ages+"살입니다.");
		
		// 문제 7
		
		// 3번
		
		// 문제 8
	    System.out.print("첫 번째 정수를 입력하세요: ");
	    int d = scan.nextInt();

	    System.out.print("두 번째 정수를 입력하세요: ");
	    int y = scan.nextInt();

	    int plus = d + y;
	    System.out.println("두 정수의 합은: " + plus); 
	    
	    // 문제 9
	    
        String x = "10";
        int y = Integer.parseInt(x);

        System.out.println("문자형 x의 값 : " + x);
        System.out.println("정수형 y의 값 : " + y);
        
        // 문제 10 
        
        // 3번
        
        // 문제 11
        
		
		
		System.out.println("숫자를 입력하세요 : "); 
		int a = scan.nextInt();
		System.out.println("숫자를 입력하세요 : "); 
		int b = scan.nextInt();
		System.out.println("숫자를 입력하세요 : "); 
		int c = scan.nextInt();
		 
		 
		int avg = (a + b + c) / 3;
		System.out.println("입력받은 숫자의 평균은 : "+avg+"입니다.");
		
		// 문제 12
		
		System.out.println("숫자를 입력하세요 : "); 
		int a = scan.nextInt();
		
		

	}

}
