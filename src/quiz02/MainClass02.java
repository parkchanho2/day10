package quiz02;

import java.util.Scanner;

class test2{
	public void op(int num) {
		if(num % 2==0) {
			System.out.println(num + "짝수");
		}else {
			System.out.println(num + "홀수");
		}
	}
	public int in() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수입력: ");
		int num = sc.nextInt();
		
		return num;
	}
}
public class MainClass02 {
	public static void main(String[] args) {
	 
		test2 t = new test2();
		int a = t.in();
		t.op(a);
		
		
		
		
	}
}
