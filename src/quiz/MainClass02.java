package quiz;

import java.util.Scanner;

class test2{
	public void inputName() {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		for(int i = 0; i<names.length; i++) {
			System.out.print(i + "첫번째 이름: ");
			names[i] = sc.next();
			
		}
		outputName(names);
			
	}
	public void outputName(String[] n) {
		System.out.println("출력 실행");
		for(int i=0; i< n.length; i++) {
			System.out.println(n[i]);
		}
		System.out.println("========== ");
		for(String name : n) {
			System.out.println(name);
		}
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		test2 t = new test2();
		t.inputName();
	}
}
