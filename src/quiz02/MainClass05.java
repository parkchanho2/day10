package quiz02;

import java.util.Scanner;

class test6{
	public void in() {
		
	}
	public int op() {
		Scanner sc= new Scanner(System.in);
		System.out.println("수입력: ");
		int num = sc.nextInt();
		
		return num;
	}
	public void pr() {
		
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		test6 t = new test6();
		
		int a = t.op();
	}
}
