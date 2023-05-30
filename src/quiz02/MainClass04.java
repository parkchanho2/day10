package quiz02;

import java.util.Scanner;

class test5{
	public int in(int num) {
		int num1 = 0;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) num1++;
		}
		return num1;
	}
	public int op() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수입력: ");
		int num = sc.nextInt();
		
		return num;
	}
	public void pr(int a) {
		if(a==2) {
			System.out.println("소수");
		}else {
			System.out.println("소수아님");
		}
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		test5 t = new test5();
		int a = t.op();
		int b = t.in(a);
		t.pr(b);
		
	}
}
