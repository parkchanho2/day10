package quiz02;

import java.util.Scanner;

class test6{
	public int in(int n1) {
		if(n1 < 0)  return -n1;
		else return n1;
	}
	public int op() {
		Scanner sc= new Scanner(System.in);
		System.out.println("수입력: ");
		int num = sc.nextInt();
		
		return num;
	}
	public void pr(int b,int a) {
		System.out.println(b + "의 절대값은: " + a + "입니다.");
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		test6 t = new test6();
		
		int a = t.op();
		int b = t.in(a);
		t.pr(b, a);
	}
}
