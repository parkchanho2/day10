package quiz02;

import java.util.Scanner;

class test{
	public int[] op(int[] arr) {
		if(arr[0] > arr[1]) {
			System.out.println("큰수: " + arr[0]);
		}else {
			System.out.println("큰수: " + arr[1]);
		}
		return arr;
	}
	public int[] in() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수입력: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수입력: ");
		int num2 = sc.nextInt();
		
		int[] arr = {num1,num2};
		return arr;
		
	}
	public void pr(int[] b) {
		System.out.println(b);
	}
}


public class MainClass01 {
	public static void main(String[] args) {
		test t = new test();
		
		int[] a = t.in();
		int[] b = t.op(a);
		t.pr(b);
	}
}
