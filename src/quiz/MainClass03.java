package quiz;

import java.util.ArrayList;
import java.util.Scanner;

class test3{
	public int op(ArrayList<String> arr) {
		System.out.println(arr.get(0) + arr.get(1));
		System.out.println(Integer.parseInt(arr.get(0)) + Integer.parseInt(arr.get(1)));
		
		int sum;
		sum = Integer.parseInt(arr.get(0)) + Integer.parseInt(arr.get(1));
		
		return sum;
	}
	public ArrayList<String> in() {
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("수입력: ");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		arr.add(num + "");
		arr.add(num1 + "");
	//  arr.add(sc.nextInt()+ "");
		System.out.println(arr);
		
		return arr;
	}
	public void pr(ArrayList<String> arr, int sum) {
		System.out.println(arr.get(0) + "+" + arr.get(1) + "= " +sum);
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		test3 t = new test3();
		ArrayList<String> arr = t.in();
		System.out.println("main arr: " + arr);
		int sum = t.op(arr);
		System.out.println("sum: " + sum);
		t.pr(arr,sum);
	}
}	