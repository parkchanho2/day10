package quiz02;

import java.util.Scanner;

class test4{
	public void op(int num) {
		if(num % 3 == 0) {
			System.out.println("3의배수");
		}else {
			System.out.println("3의배수 아님");
		}
	}
	public int in() {
		Scanner sc = new Scanner(System.in);
		System.out.println("수입력: ");
		int num = sc.nextInt();
		
		return num;
	}
	
}
public class mainClass03 {
	public static void main(String[] args) {
		test4 t = new test4();
		
		int a  = t.in();
		t.op(a);
	}
}
