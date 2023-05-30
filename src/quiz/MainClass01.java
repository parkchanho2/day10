package quiz;

import java.util.Scanner;

class Quiz01{
	public String inputName() {
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		
		System.out.println("이름입력: ");
		name = sc.next();
		
		return name;
	}
	public void print(String name) {
		
		System.out.println("당신이름: " + name);
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		Quiz01 t = new Quiz01();
		String n = t.inputName();
		t.print(n);
		
	}
}
