package quiz02;

import java.util.Scanner;

class test7{
	public void in(int a) {
		//
		String str = null;
		int a1 = 123;
		
		str = str + a1%10; //3
		a1 = a1/10; // 12
		str = str + a1%10; //2
		a1 = a1/10; // 1
		str = str + a1%10; // 1
				
		//str = 321
		
	}
	public int op() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수입력: ");
		int num = sc.nextInt();
		
		return num;
	}
	public void pr() {
		
	}
}

public class MainClass06 {
	public static void main(String[] args) {
		test7 t = new test7();
		
		int a = t.op();
		t.in(a);
		
	}
}
